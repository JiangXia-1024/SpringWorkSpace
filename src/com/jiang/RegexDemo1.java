package com.jiang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: 江夏
 * @Date: 2021/09/04/10:40
 * @Description: 正则表达式start 和 end 方法
 */
public class RegexDemo1 {
    //\b:匹配一个字边界，即字与空格间的位置。
    private static final String REGEX = "\\bHello\\b";
    private static final String INPUT = "Hello World Hello China";
    public static void main( String[] args ){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        // 获取 matcher 对象
        int count = 0;
        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
}
