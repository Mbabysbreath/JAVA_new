 
 public class IsPalindrom{
	public static boolean isPalindrome(int x) {
        int[] array=new int[10];
        int i=0;
        int size=0;
        int j=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int pop=x%10;
            array[i++]=pop;
            x/=10;
        }
        size=i;
        for(i=0;i<size;i++){
            for(j=size-1-i;j>size-i-2;j--){
                  if(array[i]!=array[j])
                return false;
            }
          
        }
        return true;
    }
	public static void main(String[] args){
		boolean result=isPalindrome(1221);
		if(result==true){
			System.out.println("Is Palindrom");
		}else{
			System.out.println("Is not Palindrom");
		}
	}
 }