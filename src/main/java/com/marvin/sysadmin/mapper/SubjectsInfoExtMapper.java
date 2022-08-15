package com.marvin.sysadmin.mapper;

import com.marvin.sysadmin.vo.SubjectsInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 高考科目分类信息 Mapper 接口
 * </p>
 *
 * @author marvin
 * @since 2022-08-15
 */
public interface SubjectsInfoExtMapper {

    List<SubjectsInfoVo> listByProCode(@Param("proCode") String proCode);
}
