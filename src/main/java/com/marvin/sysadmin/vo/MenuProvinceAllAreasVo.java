package com.marvin.sysadmin.vo;

import lombok.Data;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author marvin
 * @since 2022-07-23
 */
@Data
public class MenuProvinceAllAreasVo {

    private String Id;

    private String parentId;

    private String provinceCode;

    private String provinceName;

    private String provinceShortName;

    List<SubjectsInfoVo> subjectsList;

}
