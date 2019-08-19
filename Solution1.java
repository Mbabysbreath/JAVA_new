import java.util.*;
public class Solution1 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        if(numRows>=1)
        list.get(0).add(0, 1);
            for (int i = 1; i < numRows; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        list.get(i).add(1);
                        continue;
                    }
                    int num = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    list.get(i).add(j, num);
                }
            }
            return list;
    }
    public void print(List<List<Integer>> list){
        System.out.println("[");
        for(int i=0;i<list.size();i++){
            for(int j=0;j<=i;j++){
                System.out.print(list.get(i).get(j)+",");
            }
            System.out.println();
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
       Solution1 ob=new Solution1();
       Scanner s=new Scanner(System.in);
       int numRows=s.nextInt();
       ob.generate(numRows);
       ob.print(ob.generate(numRows));

    }
}
