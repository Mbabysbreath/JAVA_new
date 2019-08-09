public class Exception2 {
    static void go(int size) throws NegativeArraySizeException{
        int[] a=new int[size];
        System.out.println(a.length);
    }
    public static void main(String[] args){
        try{
            go(-1);//NegativeArraySizeException异常
        }catch(Exception e){
            System.out.println("go()方法抛出异常");
        }
        try{
            go(10);//未发生异常
        }catch(Exception e){
            System.out.println("go()方法抛出异常");
        }
    }
}
