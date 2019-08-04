/*import java.util.*;
public class Enumeration1 implements  Enumeration {
    Object[] data;//元素数组
    int count;//下一个待取元素位置
    public Enumeration1(Object[] data){
        this.data=data;
    }

    @Override
    public boolean hasMoreElements() {
        return count<data.length;
    }
    public Object nextElement(){
        if(count<data.length){
            return data[count++];
        }
        return null;
    }

    public static void main(String[] args) {
        String[] arr=new String[]{"abc","def","ghi","jkl"};
        Enumeration1 enum1 = new Enumeration1(arr);
        while(enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }
    }
}
*/
import java.util.*;
public class Enumeration1 implements Enumeration{
    Object[] data;
    int count;
    public Enumeration1(Object[] data){
        this.data=data;
    }
    public boolean hasMoreElements(){
        return count<data.length;
    }
    public Object nextElement(){
        if(count<data.length){
        return data[count++];
    }
        return null;
    }
    public static void main(String[] args){    String [] arr=new String[]{"abc","def","ghi"};
        Enumeration1 enum1=new Enumeration1(arr);
        while(enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }
    }
}