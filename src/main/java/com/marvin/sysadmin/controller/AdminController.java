package com.marvin.sysadmin.controller;

import com.marvin.sysadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: marvinmao
 * @Date: 2021/1/27
 * @Description:
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminServiceImpl;

    @RequestMapping("/get_count")
    public Integer getCount() {
        return adminServiceImpl.mntDeployCount();
    }
}
