public class MulTab{
	public static void main(String[] args){
		int i=0;
		int j=0;
		int sum=1;
		for(i=1;i<10;i++){
			for(j=1;j<=i;j++){
				sum=i*j;
				System.out.print(" "+i+"*"+j+"="+sum);
				System.out.printf("%d * %d =%d\t",i,j,sum）;
			}
			System.out.println();//println带自动换行
		}
		
	}
}
