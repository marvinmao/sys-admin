package com.marvin.sysadmin.entity.auto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 中转查验数据
 * </p>
 *
 * @author marvin
 * @since 2021-04-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class YidianChainspect extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 车牌号码
     */
    @TableField("vehicleNo")
    private String vehicleNo;

    /**
     * 车辆状态
     */
    @TableField("vehicleStatus")
    private String vehicleStatus;

    /**
     * 提单号
     */
    @TableField("ladingNo")
    private String ladingNo;

    /**
     * 提货时间
     */
    @TableField("ladingTime")
    private LocalDateTime ladingTime;

    /**
     * 目前车辆情况
     */
    @TableField("curVehicleState")
    private String curVehicleState;

    /**
     * 实际冷库（关联company表的企业名称）
     */
    @TableField("actualColdStorage")
    private String actualColdStorage;

    /**
     * 收货时间
     */
    @TableField("receivingTime")
    private LocalDateTime receivingTime;

    /**
     * 收获查验月台
     */
    @TableField("receivingSite")
    private String receivingSite;

    /**
     * 掏箱人员（关联employee的id）
     */
    @TableField("diggingStaff")
    private String diggingStaff;

    /**
     * 货物去向
     */
    @TableField("goodsNextStage")
    private String goodsNextStage;

    /**
     * 货类
     */
    @TableField("goodsType")
    private String goodsType;

    /**
     * 原产地
     */
    @TableField("originPlace")
    private String originPlace;

    /**
     * 提离码头
     */
    @TableField("shippingDock")
    private String shippingDock;

    /**
     * 司机
     */
    private String driver;

    /**
     * 联系方式
     */
    @TableField("contactNo")
    private String contactNo;

    /**
     * 原冷库信息（关联company表的企业名称）
     */
    @TableField("planColdStorage")
    private String planColdStorage;

    /**
     * 去向区域
     */
    @TableField("destinationArea")
    private String destinationArea;

    /**
     * 箱号
     */
    @TableField("caseNo")
    private String caseNo;

    /**
     * 发往省份
     */
    @TableField("toProvince")
    private String toProvince;

    /**
     * 备注
     */
    private String remark;

    /**
     * 核酸采样件数
     */
    @TableField("acidSamplesNum")
    private Integer acidSamplesNum;

    /**
     * 核酸采样时间
     */
    @TableField("acidSamplesTime")
    private String acidSamplesTime;

    /**
     * 核酸采样人员（关联employee的id）
     */
    @TableField("acidSamplesStaff")
    private String acidSamplesStaff;

    /**
     * 阴性件数
     */
    @TableField("negativeNum")
    private Integer negativeNum;

    /**
     * 阳性件数
     */
    @TableField("positiveNum")
    private Integer positiveNum;

    /**
     * 检测机构
     */
    @TableField("detectionOrg")
    private String detectionOrg;

    /**
     * 检测时间
     */
    @TableField("detectionTime")
    private LocalDateTime detectionTime;

    /**
     * 检测报告编号
     */
    @TableField("detectionReportNo")
    private String detectionReportNo;

    /**
     * 检测报告扫描件
     */
    @TableField("detectionReportImg")
    private String detectionReportImg;

    /**
     * 消杀情况
     */
    @TableField("disinfectState")
    private String disinfectState;

    /**
     * 消杀机构
     */
    @TableField("disinfectOrg")
    private String disinfectOrg;

    /**
     * 消杀时间
     */
    @TableField("disinfectTime")
    private LocalDateTime disinfectTime;

    /**
     * 消毒证明编号
     */
    @TableField("disinfectCertNo")
    private String disinfectCertNo;

    /**
     * 消毒证明扫描件
     */
    @TableField("disinfectCertImg")
    private String disinfectCertImg;

    /**
     * 消杀人员（关联employee的id）
     */
    @TableField("disinfectStaff")
    private String disinfectStaff;

    /**
     * 检查单位
     */
    @TableField("inspectUnit")
    private String inspectUnit;

    /**
     * 检查人员
     */
    private String inspector;

    /**
     * 检查时间
     */
    @TableField("inspectTime")
    private LocalDateTime inspectTime;


}
