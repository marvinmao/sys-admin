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
    * 高考科目分类信息
    * </p>
*
* @author marvin
* @since 2022-08-15
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="SubjectsInfo对象", description="高考科目分类信息")
    public class SubjectsInfo extends Model {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "ID")
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "科目编码")
    private String subjectsCode;

            @ApiModelProperty(value = "科目名称")
    private String subjectsName;

            @ApiModelProperty(value = "省份编码，多个以逗号分隔")
    private String provinceCode;

            @ApiModelProperty(value = "排序")
    private Integer sort;


}
