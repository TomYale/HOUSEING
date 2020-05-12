package com.house.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Vedio {
    public Vedio(int vedioID, Timestamp createtime, Timestamp changetime, int playnum, String vedioNAME, int UID, String address) {
        this.vedioID = vedioID;
        this.createtime = createtime;
        this.changetime = changetime;
        this.playnum = playnum;
        this.vedioNAME = vedioNAME;
        this.UID = UID;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Vedio{" +
                "vedioID=" + vedioID +
                ", createtime=" + createtime +
                ", changetime=" + changetime +
                ", playnum=" + playnum +
                ", vedioNAME='" + vedioNAME + '\'' +
                ", UID=" + UID +
                ", address='" + address + '\'' +
                '}';
    }

    private int vedioID;//视频id
    private Timestamp createtime;//创建时间
    private Timestamp changetime;//修改时间
    private int playnum;//播放次数
    private String vedioNAME;//视频名称
    private int UID;//上传者ID

    public int getVedioID() {
        return vedioID;
    }

    public void setVedioID(int vedioID) {
        this.vedioID = vedioID;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getChangetime() {
        return changetime;
    }

    public void setChangetime(Timestamp changetime) {
        this.changetime = changetime;
    }

    public int getPlaynum() {
        return playnum;
    }

    public void setPlaynum(int playnum) {
        this.playnum = playnum;
    }

    public String getVedioNAME() {
        return vedioNAME;
    }

    public void setVedioNAME(String vedioNAME) {
        this.vedioNAME = vedioNAME;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;//视频存放地址
}
