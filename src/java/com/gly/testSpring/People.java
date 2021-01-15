package com.gly.testSpring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class People {
    private String name ; // 值类型 -> 8大基本数据类型 + String

    private Car car ;     // 对象类型 -> 自行创建的类的对象。


    // 复杂对象的依赖注入
    // 1.数组
    private Object[] objs ;
    // 2.List
    private List<Object> objList ;
    // 3. Map
    private Map<String,Object> objMap;
    // 4. Properties  k -> v
    private Properties prop ;


    public People() {
        // 为了保证Spring基本的配置是生效的。
    }

    public People(String p_name, Car p_car) {
        this.name = p_name;
        this.car = p_car;

        System.out.println("构造方法调用： p_name ->" + p_name + "\n p_car ->" + p_car) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName -> " + name);
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        System.out.println("setName -> " + car);
        this.car = car;
    }

    public Object[] getObjs() {
        return objs;
    }

    public void setObjs(Object[] objs) {
        this.objs = objs;
    }

    public List<Object> getObjList() {
        return objList;
    }

    public void setObjList(List<Object> objList) {
        this.objList = objList;
    }

    public Map<String, Object> getObjMap() {
        return objMap;
    }

    public void setObjMap(Map<String, Object> objMap) {
        this.objMap = objMap;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "People [name=" + name + ", car=" + car + ", objs=" + Arrays.toString(objs) + ", objList=" + objList
                + ", objMap=" + objMap + ", prop=" + prop + "]";
    }
}
