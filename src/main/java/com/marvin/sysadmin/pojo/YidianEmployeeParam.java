package com.marvin.sysadmin.pojo;

import com.marvin.sysadmin.common.BaseReqParam;

/**
 * <p>
 * 员工数据
 * </p>
 *
 * @author marvin
 * @since 2022-07-23
 */
public class YidianEmployeeParam extends BaseReqParam {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 入库冷库、出库冷库代码
     */
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
    private String certificateType;

    /**
     * 证件号码
     */
    private String certificateNo;

    /**
     * 手机号
     */
    private String mobileNo;

    /**
     * 岗位（仓库管理、作业人员、其他）
     */
    private String workPost;

    /**
     * 在职状态（在职、离职、休假）
     */
    private String workStatus;

    /**
     * 是否为高风险人员（是、否）
     */
    private String highRisk;

    /**
     * 人员类型（一线工作人员；其他工作人员；家属）
     */
    private String role;


}
