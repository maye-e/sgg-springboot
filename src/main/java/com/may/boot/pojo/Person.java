package com.may.boot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 映射配置文件中的属性值到组件中
 * ConfigurationProperties 将本类中所有属性与配置文件中的配置绑定。默认从全局配置文件中获取值
 * Component 只有这个类是容器中的组件，才能使用容器提供的 ConfigurationProperties 功能
 * PropertySource 加载指定的配置文件
 */
@Component
@PropertySource(value = {"classpath:pojo_prop/person.properties"})//支持指定多个文件
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

//    @Email // 支持 jsr303 校验
    private String name;
    private Integer age;
    private Boolean boss;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
