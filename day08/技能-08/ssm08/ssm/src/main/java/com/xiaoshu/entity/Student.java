package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    @Id
    private Integer stid;

    private String stname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stbirthday;

    private String stage;

    private String stsex;

    private Integer scid;

    private static final long serialVersionUID = 1L;

    /**
     * @return stid
     */
    public Integer getStid() {
        return stid;
    }

    /**
     * @param stid
     */
    public void setStid(Integer stid) {
        this.stid = stid;
    }

    /**
     * @return stname
     */
    public String getStname() {
        return stname;
    }

    /**
     * @param stname
     */
    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    /**
     * @return stbirthday
     */
    public Date getStbirthday() {
        return stbirthday;
    }

    /**
     * @param stbirthday
     */
    public void setStbirthday(Date stbirthday) {
        this.stbirthday = stbirthday;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage
     */
    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    /**
     * @return stsex
     */
    public String getStsex() {
        return stsex;
    }

    /**
     * @param stsex
     */
    public void setStsex(String stsex) {
        this.stsex = stsex == null ? null : stsex.trim();
    }

    /**
     * @return scid
     */
    public Integer getScid() {
        return scid;
    }

    /**
     * @param scid
     */
    public void setScid(Integer scid) {
        this.scid = scid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stid=").append(stid);
        sb.append(", stname=").append(stname);
        sb.append(", stbirthday=").append(stbirthday);
        sb.append(", stage=").append(stage);
        sb.append(", stsex=").append(stsex);
        sb.append(", scid=").append(scid);
        sb.append("]");
        return sb.toString();
    }
}