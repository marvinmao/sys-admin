package com.marvin.sysadmin.service.impl;

import com.marvin.sysadmin.entity.auto.University;
import com.marvin.sysadmin.mapper.auto.UniversityMapper;
import com.marvin.sysadmin.service.IUniversityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 院校信息 服务实现类
 * </p>
 *
 * @author marvin
 * @since 2022-08-10
 */
@Service
public class UniversityServiceImpl extends ServiceImpl<UniversityMapper, University> implements IUniversityService {

}
