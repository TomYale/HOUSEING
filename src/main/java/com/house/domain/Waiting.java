package com.house.domain;

public class Waiting {
    private int id;//ID
    private String no2;//编号
    private String applicant;//申请人
    private String idc;//身份证
    private String lrtime;//录入时间
    private String rktime;//入库时间
    private String validity;//有效期
    private String intention;//意向小区

    @Override
    public String toString() {
        return "waiting{" +
                "id=" + id +
                ", no2='" + no2 + '\'' +
                ", applicant='" + applicant + '\'' +
                ", idc='" + idc + '\'' +
                ", lrtime='" + lrtime + '\'' +
                ", rktime='" + rktime + '\'' +
                ", validity='" + validity + '\'' +
                ", intention='" + intention + '\'' +
                ", waitingfx='" + waitingfx + '\'' +
                ", rownumber='" + rownumber + '\'' +
                ", first='" + first + '\'' +
                ", reason='" + reason + '\'' +
                ", wtype='" + wtype + '\'' +
                ", fprecord='" + fprecord + '\'' +
                ", ifright='" + ifright + '\'' +
                ", no=" + no +
                ", wnum=" + wnum +
                '}';
    }

    private String waitingfx;//轮候房型
    private String rownumber;//轮候排号
    private String first;//是否优先
    private String reason;//原因
    private String wtype;//轮候类型
    private String fprecord;//分配记录
    private String ifright;//是否符合摇号
    private int no;//序号

    public int getId() {
        return id;
    }

    public Waiting(int id, String no2, String applicant, String idc, String lrtime, String rktime, String validity, String intention, String waitingfx, String rownumber, String first, String reason, String wtype, String fprecord, String ifright, int no, int wnum) {
        this.id = id;
        this.no2 = no2;
        this.applicant = applicant;
        this.idc = idc;
        this.lrtime = lrtime;
        this.rktime = rktime;
        this.validity = validity;
        this.intention = intention;
        this.waitingfx = waitingfx;
        this.rownumber = rownumber;
        this.first = first;
        this.reason = reason;
        this.wtype = wtype;
        this.fprecord = fprecord;
        this.ifright = ifright;
        this.no = no;
        this.wnum = wnum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
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

    public String getLrtime() {
        return lrtime;
    }

    public void setLrtime(String lrtime) {
        this.lrtime = lrtime;
    }

    public String getRktime() {
        return rktime;
    }

    public void setRktime(String rktime) {
        this.rktime = rktime;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public String getWaitingfx() {
        return waitingfx;
    }

    public void setWaitingfx(String waitingfx) {
        this.waitingfx = waitingfx;
    }

    public String getRownumber() {
        return rownumber;
    }

    public void setRownumber(String rownumber) {
        this.rownumber = rownumber;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype;
    }

    public String getFprecord() {
        return fprecord;
    }

    public void setFprecord(String fprecord) {
        this.fprecord = fprecord;
    }

    public String getIfright() {
        return ifright;
    }

    public void setIfright(String ifright) {
        this.ifright = ifright;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getWnum() {
        return wnum;
    }

    public void setWnum(int wnum) {
        this.wnum = wnum;
    }

    private int wnum;//等待次数
}
