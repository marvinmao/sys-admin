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
    * 候选志愿
    * </p>
*
* @author marvin
* @since 2022-08-08
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="CandidateVolunteer对象", description="候选志愿")
    public class CandidateVolunteer extends Model {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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

            @ApiModelProperty(value = "专业代码与省代码2拼接在一起")
    private String majorCodeNew;

            @ApiModelProperty(value = "参考指数")
    private BigDecimal referenceIndex;

            @ApiModelProperty(value = "志愿类型（1冲、2稳、3保）")
    private String status;

            @ApiModelProperty(value = "创建时间")
    private LocalDateTime gmtCreate;

            @ApiModelProperty(value = "修改时间")
    private LocalDateTime gmtModified;

            @ApiModelProperty(value = "学制代码")
    private String xzdm;

            @ApiModelProperty(value = "所在地")
    private String szd;

            @ApiModelProperty(value = "收费标准")
    private String sfbz;

            @ApiModelProperty(value = "招生计划数")
    private Integer zsjhs;

            @ApiModelProperty(value = "备注")
    private String bz;


}
