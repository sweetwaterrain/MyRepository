package com.gly.testHibernate.ManyToMany.action;

import com.gly.testHibernate.ManyToMany.Cours;

import java.util.List;
import java.util.Set;

public class Stu_Cour {
    private String name;
    private String cour;
    private List<String> list;
    private Set<Cours> cours;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "Stu_Cour{" +
                "name='" + name + '\'' +
                ", cout='" + cour + '\'' +
                '}';
    }

    public String getCour() {
        return cour;
    }

    public void setCour(String cour) {
        this.cour = cour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Cours> getCours() {
        return cours;
    }

    public void setCours(Set<Cours> cours) {
        this.cours = cours;
    }
}
