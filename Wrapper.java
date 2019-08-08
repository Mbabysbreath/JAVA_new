
public class Wrapper {
    public static void main(String[] args) {
        int a=7;
        String b="123";
        Integer w1=new Integer(a);
        Integer w2=new Integer(b);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1.byteValue());
        System.out.println(w1.parseInt("12"));
        int c=Integer.parseInt("123",8);
        System.out.println(c);
        System.out.println(Integer.toBinaryString(-1));.
    }
}
