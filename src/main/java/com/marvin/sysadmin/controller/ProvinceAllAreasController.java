package com.marvin.sysadmin.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marvin.sysadmin.common.ResultJson;
import com.marvin.sysadmin.entity.auto.ProvinceAllAreas;
import com.marvin.sysadmin.pojo.ProvinceAllAreasParam;
import com.marvin.sysadmin.service.impl.ProvinceAllAreasServiceImpl;
import com.marvin.sysadmin.vo.MenuProvinceAllAreasVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author marvin
 * @since 2022-07-23
 */
@RestController
@RequestMapping("/province-all-areas")
@Api(value = "省市区接口", tags = {"省市区接口"})
public class ProvinceAllAreasController {

    private Logger logger = LoggerFactory.getLogger(ProvinceAllAreasController.class);

    @Autowired
    private ProvinceAllAreasServiceImpl provinceAllAreasService;

    @GetMapping(value = "/list")
    @ApiOperation(value = "省市区数据联动获取", httpMethod = "GET")
    public ResultJson list(HttpServletRequest request,
                           @RequestParam(value = "ParentId", required = false, defaultValue = "0") String ParentId) {
        try {
            QueryWrapper<ProvinceAllAreas> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("ParentId", ParentId);
            queryWrapper.orderByAsc("ParentPath");
            List<ProvinceAllAreas> list = provinceAllAreasService.list(queryWrapper);
            List<MenuProvinceAllAreasVo> vos = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(entity -> {
                    MenuProvinceAllAreasVo vo = new MenuProvinceAllAreasVo();
                    BeanUtils.copyProperties(entity, vo);
                    vos.add(vo);
                });
            }
            return ResultJson.success().add("list", vos);
        } catch (Exception e) {
            logger.error("操作失败：{}", e.getMessage());
            return ResultJson.failure();
        }
    }

//    @RequestMapping(value = "/page", method = RequestMethod.POST)
//    public ResultJson page(HttpServletRequest request, @RequestBody ProvinceAllAreasParam param) {
//        logger.info("page start param {}", JSON.toJSONString(param));
//        try {
//            IPage<ProvinceAllAreas> page =
//                    provinceAllAreasService.page(new Page<>(param.getCurrentPage(), param.getPageSize()), null);
//            return ResultJson.success().add("page", page);
//        } catch (Exception e) {
//            logger.error("操作失败：{}", e.getMessage());
//            return ResultJson.failure();
//        }
//    }

//    @RequestMapping(value = "/tree", method = RequestMethod.POST)
//    @ApiOperation("分页列表-信息")
//    public ResultJson tree(HttpServletRequest request) {
//        try {
//            long tsStart = System.currentTimeMillis();
//            //查询所有数据
//            List<ProvinceAllAreas> allList = provinceAllAreasService.list(null);
//            //查询顶级数据
//            QueryWrapper<ProvinceAllAreas> queryWrapper = new QueryWrapper<>();
//            queryWrapper.eq("LevelType", 1);
//            List<ProvinceAllAreas> topList = provinceAllAreasService.list(queryWrapper);
//
//            List<MenuProvinceAllAreasVo> allVos = new ArrayList<>();
//            allList.forEach(entity -> {
//                MenuProvinceAllAreasVo vo = new MenuProvinceAllAreasVo();
//                BeanUtils.copyProperties(entity, vo);
//                allVos.add(vo);
//            });
//            List<MenuProvinceAllAreasVo> topVos = new ArrayList<>();
//            topList.forEach(entity -> {
//                MenuProvinceAllAreasVo vo = new MenuProvinceAllAreasVo();
//                BeanUtils.copyProperties(entity, vo);
//                topVos.add(vo);
//            });
//
//            //为一级数据设置子数据，getChild是递归调用的
//            if (!CollectionUtils.isEmpty(topVos)) { //不为空进入
//                for (MenuProvinceAllAreasVo vo : topVos) {
//                    //需在实体创建存放结构树字段进行set
//                    vo.setChilds(getChild(vo.getId(), allVos));
//                }
//            }
//            long tsEnd = System.currentTimeMillis();
//            logger.info("tree spendTime [{}ms]", (tsEnd - tsStart));
//            return ResultJson.success().add("list", topVos);
//        } catch (Exception e) {
//            logger.error("操作失败：{}", e.getMessage());
//            return ResultJson.failure();
//        }
//    }
//
//    /**
//     * 调用递归
//     */
//    private List<MenuProvinceAllAreasVo> getChild(String id, List<MenuProvinceAllAreasVo> allList) {
//        // 子级数据
//        List<MenuProvinceAllAreasVo> childList = new ArrayList<>();
//        for (MenuProvinceAllAreasVo entity : allList) {
//            // 遍历所有节点，将父菜单id与传过来的id比较
//            if (!StringUtils.isEmpty(entity.getParentId())) {
//                if (entity.getParentId().equals(id)) {
//                    childList.add(entity);
//                }
//            }
//        }
//        // 把子级数据的子级再循环一遍
//        for (MenuProvinceAllAreasVo entity : childList) {
//            if (!StringUtils.isEmpty(entity.getParentId())) {
//                // 递归
//                entity.setChilds(getChild(entity.getId(), allList));
//            }
//        }
//        // 递归退出条件
//        if (childList.size() == 0) {
//            return null;
//        }
//        return childList;
//    }
}
