public class String2 {
    public static void main(String[] args) {
        String s1=new String(" ZhaoMin I like you ");
        String s2=new String("abcdef");
        System.out.println(s1.length());
        System.out.println(s1.replace(' ','Y'));
        System.out.println(s1.replaceAll("ZhaoMin","GuTianLe"));
        System.out.println(s1.startsWith("Z"));
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(7,11));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println(String.valueOf(12.22));
        String s3=s2.concat("g");
        String s4=s3.replaceAll("efg","EFG");
        System.out.println(s4);
    }
}
