package com.marvin.sysadmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 高考科目分类信息
 * </p>
 *
 * @author marvin
 * @since 2022-08-15
 */
@Data
@ApiModel(value = "SubjectsInfo对象", description = "高考科目分类信息")
public class SubjectsInfoVo {

    @ApiModelProperty(value = "科目编码")
    private String subjectsCode;

    @ApiModelProperty(value = "科目名称")
    private String subjectsName;

}
