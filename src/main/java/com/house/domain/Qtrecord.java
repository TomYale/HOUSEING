package com.house.domain;

import java.sql.Timestamp;

public class Qtrecord {
    private int no;//序号
    private String applicant;//申请人
    private String idc;//身份证号码
    private String rid;//档案编号
    private String type;//公廉
    private String hno;//小区及房号
    private Timestamp fwtime;//发文时间
    private Timestamp qxtime;//期限及腾退时间
    private String reason;//腾退原因
    private String sdhz;//送达回证
    private String iftk;//是否腾空

    public int getNo() {
        return no;
    }

    public Qtrecord(int no, String applicant, String idc, String rid, String type, String hno, Timestamp fwtime, Timestamp qxtime, String reason, String sdhz, String iftk, Timestamp jftime, String remark, String notice) {
        this.no = no;
        this.applicant = applicant;
        this.idc = idc;
        this.rid = rid;
        this.type = type;
        this.hno = hno;
        this.fwtime = fwtime;
        this.qxtime = qxtime;
        this.reason = reason;
        this.sdhz = sdhz;
        this.iftk = iftk;
        this.jftime = jftime;
        this.remark = remark;
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "Qtrecord{" +
                "no=" + no +
                ", applicant='" + applicant + '\'' +
                ", idc='" + idc + '\'' +
                ", rid='" + rid + '\'' +
                ", type='" + type + '\'' +
                ", hno='" + hno + '\'' +
                ", fwtime=" + fwtime +
                ", qxtime=" + qxtime +
                ", reason='" + reason + '\'' +
                ", sdhz='" + sdhz + '\'' +
                ", iftk='" + iftk + '\'' +
                ", jftime=" + jftime +
                ", remark='" + remark + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public Timestamp getFwtime() {
        return fwtime;
    }

    public void setFwtime(Timestamp fwtime) {
        this.fwtime = fwtime;
    }

    public Timestamp getQxtime() {
        return qxtime;
    }

    public void setQxtime(Timestamp qxtime) {
        this.qxtime = qxtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSdhz() {
        return sdhz;
    }

    public void setSdhz(String sdhz) {
        this.sdhz = sdhz;
    }

    public String getIftk() {
        return iftk;
    }

    public void setIftk(String iftk) {
        this.iftk = iftk;
    }

    public Timestamp getJftime() {
        return jftime;
    }

    public void setJftime(Timestamp jftime) {
        this.jftime = jftime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    private Timestamp jftime;//购房交房日
    private String remark;//备注
    private String notice;//催款通知
}
