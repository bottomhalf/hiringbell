package com.hiringbell.entity;

import com.hiringbell.model.CreationData;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login extends CreationData {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LoginId")
    private Long LoginId;
    private Long UserId;
    private int UserTypeId;
    private int RoleId;
    private String Password;
    private String Email;
    private String Mobile;

    @Override
    public String toString() {
        return "Login {" +
                "LoginId=" + LoginId +
                ", UserId=" + UserId +
                ", UserTypeId=" + UserTypeId +
                ", RoleId=" + RoleId +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", Mobile='" + Mobile + '\'' +
                '}';
    }

    public Long getLoginId() {
        return LoginId;
    }

    public void setLoginId(Long loginId) {
        LoginId = loginId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public int getUserTypeId() {
        return UserTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        UserTypeId = userTypeId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
