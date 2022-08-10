package com.marvin.sysadmin.entity.auto;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 院校信息
    * </p>
*
* @author marvin
* @since 2022-08-10
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="University对象", description="院校信息")
    public class University extends Model {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "学校名称")
    private String uniName;

            @ApiModelProperty(value = "省份")
    private String uniProvince;

            @ApiModelProperty(value = "城市")
    private String uniCity;

            @ApiModelProperty(value = "学校类型")
    private String uniType;

            @ApiModelProperty(value = "学校代码")
    private String uniCode;

            @ApiModelProperty(value = "方向")
    private String uniDirection;

            @ApiModelProperty(value = "批次")
    private String level;

            @ApiModelProperty(value = "物理最低分")
    private Integer physisLowScore;

            @ApiModelProperty(value = "历史最低分")
    private Integer historyLowScore;

            @ApiModelProperty(value = "物理最低分排名")
    private Integer physisLowScoreRank;

            @ApiModelProperty(value = "历史最低分排名")
    private Integer historyLowScoreRank;

            @ApiModelProperty(value = "物理类录取人数")
    private Integer physisMatriculateNumber;

            @ApiModelProperty(value = "历史类录取人数")
    private Integer historyMatriculateNumber;

    private Integer physisTotal;

    private Integer historyTotal;


}
