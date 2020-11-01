package cn.etuc.xxgc.demo;

import com.sun.javafx.image.impl.IntArgb;

import java.util.*;

/*
* 斗地主综合案例：有序版本
* */
public class Demo02DouDizhu {
    public static void main(String[] args) {
        //1准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poke=new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokeIndex=new ArrayList<>();
        //定义两个集合，储花色和牌号
        String[] colors={"♠","♥","♣","◆"};
        String[] numbers= {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大王小王存储到集合
        //定义一个索引
        int index=0;
        poke.put(index,"大王");
        pokeIndex.add(index);
        index++;
        poke.put(index,"小王");
        pokeIndex.add(index);
        index++;

        //循环嵌套遍历两个集合，组装牌
        for (String number:numbers) {
            for (String color:colors){
                poke.put(index,number+color);
                pokeIndex.add(index);
                index++;
            }
        }
        //System.out.println(pokeIndex);
        // System.out.print(poke);
        /*
        *    2.洗牌
        * */
        Collections.shuffle(pokeIndex);
        /**
         * 3.发牌
         */
        //定义四个集合，存储玩家牌和底牌索引
        ArrayList<Integer> player01=new ArrayList<>();
        ArrayList<Integer> player02=new ArrayList<>();
        ArrayList<Integer> player03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        //遍历索引的List集合，获取每一个牌的索引
        for (int i = 0; i < pokeIndex.size(); i++) {
            Integer in = pokeIndex.get(i);
            if (in>=51){
                dipai.add(i);
            }else if (i%3==0){
                player01.add(i);
            }else if (i%3==1){
                player02.add(i);
            }else if (i%3==2){
                player03.add(i);
            }
        }
        /*
        * 4.排序
        * */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
        Demo02DouDizhu.lookPoke("张三",poke,player01);
        Demo02DouDizhu.lookPoke("李四",poke,player02);
        Demo02DouDizhu.lookPoke("王五",poke,player03);
        Demo02DouDizhu.lookPoke("底牌",poke,dipai);
    }
    /**
     *
     * 定义一个看牌的方法
     * 参数:
     *      String name:玩家名称
     *      HashMap<Integer,String> poker：储存牌的poke集合
     *      ArrayList<Integer>  list：存储玩家和底牌list集合
     */

  public  static void lookPoke(String name, HashMap<Integer,String> poker,ArrayList<Integer>  list){
      System.out.print(name+" ");
      //遍历玩家或底牌集合，获取索引
      for (Integer key:list){
          String values = poker.get(key);
          System.out.print(values+" ");
      }
      System.out.println();
  }
}
