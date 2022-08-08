package com.marvin.sysadmin.entity.auto;

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
    * 招生计划表
    * </p>
*
* @author marvin
* @since 2022-08-08
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="RecruitStudentsPlan对象", description="招生计划表")
    public class RecruitStudentsPlan extends Model {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty(value = "院校代码")
    private String yxdm;

            @ApiModelProperty(value = "院校代号")
    private String yxdh;

            @ApiModelProperty(value = "院校代号名称")
    private String yxdhmc;

            @ApiModelProperty(value = "所在地")
    private String szd;

            @ApiModelProperty(value = "是否985，0否，1是")
    private Integer sf985;

            @ApiModelProperty(value = "是否211,0否，1是")
    private Integer sf211;

            @ApiModelProperty(value = "是否双一流")
    private String sfsyl;

            @ApiModelProperty(value = "办校类型代码")
    private Integer bxlxdm;

            @ApiModelProperty(value = "办校类型名称")
    private String bxlxmc;

            @ApiModelProperty(value = "省市代码")
    private Integer ssdm;

            @ApiModelProperty(value = "省市名称")
    private String ssmc;

    private Integer zgdm;

    private String zgmc;

    private Integer ccdm;

    private String ccmc;

            @ApiModelProperty(value = "职业代码")
    private String zydm;

    private String sbdm2;

            @ApiModelProperty(value = "职业名称")
    private String zymc;

            @ApiModelProperty(value = "学制代码修改")
    private String xzdmxg;

            @ApiModelProperty(value = "学制代码")
    private String xzdm;

            @ApiModelProperty(value = "学制名称")
    private String xzmc;

    private String sfbz;

    private String kldm;

    private String ksklmc;

    private String pcdm;

    private String pcmc;

    private String kslxdm;

    private String kslxmc;

    private String xkkmyq;

    private String xkkmyqzw;

    private Integer zsjhs;

    private String bz;

            @ApiModelProperty(value = "选考科目1")
    private String km1;

            @ApiModelProperty(value = "选考科目2")
    private String km2;

            @ApiModelProperty(value = "选考科目3")
    private String km3;

            @ApiModelProperty(value = "专业代码与省代码2合并在一起")
    private String zydmNew;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Integer zsjhsSy;

            @ApiModelProperty(value = "招生专业")
    private String zszymc;

            @ApiModelProperty(value = "年份")
    private String nf;


}
