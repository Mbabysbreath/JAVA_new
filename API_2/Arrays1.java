/**
 * @auther zhaomin
 * @Date 2019-08-21
 *
 */
package API_2;
import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 13, 14, 15, 21, 11, 0, 1, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Scanner s = new Scanner(System.in);
        while(true) {
            int s1 = s.nextInt();
            System.out.printf("%d所在位置：%d", s1, Arrays.binarySearch(arr, s1));
        }
    }
}
