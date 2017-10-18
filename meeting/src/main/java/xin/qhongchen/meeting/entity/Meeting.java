package xin.qhongchen.meeting.entity;

import java.util.Date;

public class Meeting {
    private String meetingId;

    private String holder;

    private Date holdTime;

    private Integer attendNumber;

    private Date startTime;

    private Date endTime;

    private String meetingName;

    private String meetingRemark;

    private String roomId;

    private String isCancel;

    private String cancelReason;

    private Date createTime;

    private String createUser;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder == null ? null : holder.trim();
    }

    public Date getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(Date holdTime) {
        this.holdTime = holdTime;
    }

    public Integer getAttendNumber() {
        return attendNumber;
    }

    public void setAttendNumber(Integer attendNumber) {
        this.attendNumber = attendNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public String getMeetingRemark() {
        return meetingRemark;
    }

    public void setMeetingRemark(String meetingRemark) {
        this.meetingRemark = meetingRemark == null ? null : meetingRemark.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(String isCancel) {
        this.isCancel = isCancel == null ? null : isCancel.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}