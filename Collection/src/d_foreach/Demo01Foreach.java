package d_foreach;

import java.util.ArrayList;

public class Demo01Foreach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("硝烟");
        list.add("小星星");
        list.add("撒旦法");
        list.add("法国人");
        list.add("湿粉膏");
        for (String s : list) {
            System.out.println(s);
        }
        
        System.out.println("==================");

        int[] arr = {1,2,3,4,5,6};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
