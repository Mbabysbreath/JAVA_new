public class TwoDimArr {
    public static boolean Find(int [][]arr,int key){
        int row=arr.length;
        int col=arr[0].length;
        int i=0;
        int j=col-1;
        while(i<row&&j>=0){
            if(key==arr[i][j]){
                return true;
            }else if(key>arr[i][j]){
                i++;
            }else if(key<arr[i][j]){
                j--;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int [][]arr={{1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}};
        System.out.println(Find(arr,6));
    }
}
