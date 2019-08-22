package API_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 该程序提供使用Vector进行
 * 添加、删除、插入、输出功能
 * 可自行选择相应功能进行处理
 */
public class Vector2 {
    static void display(Vector v) {
        System.out.println("++++++START++++++++++");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.elementAt(i) + " ");
        }
        System.out.println(v.size());
        System.out.println("========END==============");
    }

    public static void main(String[] args) throws Exception {
        Vector v = new Vector();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String select;
        while (true) {
            System.out.println("<<1.添加 2.删除 3.插入 4.退出 ");
            System.out.println("请选择---");
                select = br.readLine();
                if (select.equals("1")) {
                    System.out.println("请输入要添加的字符串");
                    v.add(br.readLine());
                   // v.size();
                    display(v);
                } else if (select.equals("2")) {
                    System.out.println("请输入要删除的字符串的编号");
                    v.removeElementAt(Integer.parseInt(br.readLine()));//int parseInt(String str,int radix)函数
                    //解析传入的字符串，返回整数，radix表示进制，可省略不写
                    display(v);
                } else if (select.equals("3")) {
                    System.out.println("请输入要插入的字符串的下标和值");
                    v.add(Integer.parseInt(br.readLine()),br.readLine());
                    display(v);
                }else if(select.equals("4")){
                    break;
                }
            }
        }
    }
