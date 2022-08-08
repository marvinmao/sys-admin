package com.marvin.sysadmin.entity.auto;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 万年投档数据表
    * </p>
*
* @author marvin
* @since 2022-08-08
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="ThousandYearsData对象", description="万年投档数据表")
    public class ThousandYearsData extends Model {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty(value = "批次")
    private String pc;

            @ApiModelProperty(value = "院校代码")
    private String yxdm;

            @ApiModelProperty(value = "院校名称")
    private String yxmc;

            @ApiModelProperty(value = "院校类型")
    private String yxlx;

            @ApiModelProperty(value = "科类")
    private String kl;

            @ApiModelProperty(value = "专业代码")
    private String zydm;

            @ApiModelProperty(value = "专业代码名称")
    private String zydhmc;

    private String ccmc;

            @ApiModelProperty(value = "备注")
    private String bz;

            @ApiModelProperty(value = "年份")
    private String nf;


}
