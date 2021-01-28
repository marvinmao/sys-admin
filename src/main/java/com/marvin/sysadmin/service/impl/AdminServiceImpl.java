package com.marvin.sysadmin.service.impl;

import com.marvin.sysadmin.mapper.AdminMapper;
import com.marvin.sysadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: marvinmao
 * @Date: 2021/1/27
 * @Description:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int mntDeployCount() {
        return adminMapper.mntDeployCount();
    }
}
