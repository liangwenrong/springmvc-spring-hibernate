package com.lwr.pojo.form;

import java.util.Date;

import com.lwr.pojo.entity.User;

public class UserForm extends User {
    private Date start;
    private Date end;
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }

}
