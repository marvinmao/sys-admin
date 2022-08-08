package com.marvin.sysadmin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marvin.sysadmin.common.BaseReqParam;
import com.marvin.sysadmin.common.ResultJson;
import com.marvin.sysadmin.entity.auto.PreviousYears;
import com.marvin.sysadmin.service.impl.PreviousYearsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 往年投档情况 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2022-08-08
 */
@RestController
@RequestMapping("/previous-years")
@Api(value = "往年投档情况", tags = {"往年投档情况"})
public class PreviousYearsController {

    @Autowired
    private PreviousYearsServiceImpl previousYearsService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ApiOperation(value = "分页查询", httpMethod = "POST")
    public ResultJson page(HttpServletRequest request, @RequestBody BaseReqParam param) {
        try {
            QueryWrapper<PreviousYears> queryWrapper = new QueryWrapper();
            IPage<PreviousYears> page =
                    previousYearsService.page(new Page<>(param.getCurrentPage(), param.getPageSize()), queryWrapper);
            return ResultJson.success().add("page", page);
        } catch (Exception e) {
            return ResultJson.failure();
        }
    }

}
