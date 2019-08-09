public class String3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer("abc");
        StringBuffer sb2=new StringBuffer("ZHAOMIN!");
        sb.append("ABC");
        sb.append(123);
        sb.append(true);
        sb.deleteCharAt(1);
        sb1.delete(1,2);
        sb1.insert(1,"@@");
        System.out.println(sb);
        System.out.println(sb1);
     sb1.insert(2,12.22);
        System.out.println(sb1);
        sb2.replace(0,4,"Zhao");
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);

    }
}
