package com.gly.testHibernate.OneToMany.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Hstudent {
    private int sid;
    private String sname;

    private Set<Huser> userSet;

    @Transient
    public Set<Huser> getUserSet() {

        return userSet;
    }

    public void setUserSet(Set<Huser> userSet) {

        this.userSet = userSet;
    }

    @Id
    @Column(name = "sid", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname", nullable = true, length = 255)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hstudent hstudent = (Hstudent) o;

        if (sid != hstudent.sid) return false;
        if (sname != null ? !sname.equals(hstudent.sname) : hstudent.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }
}
