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

    @RequestMapping("/count")
    public Integer getCount() {
        int count = adminServiceImpl.mntDeployCount();
        System.out.println("count : " + count);
        return count;
    }
}
