package com.marvin.sysadmin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.marvin.sysadmin.common.ResultJson;
import com.marvin.sysadmin.entity.auto.ProvinceAllAreas;
import com.marvin.sysadmin.mapper.SubjectsInfoExtMapper;
import com.marvin.sysadmin.service.IProvinceAllAreasService;
import com.marvin.sysadmin.service.ISubjectsInfoService;
import com.marvin.sysadmin.vo.MenuProvinceAllAreasVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 高考科目分类信息 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2022-08-15
 */
@RestController
@RequestMapping("/subjects-info")
@Api(value = "省份科目信息接口", tags = {"省份科目信息接口"})
public class SubjectsInfoController {

    private Logger logger = LoggerFactory.getLogger(SubjectsInfoController.class);

    @Autowired
    private IProvinceAllAreasService provinceAllAreasServiceImpl;

    @Autowired
    private ISubjectsInfoService subjectsInfoServiceImpl;

    @Autowired
    private SubjectsInfoExtMapper subjectsInfoExtMapper;

    @GetMapping(value = "/provinceSubjects")
    @ApiOperation(value = "省份科目查询", httpMethod = "GET")
    public ResultJson provinceSubjects(HttpServletRequest request) {
        try {
            QueryWrapper<ProvinceAllAreas> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("ParentId", 0);
            queryWrapper.orderByAsc("ParentPath");
            List<ProvinceAllAreas> list = provinceAllAreasServiceImpl.list(queryWrapper);
            List<MenuProvinceAllAreasVo> vos = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(entity -> {
                    MenuProvinceAllAreasVo vo = new MenuProvinceAllAreasVo();
                    vo.setProvinceCode(entity.getParentPath());
                    vo.setProvinceName(entity.getName());
                    vo.setProvinceShortName(entity.getShortName());
                    vo.setSubjectsInfoVoList(subjectsInfoExtMapper.listByProCode(entity.getParentPath()));
                    vos.add(vo);
                });
            }
            return ResultJson.success().add("list", vos);
        } catch (Exception e) {
            logger.error("操作失败：{}", e.getMessage());
            return ResultJson.failure();
        }
    }
}
