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
    * 学校表
    * </p>
*
* @author marvin
* @since 2022-08-08
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="School对象", description="学校表")
    public class School extends Model {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty(value = "院校代码")
    private String yxdh;

            @ApiModelProperty(value = "院校名称")
    private String yxmc;

            @ApiModelProperty(value = "是否双一流")
    private String sfsyl;

            @ApiModelProperty(value = "创建时间")
    private LocalDateTime gmtCreate;

            @ApiModelProperty(value = "修改时间")
    private LocalDateTime gmtModified;

            @ApiModelProperty(value = "是否211")
    private Integer sf211;

            @ApiModelProperty(value = "是否985")
    private Integer sf985;

            @ApiModelProperty(value = "办学类型")
    private Integer bxlx;


}
