package com.djs;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class ReplaceTest {
    public static void main(String[] args) {
        String dateStr = "2017-03-01";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
        String sr = "0.maven配置\n" +
                "1.maven先启动memcached\n" +
                "2.按顺序启动tomcat   18000";
        System.out.println(sr.replaceAll("maven","djs"));
        System.out.println("分割线-----------------------------------------------");
        System.out.println(sr.replace("maven","djs"));
    }
}
