package com.marvin.sysadmin.entity.auto;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
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
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public class ProvinceAllAreas extends Model {

    private static final long serialVersionUID = 1L;

            @TableId("ID")
    private String id;

        @TableField("ParentId")
    private String ParentId;

        @TableField("LevelType")
    private String LevelType;

        @TableField("Name")
    private String Name;

        @TableField("ShortName")
    private String ShortName;

        @TableField("ParentPath")
    private String ParentPath;

        @TableField("Province")
    private String Province;

        @TableField("City")
    private String City;

        @TableField("District")
    private String District;

        @TableField("ProvinceShortName")
    private String ProvinceShortName;

        @TableField("CityShortName")
    private String CityShortName;

        @TableField("DistrictShortName")
    private String DistrictShortName;

        @TableField("ProvincePinyin")
    private String ProvincePinyin;

        @TableField("CityPinyin")
    private String CityPinyin;

        @TableField("DistrictPinyin")
    private String DistrictPinyin;

        @TableField("CityCode")
    private String CityCode;

        @TableField("ZipCode")
    private String ZipCode;

        @TableField("Pinyin")
    private String Pinyin;

        @TableField("Jianpin")
    private String Jianpin;

        @TableField("FirstChar")
    private String FirstChar;

    private String lng;

        @TableField("Lat")
    private String Lat;

        @TableField("Remark1")
    private String Remark1;

        @TableField("Remark2")
    private String Remark2;


}
