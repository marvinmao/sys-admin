package com.marvin.sysadmin.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marvin.sysadmin.entity.auto.MntDeploy;
import com.marvin.sysadmin.service.IMntDeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 部署管理 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2021-01-28
 */
@RestController
@RequestMapping("/mnt-deploy")
public class MntDeployController {


    @Autowired
    private IMntDeployService mntDeployServiceImpl;

    @RequestMapping("/list")
    public String getCount() {
        List<MntDeploy> list = mntDeployServiceImpl.list();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/page")
    public String page() {
        // todo
        IPage<MntDeploy> page = mntDeployServiceImpl.page(new Page<>(2, 1));
        return JSON.toJSONString(page);
    }
}
