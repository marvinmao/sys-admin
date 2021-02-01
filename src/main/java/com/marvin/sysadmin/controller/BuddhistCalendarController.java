package com.marvin.sysadmin.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marvin.sysadmin.common.Constants;
import com.marvin.sysadmin.common.ResultJson;
import com.marvin.sysadmin.entity.auto.BuddhistCalendar;
import com.marvin.sysadmin.pojo.BuddhistCalendarParam;
import com.marvin.sysadmin.service.IBuddhistCalendarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 信息表 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2021-01-29
 */
@RestController
@RequestMapping("/buddhist-calendar")
@Api(tags = "信息相关接口")
public class BuddhistCalendarController {

    private Logger logger = LoggerFactory.getLogger(BuddhistCalendarController.class);

    @Autowired
    private IBuddhistCalendarService buddhistCalendarServiceImpl;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation("插入一条记录")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "gregorianDate", value = "阳历日期", required = true),
            @ApiImplicitParam(dataType = "string", name = "lunarDate", value = "阴历日期", required = true),
            @ApiImplicitParam(dataType = "string", name = "memorialDay", value = "纪念日", required = true),
            @ApiImplicitParam(dataType = "string", name = "solarTerms", value = "节气", required = true)
    })
    public ResultJson save(HttpServletRequest request, @RequestBody BuddhistCalendarParam param) {
        logger.info("save start param {}", JSON.toJSONString(param));
        try {
            BuddhistCalendar entity = new BuddhistCalendar();
            BeanUtils.copyProperties(param, entity);
            boolean save = buddhistCalendarServiceImpl.save(entity);
            logger.info("save end {}", JSON.toJSONString(save));
            return ResultJson.success().add("save", save);
        } catch (Exception e) {
            logger.error("操作失败：{}", e.getMessage());
            return ResultJson.failure();
        }
    }

    @RequestMapping(value = "/saveBatch", method = RequestMethod.POST)
    @ApiOperation("插入（批量）")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "gregorianDate", value = "阳历日期", required = true),
            @ApiImplicitParam(dataType = "string", name = "lunarDate", value = "阴历日期", required = true),
            @ApiImplicitParam(dataType = "string", name = "memorialDay", value = "纪念日", required = true),
            @ApiImplicitParam(dataType = "string", name = "solarTerms", value = "节气", required = true)
    })
    public ResultJson saveBatch(HttpServletRequest request, @RequestBody List<BuddhistCalendarParam> params) {
        logger.info("saveBatch start param {}", JSON.toJSONString(params));
        if (CollectionUtils.isEmpty(params)) {
            return ResultJson.failure(Constants.PARAM_ERROR, Constants.PARAM_ERROR_MSG);
        }

        try {
            List<BuddhistCalendar> entityList = new ArrayList<>();
            params.forEach(param -> {
                BuddhistCalendar entity = new BuddhistCalendar();
                BeanUtils.copyProperties(param, entity);
                entityList.add(entity);
            });
            boolean save = buddhistCalendarServiceImpl.saveBatch(entityList);
            logger.info("saveBatch end {}", JSON.toJSONString(save));
            return ResultJson.success().add("saveBatch", save);
        } catch (Exception e) {
            logger.error("操作失败：{}", e.getMessage());
            return ResultJson.failure();
        }
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ApiOperation("分页列表-信息")
    public ResultJson page(HttpServletRequest request, @RequestBody BuddhistCalendarParam param) {
        logger.info("page start param {}", JSON.toJSONString(param));
        try {
            IPage<BuddhistCalendar> page =
                    buddhistCalendarServiceImpl.page(new Page<>(param.getCurrentPage(), param.getPageSize()), null);
            logger.info("page end {}", JSON.toJSONString(page));
            return ResultJson.success().add("page", page);
        } catch (Exception e) {
            logger.error("操作失败：{}", e.getMessage());
            return ResultJson.failure();
        }
    }

}
