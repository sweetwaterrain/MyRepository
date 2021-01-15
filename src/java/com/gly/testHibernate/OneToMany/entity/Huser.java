package com.gly.testHibernate.OneToMany.entity;

import javax.persistence.*;

@Entity
public class Huser {
    private int uid;
    private String uname;
    private Integer sid;

    private Hstudent student;

    @Transient
    public Hstudent getStudent() {
        return student;
    }

    public void setStudent(Hstudent student) {
        this.student = student;
    }

    @Id
    @Column(name = "uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uname", nullable = true, length = 255)
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "sid", nullable = true)
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Huser huser = (Huser) o;

        if (uid != huser.uid) return false;
        if (uname != null ? !uname.equals(huser.uname) : huser.uname != null) return false;
        if (sid != null ? !sid.equals(huser.sid) : huser.sid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        return result;
    }
}
