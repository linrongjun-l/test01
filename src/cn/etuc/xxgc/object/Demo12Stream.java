package cn.etuc.xxgc.object;

import java.util.ArrayList;
import java.util.List;

public class Demo12Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("kiki_许佳琪");
        list.add("于文文");
        list.add("虞书欣");
        list.add("赵小堂");
        list.stream().forEach(age-> System.out.println(age));
    }
}

