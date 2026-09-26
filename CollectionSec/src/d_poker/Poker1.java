package d_poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker1 {
    public static void main(String[] args) {
        //1.创建数组 => color => 专门存花色
        String[] color = "♠-♥-♣-♦".split("-");

        //2.创建数组 => number => 专门存牌号
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");

        //3.创建map集合，key为序号，value为组合好的牌面
        HashMap<Integer, String> poker = new HashMap<>();

        //4.创建一个ArrayList，专门存储key
        ArrayList<Integer> keys = new ArrayList<>();
        keys.add(0);
        keys.add(1);

        //5.组合牌，存储到map中
        int key = 2;
        for (String col : color) {
            for (String num : number) {
                poker.put(key, col + num);
                keys.add(key);
                key++;
            }
        }

        poker.put(0,"大王");
        poker.put(1,"小王");

        //System.out.println(keys);
        //System.out.println(poker);

        //6.洗牌，打乱list集合中的key
        Collections.shuffle(keys);

        //7.创建4个ArrayList集合,分别代表三个玩家，以及存储一个底牌
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        //8.发牌
        for (int i = 0; i < keys.size(); i++) {
            Integer val = keys.get(i);
            if (i >= poker.size() - 3) dipai.add(val);

            //9.如果index%3==0 给p1
            if (i % 3 == 0) p1.add(val);

            //10.如果index%3==1 给p2
            if (i % 3 == 1) p2.add(val);

            //11.如果index%3==2 给p3
            if (i % 3 == 2) p3.add(val);
        }

        //12.排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dipai);

        //12.遍历看牌
        lookPoker("晓峰",p1,poker);
        lookPoker("忻浙",p2,poker);
        lookPoker("老头",p3,poker);
    }

    private static void lookPoker(String name, ArrayList<Integer> keys, HashMap<Integer, String> poker) {
        System.out.print(name + ":");
        for (Integer key : keys) {
            System.out.print(poker.get(key)+ " ");
        }
        System.out.println();
    }
}
