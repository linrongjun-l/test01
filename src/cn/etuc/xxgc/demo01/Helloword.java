package cn.etuc.xxgc.demo01;

public class Helloword {
String name;
int age;

    public Helloword() {
    }

    public Helloword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        /*int n=10;
        Random r=new Random();
        int num=r.nextInt(n)+1 ;//本来范围是[0,n)，整体+1后变成了[1,n+1),也就是[1,n]
        System.out.println(num);
        System.out.println("===================");
        double d=Math.random();
        int i= (int) (Math.random()*10);//获取[0,10）随机数
        System.out.println(d);*/


        //生成[max,min]这个范围的随机数
        /*int max=20,min=10;
        Random r=new Random();
        int s =r.nextInt(max)%(max-min+1)+min;
        System.out.println(s);
        System.out.println("===============");
        for (int i = 0; i < 100; i++) {


        int q=r.nextInt(max);
            System.out.print(q+" ");
        int q1=q%(max-min);
            System.out.print(q1+" ");
        int q2=q1+min;
            System.out.println(q2+" ");

           }*/


        //备注：从JDK1.7开始，右侧尖括号<>内容可以不写，尖括号<>本身还要写
        /*ArrayList<String> list =new ArrayList<>();
        //向集合当中添加一些数据，常用方法是add
        list.add("许佳琪");
        list.add("于文文");
        list.add("王一博");
        System.out.println(list);

        //从集合中获取元素：get
        String s = list.get(0);
        String s1 = list.get(1);
        System.out.println("0号位置元素是："+s+"\n1号位置元素是："+s1);

        //从集合中删除元素：remove
        String whoRemoved = list.remove(2);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);

        //获取集合长度：size
        int size = list.size();
        System.out.println("集合长度是："+size);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //foreach遍历
        ArrayList<Helloword> list1=new ArrayList<>();
        Helloword h1=new Helloword("张三",18);
        Helloword h2=new Helloword("李四",20);
        list1.add(h1);
        list1.add(h2);
        for (Helloword hh:list1)
        {
            System.out.println(hh.getName()+" "+ hh.getAge());;
        }
        //迭代器
        Iterator<Helloword> iter=list1.iterator();
        while (iter.hasNext()){
            Helloword hhh=iter.next();
            System.out.println(hhh.getAge()+"  "+hhh.getName());
        }
        Random random=new Random();
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int r= random.nextInt(33)+1;
            list2.add(r);
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+"  ");
        }*/

      /* int [] array={10,20,30};
        String s = Arrays.toString(array);
        System.out.println(s);

        int[] array1={5,2,6,8,10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));*/
        Zi zi=new Zi();
        zi.method();
    }
    }




