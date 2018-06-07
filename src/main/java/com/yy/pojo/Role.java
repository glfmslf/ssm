package com.yy.pojo;

import java.util.Date;

/**
 * demo
 * AUTHOR: youyu
 * CREATED_DATE: 2018/3/6 21:59
 */
public class Role {
    private int id;
    private String role;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        createTime = createTime;
    }
}
