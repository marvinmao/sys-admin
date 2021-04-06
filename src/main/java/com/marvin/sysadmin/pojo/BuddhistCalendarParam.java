package com.marvin.sysadmin.pojo;

import com.marvin.sysadmin.common.BaseReqParam;

public class BuddhistCalendarParam extends BaseReqParam {

    private Long id;

    private String gregorianDate;

    private String lunarDate;

    private String memorialDay;

    private String solarTerms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGregorianDate() {
        return gregorianDate;
    }

    public void setGregorianDate(String gregorianDate) {
        this.gregorianDate = gregorianDate;
    }

    public String getLunarDate() {
        return lunarDate;
    }

    public void setLunarDate(String lunarDate) {
        this.lunarDate = lunarDate;
    }

    public String getMemorialDay() {
        return memorialDay;
    }

    public void setMemorialDay(String memorialDay) {
        this.memorialDay = memorialDay;
    }

    public String getSolarTerms() {
        return solarTerms;
    }

    public void setSolarTerms(String solarTerms) {
        this.solarTerms = solarTerms;
    }
}
