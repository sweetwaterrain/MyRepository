package com.gly.testHibernate.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public class Stu {
    private Integer s_id;
    private String s_name;
    private Character s_state;

    private Set<Cours> c_set = new HashSet<Cours>();

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Character getS_state() {
        return s_state;
    }

    public void setS_state(Character s_state) {
        this.s_state = s_state;
    }

    public Set<Cours> getC_set() {
        return c_set;
    }

    public void setC_set(Set<Cours> c_set) {
        this.c_set = c_set;
    }
}
