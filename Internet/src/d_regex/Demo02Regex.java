package d_regex;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02Regex {
    public static void main(String[] args) {
        //method01();
        //method02();
        //method03();
        //method04();
        //method05();
        method06();
    }

    private static void method06() {
        //string[〕split(String regex)根据给定正则表达式的匹配拆分此字符串。
        String s1 = "abc hahah hehe   fsggggsgf";
        String[] arr1 = s1.split(" +");
        System.out.println(Arrays.toString(arr1));
        //string replaceAll(string regex，String replacement)把满足正则表达式的字符串，替换为新的字符
        String s2 = s1.replaceAll(" +", "ZZZZ");
        System.out.println("s2 = " + s2);
    }

    //分组括号
    private static void method05() {
        //校验abc可以出现任意次
        boolean result01 = "abcabcabc".matches("(abc)*");
        System.out.println("result01 = " + result01);
    }

    //数量词
    private static void method04() {
        //1.验证字符串是否是三位数字
        //boolean result01 = "111".matches("[0-9][0-9][0-9]");
        boolean result01 = "111".matches("\\d{3}");
        System.out.println("result01 = " + result01);

        //2.验证手机号：1开头第二位358剩下的都是0-9的数字
        boolean result02 = "15988893275".matches("[1][358]\\d{9}");
        System.out.println("result02 = " + result02);

        //3.验证qq号：不能是0开头，都是数字，长度为5-15
        boolean result03 = "1111111111".matches("[1-9][0-9]{4,14}");
        System.out.println("result03 = " + result03);
    }

    //预定义字符
    private static void method03() {
        //1.验证字符串是否是三位数字
        //boolean result01 = "111".matches("[0-9][0-9][0-9]");
        boolean result01 = "111".matches("\\d\\d\\d");
        System.out.println("result01 = " + result01);

        //2.验证手机号：1开头第二位358剩下的都是0-9的数字
        boolean result02 = "15988893275".matches("[1][358]\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        System.out.println("result02 = " + result02);

        //3.验证字符串是否以h开头，d结尾，中间是任意一个字符
        boolean result03 = "had".matches("[h].[d]");
        System.out.println("result03 = " + result03);
    }

    //逻辑运算符
    private static void method02() {
        //1.要求字符串是小写字母并且字符不能以[aeiou]开头,后面跟ad
        boolean result01 = "yad".matches("[[a-z]&&[^aeiou]][a][d]");
        System.out.println("result01 = " + result01);

        //2.要求字符是aeiou的某一个字符开头,后面跟ad
        boolean result02 = "aad".matches("[a|e|i|o|u][a][d]");
        System.out.println("result02 = " + result02);
    }

    //字符类
    private static void method01() {
        //1.验证字符串是否以h开头，d结尾，中间是aeiou的某一个字符
        boolean result01 = "had".matches("[h][aeiou][d]");
        System.out.println("result01 = " + result01);

        //2.验证字符串是否以h开头，d结尾，中间不是aeiou的某个字符
        boolean result02 = "hyd".matches("[h][^aeiou][d]");
        System.out.println("result02 = " + result02);

        //3.验证字符串是否是开头a-z的任意一个小写字母，后面跟ad
        boolean result03 = "had".matches("[a-z][a][d]");
        System.out.println("result03 = " + result03);

    }

}
