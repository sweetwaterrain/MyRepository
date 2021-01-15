package com.gly.testSpring;

public class Car {
    private String color ; // 颜色
    private String name ;  // 名称

    public Car(){
        this.color = "黄色" ;
        this.name = "捷达" ;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", name=" + name + "]";
    }
}
