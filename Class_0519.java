import java.util.Arrays;
public class Class_0519{
	public static void initArray(){
		int[] array={1,2,3,4,5};
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]);//Arrays.toString(array)
		}
	}
	public static int max(int[] array){
		int maxValue=Integer.MIN_VALUE;
		for(int item:array){
			if(item>maxValue){
				maxValue=item;
			}
		}
		return maxValue;
	}
	
	public static int min(int[] array){
		int minValue=array[0];
		for(int item:array){
			if(item<minValue){
				minValue=item;
			}
		}
		return minValue;
	}
	
	public static int indexOf(int[] array,int key){
		for(int i=0;i<array.length;i++){
			if(array[i]==key){
				return i;
			}
		}
		return -1;
	}
	
	
		public static double average(int[] scores){
			//int minValue=scores[0];
			//int maxValue=scores[0];
			//double aveScores=0;
			int sum=scores[0];
			int maxValue=max(scores);
			int minValue=min(scores);
			for(int i=0;i<scores.length;i++){
				 sum+=scores[i];
		}
		return (double)((sum-minValue-maxValue)/(scores.length-2));
		}
		
		
		public static int[] copyOf(int[] src,int newLength){
			//newlength 可能大于 src.length;
			//newlength 可能小于等于src.length;
			int[] dest=new int[newLength];
			int minLength=src.length<newLength?src.length:newLength;
			for(int i=0;i<minLength;i++){
				dest[i]=src[i];
			}
			return dest;
		}
		
		public static int binarySearch(int[] array,int key){//二分查找
				int left=0;
				int right=array.length-1;
				
				while(left<=right){
					int mid=(left+right)/2;
					//int mid=left+(rigth-left)/2;
					if(array[mid]==key){
						return mid;
					}
				    else if(array[mid]<key){
						left=mid+1;
					}
					else if(array[mid]>key){
						right=mid-1;
					}
				}
				return -1 ;
		}
		
		public static void swap(int[] array,int i,int j){//
			int t=array[i];
			array[i]=array[j];
			array[j]=t;
		}
		public static void bubbleSort(int[] array){//冒泡,减治算法，两两比较
			//int max=array[0];
			for(int i=0;i<array.length;i++){//无序部分 ：0，array.length-i;
				boolean isSwapped=false;
				for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
				swap(array,j,j+1);
				isSwapped=true;
				}
		}
		if(!isSwapped){
			return ;
		}
	}
}
		public static void main(String args[]){
			initArray();
			System.out.println();
			int[] array=new int[]{1,2,3,4,5,6,7};
			//int[] array={1,2,3,4,5,6,7};
			int maxValue=max(array);
			System.out.println("最大值"+maxValue);
			
			int minValue=min(array);
			System.out.println("最小值"+minValue);
			
			int index=indexOf(array,7);
			System.out.println("7的下标是"+index);
			
			double averageScore=average(array);
			System.out.printf("平均分是 %.4f%n",averageScore);
			
			System.out.println(Arrays.toString(copyOf(array,3)));
			System.out.println(Arrays.toString(copyOf(array,10)));
			
			
			int index2=binarySearch(array,7);
			System.out.printf("7所在的下标是%d%n",index2);
			int[] randomArray=new int[]{9,5,2,7,3,6,4,8};
			bubbleSort(randomArray);
			System.out.println(Arrays.toString(randomArray));
		}
	
}