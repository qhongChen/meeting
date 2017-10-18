package xin.qhongchen.meeting.entity;

import java.util.Date;

public class Department {
    private String departrmentId;

    private String departrmentName;

    private String departrmentCode;

    private Date createTime;

    private String createUser;

    public String getDepartrmentId() {
        return departrmentId;
    }

    public void setDepartrmentId(String departrmentId) {
        this.departrmentId = departrmentId == null ? null : departrmentId.trim();
    }

    public String getDepartrmentName() {
        return departrmentName;
    }

    public void setDepartrmentName(String departrmentName) {
        this.departrmentName = departrmentName == null ? null : departrmentName.trim();
    }

    public String getDepartrmentCode() {
        return departrmentCode;
    }

    public void setDepartrmentCode(String departrmentCode) {
        this.departrmentCode = departrmentCode == null ? null : departrmentCode.trim();
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