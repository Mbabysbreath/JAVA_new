public class Practice0514{
	public static long calcDigitNum(int n){//计算数字的位数
		int count=0;
		for(;n>0;n=n/10){
			count++;
		}
		return count;
	}
	
	public static long factorial1(int n){//递归计算n的阶乘
		if(n==0||n==1){
			return 1;
		}
			else{
				return factorial1(n-1)*n;
			}
	}
	public static long factorial2(int n){//非递归计算n的阶乘
		long ret=1;
		int i=0;
		for(i=1;i<=n;i++){
			ret=ret*i;
		}
		return ret;
	}
	/**
     * 利用公式
     * e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ...
     * 计算自然对数的底 e
     * @param n 一共需要计算 n 项
     * @return
     */
	 public static double calcE(int n){
		 double e=0;
		 int i=0;
		 for(i=0;i<n;i++){
			 e=e+(double)1/factorial1(i);
	 }
	 return e;
	 }
	 /**
     * 利用公式
     * Pi / 4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
     * 计算 pi 的值
     * @param n 一共计算 n 项
     * @return
     */
	 public static double calcPi(int n){
		 double Pi=0;
		 int i=0;
		 for(i=0;i<n;i++){
			 if(i%2==0){
				 Pi=Pi+1.0/(2*i+1);
			 }
				else{
					Pi=Pi-1.0/(2*i+1);
				}
		 }
		 return Pi*4;
				 
	 }
	 public static String reverse(String s){//charAt(i)返回指定索引处的字符。索引范围从0到length-1
			//s="www.fqffgart" s.charAt(6)=q;
		 int length=s.length();
		 int i=0;
		 String r="";
		 for(i=length-1;i>=0;i--){
			char ch=s.charAt(i);
			r=r+ch;
		 }
	 return r;
	 }
	 /**
     * 10 进制转 16 进制，计算公式如下例
     * 1958 转 16 进制
     * 1958 % 16 == 6   1958 / 16 == 122
     * 122 % 16 == 10 也就是 A   122 / 16 == 7
     * 7 < 16
     * 1958 的 16 进制 为 7A6
     * @param n
     * @return
     */
	 public static String decToHex(int dec){
		 String hex="";
		 while(dec>10){
			 int ret=dec%16;
			 dec=dec/16;
			 if(ret<10){
				 hex=hex+ret;
			 }
			 else{
				 char ch=(char)('A'+(ret-10));
				 hex=hex+ch;
			 }
		 }
			 if(dec!=0){
				 hex=hex+dec;
			 }
			 return reverse(hex);
		 }
			public static void main(String args[]){
		int n=18;
		System.out.printf("%d有%d位%n",n,calcDigitNum(n));
		System.out.printf("%d的阶乘为%d%n",n,factorial1(n));
		System.out.printf("%d的阶乘为%d%n",n,factorial2(n));
		System.out.printf("e的值为%f%n",calcE(n));
		System.out.printf("Pi的值为%f%n",calcPi(n));
		System.out.println("s逆置后的值为"+reverse("Hello"));
		System.out.println(decToHex(2345));
	}
}