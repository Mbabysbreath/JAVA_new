 
 // 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

// 示例 1:

// 输入: 123
// 输出: 321
//2^31-1=2147483647,-2^31=-2147483648
public class ReverseInt{
	 public static int reverse(int x) {
        //result=result*10+pop;
        //result!>MAx/10
        //pop!.Max%10
        int result=0;
        int pop=0;//余数
        while(x!=0){
            pop=x%10;
            if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE&&pop>7)){
                    return 0;
            }
             if(result<Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE&&pop<-8)){
                    return 0;
            }
                result=result*10+pop;
            x/=10;
        }
        return result;
    }
	public static void main(String[] args){
		int result=reverse(639988);
		System.out.println(result);
	}
 }
 