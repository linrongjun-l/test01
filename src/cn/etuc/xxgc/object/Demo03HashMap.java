package cn.etuc.xxgc.object;

import cn.etuc.xxgc.jk.Out;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03HashMap {
    public static void main(String[] args) {
        demo01();

    }

    private static void demo01() {
        //创建Map 集合对象 多态
        /*
         * public V put(K key,V value):把指定的键与指定的值添加到集合中
         *       返回值：V
         *           存储键值对时候，key 不重复，返回值V是null
         *           存储键值对时候，key 重复，会使用v新alue替换map中重复的value，返回被替换值V
         *
         * */
        Map<String,String> map =new HashMap<>();
        String put = map.put("李晨", "范冰冰1");
        System.out.println(put);//put:null
        String put1 = map.put("李晨", "范冰冰3");
        System.out.println(put1);//put1:范冰冰1

        Map<String, Integer> map1 =new HashMap<>();
        map1.put("迪丽热巴",176);
        map1.put("古力娜扎",165);
        map1.put("许佳琪",170);
        System.out.println(map);
        System.out.println("============");
        /*
         * public V remove(Object key)把指定的key 所对应的键值对元素，在Map集合中删除
         *       返回值：被删除元素的值
         *               Key存在：返回被删除的值
         *               key不存在，返回null
         * */
        Integer r = map1.remove("古力娜扎");
        System.out.println("r:"+r);//165

        Integer r2 = map1.remove("古力娜扎");
        System.out.println("r2:"+r2);//null
        System.out.println("===============");
        /*
         * public V get(Object key)根据指定的键 在Map集合中获取对应值
         *       返回值;
         *           key存在，返回对应的value值
         *           key不存在，null
         * */
        Integer v = map1.get("迪丽热巴");
        System.out.println(v);//176
        System.out.println("============");
        /*
         * boolean containsKey(Object key)判断集合指定的key是否存在
         *       包含返回true 不包含返回false
         * */
        boolean v3 = map.containsKey("迪丽热巴");
        System.out.println(v);//true
        boolean v1 = map.containsKey("于文文");
        System.out.println(v1);//false
        System.out.println("==========");
        /*
        * Map集合的第一种遍历方式：通过键找值对方式
        *   Set<K> keySet()
        * */
        //1.使用Map集合的方法keySet(),把Map集合所有key取出存Set中
        Set<String> set = map1.keySet();
        //2. 遍历Set集合
        Iterator <String> i= set.iterator();
        while (i.hasNext()){
            String key = i.next();
            Integer value = map1.get(key);
            System.out.println(key+"="+value);
        }
        /*for (String key:set) {
            Integer value = map1.get(key);
            System.out.println(key+"="+value);
        }*/
        System.out.println("================");

        /*
        *  Map集合第二种遍历方式：使用Entry对象遍历
        *  Map集合中方法：
        *    Set<Map.Entry<String, String>> set = map.entrySet();

         * */

        //1.使用map集合中的entrySrt(),把键值对存在Set集合中
        Set<Map.Entry<String, Integer>> set1 = map1.entrySet();
        //2. 遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<String, Integer>> i1 = set1.iterator();
        while (i1.hasNext()){
            Map.Entry<String, Integer> entry = i1.next();
            //3. 使用Entry对象中的方法getKey(),getValue()
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" : "+value);
        }
        System.out.println("========");

    }
}
