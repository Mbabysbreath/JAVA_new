public class Local1 {//内隐类——内部类
    void f(final int a,int b){
        int c=30;
        final int d=40;
        class Inner{
            int e=100;
            void hi(){
                System.out.println(a);
                System.out.println(d);
                System.out.println(c);
                System.out.println(b);
                System.out.println(e);
            }

        }
        Inner in =new Inner();
        in.hi();
    }

    public static void main(String[] args) {
        Local1 local=new Local1();
        local.f(10,20);
    }

}
