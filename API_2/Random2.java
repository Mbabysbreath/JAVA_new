package API_2;
import  java.util.*;
/**
 * 石头剪刀布
 */
public class Random2 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] select={1,2,3};
        System.out.println("+++++开始++++++");
        System.out.println("请选择：1.剪子 2.石头 3.布");
        Scanner s=new Scanner(System.in) ;
        String play="Y";
        int me=0;
        int computer=0;
       // int time=5;
        while(play.equals("Y")) {
            int a = s.nextInt();
            int b = random.nextInt(3);
            if (a == 1) {
                System.out.println("玩家：剪子");
                switch (b) {
                    case 0:
                        System.out.println("计算机：剪子 平局");break;
                    case 1:
                        System.out.println("计算机：石头 计算机胜");
                        computer++;
                        break;
                    case 2:
                        System.out.println("计算机：布 玩家胜");
                        me++;
                        break;
                }
            }
            System.out.println("再来一局：Y/N");
            Scanner s1=new Scanner(System.in);
            String ob2=s1.nextLine();
            if(ob2.equals("Y")){
                play="Y";
            }else
                play="N";

        }System.out.printf("比分：%d:%d",me,computer);
                                                                                                                                                                                                                                                                                                                                                                                                                                                 HashMap<Integer,String> hm=new HashMap<>();
      /*  hm.put(1,"剪子");
        hm.put(2,"石头");
        hm.put(3,"布");*/
    }
}
