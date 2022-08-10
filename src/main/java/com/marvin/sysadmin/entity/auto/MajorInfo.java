package com.marvin.sysadmin.entity.auto;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 专业信息
    * </p>
*
* @author marvin
* @since 2022-08-10
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="MajorInfo对象", description="专业信息")
    public class MajorInfo extends Model {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "学校名称")
    private String uniName;

            @ApiModelProperty(value = "学校代码")
    private String uniCode;

            @ApiModelProperty(value = "方向")
    private String uniDirection;

            @ApiModelProperty(value = "专业名称")
    private String majorName;

            @ApiModelProperty(value = "专业代码")
    private String majorCode;

            @ApiModelProperty(value = "首选科目:物理/历史")
    private String firstRequest;

            @ApiModelProperty(value = "次选科目：除物历外的科目。若无要求，则写任选")
    private String secondRequest;

            @ApiModelProperty(value = "最低分数")
    private Integer majorLowScore;

            @ApiModelProperty(value = "最低分排名")
    private Integer majorLowRank;


}
