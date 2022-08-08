package com.marvin.sysadmin.pojo;

import com.marvin.sysadmin.common.BaseReqParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 候选志愿
 * </p>
 *
 * @author marvin
 * @since 2022-08-08
 */
@Data
public class CandidateVolunteerParam extends BaseReqParam {

    @ApiModelProperty(value = "考生id")
    private Long candidateId;

    @ApiModelProperty(value = "学校代码")
    private String schoolCode;

    @ApiModelProperty(value = "学校名称")
    private String schoolName;

    @ApiModelProperty(value = "专业代码")
    private String majorCode;

    @ApiModelProperty(value = "专业名称")
    private String majorName;

}
