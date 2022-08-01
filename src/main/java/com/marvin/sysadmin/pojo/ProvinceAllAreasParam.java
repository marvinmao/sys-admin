package com.marvin.sysadmin.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.marvin.sysadmin.common.BaseReqParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author marvin
 * @since 2022-07-23
 */
public class ProvinceAllAreasParam extends BaseReqParam {

    private static final long serialVersionUID = 1L;

    private String id;

    private String ParentId;

    private String LevelType;

}
