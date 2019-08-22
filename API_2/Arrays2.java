package API_2;
import java.util.*;

/**
 * 以面积为比较标准，比较两个四边形对象
 */
class Sagak implements Comparable{ //矩形类
    private int width;
    private int height;
    public Sagak(int width,int height){
        this.width=width;//宽
        this.height=height;//高
    }
    private int getArea(){
        return width*height;
    }

    @Override
    public int compareTo(Object o) {
        Sagak s=(Sagak)o;
        return getArea()-s.getArea();
    }
}
public class Arrays2 {
    public static void main(String[] args) {
        Sagak s1=new Sagak(1,2);
        Sagak s2=new Sagak(2,3);
        System.out.println(s1.compareTo(s2));
    }
}
