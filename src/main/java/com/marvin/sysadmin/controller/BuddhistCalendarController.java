package com.marvin.sysadmin.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marvin.sysadmin.common.ResultJson;
import com.marvin.sysadmin.entity.auto.BuddhistCalendar;
import com.marvin.sysadmin.pojo.BuddhistCalendarParam;
import com.marvin.sysadmin.service.IBuddhistCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 佛历信息表 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2021-01-29
 */
@RestController
@RequestMapping("/buddhist-calendar")
public class BuddhistCalendarController {

    private Logger logger = LoggerFactory.getLogger(BuddhistCalendarController.class);

    @Autowired
    private IBuddhistCalendarService buddhistCalendarServiceImpl;

    @RequestMapping("/page")
    public ResultJson page(HttpServletRequest request, @RequestBody BuddhistCalendarParam param) {
        try {
            IPage<BuddhistCalendar> page =
                    buddhistCalendarServiceImpl.page(new Page<>(param.getCurrentPage(), param.getPageSize()), null);
            return ResultJson.success().add("page", page);
        } catch (Exception e) {
            logger.error("操作失败：{}", e);
            return ResultJson.failure();
        }
    }

}
