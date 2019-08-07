//内隐类——静态类
class Outer1{
    static int a=10;
    int b=20;
    static void f(){
        System.out.println("hi~~");
    }
    static class Inner{
        public void g(){
            f();
            System.out.println(a+" ");
        }
    }
}

public class Static {
    public static void main(String[] args) {
        Outer1.Inner ob=new Outer1.Inner();
        ob.g();
    }
}
