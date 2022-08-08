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
    * 专业表
    * </p>
*
* @author marvin
* @since 2022-08-08
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @ApiModel(value="Major对象", description="专业表")
    public class Major extends Model {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String zydm;

    private String zymc;

            @ApiModelProperty(value = "创建时间")
    private LocalDateTime gmtCreate;

            @ApiModelProperty(value = "修改时间")
    private LocalDateTime gmtModified;


}
