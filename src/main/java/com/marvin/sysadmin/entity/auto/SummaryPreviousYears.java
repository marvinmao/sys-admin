package com.marvin.sysadmin.entity.auto;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 往年投档情况汇总表
    * </p>
*
* @author marvin
* @since 2022-08-08
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="SummaryPreviousYears对象", description="往年投档情况汇总表")
    public class SummaryPreviousYears extends Model {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty(value = "学校代码")
    private String schoolCode;

            @ApiModelProperty(value = "学校名称")
    private String schoolName;

            @ApiModelProperty(value = "专业代码")
    private String zydm;

            @ApiModelProperty(value = "专业名称")
    private String zymc;

            @ApiModelProperty(value = "科类")
    private String kl;

            @ApiModelProperty(value = "年份")
    private String nf;

            @ApiModelProperty(value = "投档人数")
    private Integer tdrs;

            @ApiModelProperty(value = "平均分")
    private Integer pjf;

            @ApiModelProperty(value = "最低分")
    private Integer zdf;

            @ApiModelProperty(value = "投档名称")
    private Integer tdmc;

            @ApiModelProperty(value = "批次(1、2、3)")
    private Integer pc;

            @ApiModelProperty(value = "参考指数(通过三年的参考指数平均)")
    private BigDecimal ckzs;

            @ApiModelProperty(value = "备注")
    private String bz;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

            @ApiModelProperty(value = "段数（一段、二段）")
    private String ds;

            @ApiModelProperty(value = "段数情况描述")
    private String dsms;

            @ApiModelProperty(value = "招生计划数")
    private Integer zsjhs;

    private String zszymc;

            @ApiModelProperty(value = "是否为新专业,默认0，不是新专业")
    private Integer newMajor;


}
