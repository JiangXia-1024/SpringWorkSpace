package com.jiang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @Author: 江夏
 * @Date: 2021/09/03/21:30
 * @Description: 正则表达式验证邮件是否合法
 */
public class EmailConfirm {
    public static void main(String[] args) {
        // 要验证的字符串
//        String str = "testmail@163.com";
        String str = "testmailz163.com";
        // 邮箱验证规则
        String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);
//        System.out.println("\\");
//        System.out.println("\\\\");

    }
}
