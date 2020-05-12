package com.house.domain;

import java.sql.Timestamp;

public class Comment {
    private Integer commentID;
    private String username;
    private String comment;
    private Timestamp time;
    private Integer vedioID;
    private Integer uid;

    public Comment(Integer commentID, String username, String comment, Timestamp time, Integer vedioID, Integer uid) {
        this.commentID = commentID;
        this.username = username;
        this.comment = comment;
        this.time = time;
        this.vedioID = vedioID;
        this.uid = uid;
    }

    public Integer getCommentID() {
        return commentID;
    }

    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Integer getVedioID() {
        return vedioID;
    }

    public void setVedioID(Integer vedioID) {
        this.vedioID = vedioID;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", time=" + time +
                ", vedioID=" + vedioID +
                ", uid=" + uid +
                '}';
    }
}
