class Outer{//内隐类——成员类
    public  int a=10;
     int b=20;
     String e="Outer";
     void f(){
        System.out.println("hi");
    }
    class Inner{
        int c=30;
        static final int d=1;
        String e="Inner";
        void g(){
             b=100;
            f();
            System.out.println(a+" "+c);
            System.out.println(this.e);
            System.out.println(Outer.this.e);
        }



    }
}

public class Member {
    public static void main(String[] args) {
        Outer ob1=new Outer();
        Outer.Inner ob2=ob1.new Inner();
        ob2.g();
        System.out.println(ob1.b);
        System.out.println(ob2.d);

    }


}
