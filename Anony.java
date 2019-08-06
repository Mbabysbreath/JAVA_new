class Anony1{//匿名类
    public void hi(){
        System.out.println("hi");
    }
    public void hello(){
        System.out.println("hello");
    }
}
public class Anony {
    public static void main(String[] args) {
        Anony1 ob=new Anony1(){//继承Anony1类的对象
            public void hi(){
                System.out.println("你好");
            }
        };
        ob.hi();
        ob.hello();
    }
}
