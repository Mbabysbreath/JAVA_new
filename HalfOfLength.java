public class HalfOfLength {
    static int[] bublesort(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
     static int halfOfLength(int array[]) {
        bublesort(array);
         if(array.length==1)
             return array[0];
         int count = 1;
         for (int i = 0; i+1 < array.length; i++) {
             if (array[i] != array[i+1]) {
                 if ((count) >array.length / 2) {
                       return array[i];
                 } else {
                     count = 1;
                     continue;
                 }
             } else {
                 count++;
                 if ((count) >=array.length / 2) {
                     return array[i];
                   }
                 }
             }
             return 0;
         }
         static  void halfOfLength2(int []array){
             bublesort(array);
             if(array.length==1)
                // return array[0];
                 System.out.println(array[0]);
             int count = 1;
             for (int i = 0; i+1 < array.length; i++) {
                 if (array[i] != array[i+1]) {
                     if ((count) >array.length / 2) {
                           System.out.println(array[i]);
                         //return array[i];
                           count = 1;
                     } else {
                         count = 1;
                         continue;
                     }
                 } else {
                     count++;
                     if ((count) >=array.length / 2) {
                          System.out.println(array[i]);
                       //  return array[i];
                         count = 1;
                     }
                 }
             }
             return ;

         }
    public static void main(String []args){
        int [] arr={1,3,1,2,1,5,7,1};
        int a=halfOfLength(arr);
        System.out.println(a);
        halfOfLength2(arr);
    }
}
