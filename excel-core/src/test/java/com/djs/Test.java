package com.djs;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String dateStr = "2017-03-01";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }
}
