package com.marvin.sysadmin.service.impl;

import com.marvin.sysadmin.entity.auto.School;
import com.marvin.sysadmin.mapper.auto.SchoolMapper;
import com.marvin.sysadmin.service.ISchoolService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学校表 服务实现类
 * </p>
 *
 * @author marvin
 * @since 2022-08-08
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements ISchoolService {

}
