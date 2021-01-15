package com.gly.testHibernate.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public class Cours {
    private Integer c_id;
    private String c_name;

    private Set<Stu> s_set = new HashSet<Stu>();

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Set<Stu> getS_set() {
        return s_set;
    }

    public void setS_set(Set<Stu> s_set) {
        this.s_set = s_set;
    }
}
