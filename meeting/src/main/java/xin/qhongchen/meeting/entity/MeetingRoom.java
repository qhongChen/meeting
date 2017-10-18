package xin.qhongchen.meeting.entity;

import java.util.Date;

public class MeetingRoom {
    private String roomId;

    private String roomName;

    private String roomAddress;

    private String roomRemark;

    private Integer maxSite;

    private String state;

    private Date createTime;

    private String createUser;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress == null ? null : roomAddress.trim();
    }

    public String getRoomRemark() {
        return roomRemark;
    }

    public void setRoomRemark(String roomRemark) {
        this.roomRemark = roomRemark == null ? null : roomRemark.trim();
    }

    public Integer getMaxSite() {
        return maxSite;
    }

    public void setMaxSite(Integer maxSite) {
        this.maxSite = maxSite;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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