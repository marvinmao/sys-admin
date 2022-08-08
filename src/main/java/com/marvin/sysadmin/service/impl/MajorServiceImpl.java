package com.marvin.sysadmin.service.impl;

import com.marvin.sysadmin.entity.auto.Major;
import com.marvin.sysadmin.mapper.auto.MajorMapper;
import com.marvin.sysadmin.service.IMajorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专业表 服务实现类
 * </p>
 *
 * @author marvin
 * @since 2022-08-08
 */
@Service
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements IMajorService {

}
