package com.marvin.sysadmin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marvin.sysadmin.common.BaseReqParam;
import com.marvin.sysadmin.common.ResultJson;
import com.marvin.sysadmin.entity.auto.RecruitStudentsPlan;
import com.marvin.sysadmin.service.impl.RecruitStudentsPlanServiceImpl;
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
 * 招生计划 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2022-08-08
 */
@RestController
@RequestMapping("/recruit-students-plan")
@Api(value = "招生计划", tags = {"招生计划"})
public class RecruitStudentsPlanController {

    @Autowired
    private RecruitStudentsPlanServiceImpl RecruitStudentsPlanService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ApiOperation(value = "分页查询", httpMethod = "POST")
    public ResultJson page(HttpServletRequest request, @RequestBody BaseReqParam param) {
        try {
            QueryWrapper<RecruitStudentsPlan> queryWrapper = new QueryWrapper();
            IPage<RecruitStudentsPlan> page =
                    RecruitStudentsPlanService.page(new Page<>(param.getCurrentPage(), param.getPageSize()), queryWrapper);
            return ResultJson.success().add("page", page);
        } catch (Exception e) {
            return ResultJson.failure();
        }
    }

}
