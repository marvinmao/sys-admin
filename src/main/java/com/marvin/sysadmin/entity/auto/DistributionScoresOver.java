package com.marvin.sysadmin.entity.auto;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 历年分数分布表
    * </p>
*
* @author marvin
* @since 2022-08-01
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="DistributionScoresOver对象", description="历年分数分布表")
    public class DistributionScoresOver extends Model {

    private static final long serialVersionUID = 1L;

    private Long id;

            @ApiModelProperty(value = "年份")
    private String year;

            @ApiModelProperty(value = "省份id")
    private String provinceId;

            @ApiModelProperty(value = "省份名称")
    private String provinceName;

            @ApiModelProperty(value = "总分数")
    private BigDecimal score;

            @ApiModelProperty(value = "排名")
    private Integer rank;

            @ApiModelProperty(value = "人数")
    private Integer personNum;

            @ApiModelProperty(value = "累计人数")
    private Integer totalNum;

            @ApiModelProperty(value = "学科类别")
    private String subject;

            @ApiModelProperty(value = "备注")
    private String remark;


}
