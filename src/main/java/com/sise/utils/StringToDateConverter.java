package com.sise.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class StringToDate implements Converter<String, Date> {


    @Override
    public Date convert(String s) {
        if (s==null){
            throw new RuntimeException("请您传入数据！");
        }
        DateFormat df=new SimpleDateFormat("yyyy-mm-dd");


        try {
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换出错！");
        }
    }
}

