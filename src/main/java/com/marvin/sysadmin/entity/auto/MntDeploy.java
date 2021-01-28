package com.marvin.sysadmin.entity.auto;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 部署管理
    * </p>
*
* @author marvin
* @since 2021-01-28
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public class MntDeploy extends Model {

    private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "deploy_id", type = IdType.AUTO)
    private Long deployId;

            /**
            * 应用编号
            */
    private Long appId;

            /**
            * 创建者
            */
    private String createBy;

            /**
            * 更新者
            */
    private String updateBy;

    private LocalDateTime createTime;

            /**
            * 更新时间
            */
    private LocalDateTime updateTime;


}
