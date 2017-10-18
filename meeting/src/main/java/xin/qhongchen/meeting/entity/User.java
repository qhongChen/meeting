package xin.qhongchen.meeting.entity;

import java.util.Date;

public class User {
    private String userId;

    private String userName;

    private String userAccount;

    private String userPassword;

    private String departrmentId;

    private String departrmentCode;

    private String userPhone;

    private String userEmail;

    private String createUser;

    private Date createTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getDepartrmentId() {
        return departrmentId;
    }

    public void setDepartrmentId(String departrmentId) {
        this.departrmentId = departrmentId == null ? null : departrmentId.trim();
    }

    public String getDepartrmentCode() {
        return departrmentCode;
    }

    public void setDepartrmentCode(String departrmentCode) {
        this.departrmentCode = departrmentCode == null ? null : departrmentCode.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}