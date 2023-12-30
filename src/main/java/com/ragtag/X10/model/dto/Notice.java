package com.ragtag.X10.model.dto;

public class Notice {
    private int noticeId;
    private String receiverId;
    private int noticeType;
    private int sendGroup;
    private int noticeCheck;
    private String noticeDate;

    public Notice() {
    }

    public Notice(int noticeId, String receiverId, int noticeType, int sendGroup, int noticeCheck, String noticeDate) {
        this.noticeId = noticeId;
        this.receiverId = receiverId;
        this.noticeType = noticeType;
        this.sendGroup = sendGroup;
        this.noticeCheck = noticeCheck;
        this.noticeDate = noticeDate;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public int getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(int noticeType) {
        this.noticeType = noticeType;
    }

    public int getSendGroup() {
        return sendGroup;
    }

    public void setSendGroup(int sendGroup) {
        this.sendGroup = sendGroup;
    }

    public int getNoticeCheck() {
        return noticeCheck;
    }

    public void setNoticeCheck(int noticeCheck) {
        this.noticeCheck = noticeCheck;
    }

    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", receiverId='" + receiverId + '\'' +
                ", noticeType=" + noticeType +
                ", sendGroup='" + sendGroup + '\'' +
                ", noticeCheck=" + noticeCheck +
                ", noticeDate='" + noticeDate + '\'' +
                '}';
    }
}
