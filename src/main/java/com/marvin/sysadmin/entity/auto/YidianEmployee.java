package com.marvin.sysadmin.entity.auto;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableField;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 员工数据
    * </p>
*
* @author marvin
* @since 2022-07-23
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public class YidianEmployee extends Model {

    private static final long serialVersionUID = 1L;

    private Long id;

            /**
            * 入库冷库、出库冷库代码
            */
        @TableField("companyCode")
    private String companyCode;

            /**
            * 姓名
            */
    private String name;

            /**
            * 性别
            */
    private String gender;

            /**
            * 证件类型
            */
        @TableField("certificateType")
    private String certificateType;

            /**
            * 证件号码
            */
        @TableField("certificateNo")
    private String certificateNo;

            /**
            * 手机号
            */
        @TableField("mobileNo")
    private String mobileNo;

            /**
            * 岗位（仓库管理、作业人员、其他）
            */
        @TableField("workPost")
    private String workPost;

            /**
            * 在职状态（在职、离职、休假）
            */
        @TableField("workStatus")
    private String workStatus;

            /**
            * 是否为高风险人员（是、否）
            */
        @TableField("highRisk")
    private String highRisk;

            /**
            * 人员类型（一线工作人员；其他工作人员；家属）
            */
    private String role;


}
