import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
     private static ListNode getMid(ListNode head){
            if(head==null){
            return null;
            }
            ListNode front=head;
            ListNode back=head;
            while(front!=null){
                front=front.next;
                if(front==null){
                    break;
                }else{
                    back=back.next;
                    front=front.next;
                }
            }
            return back;
        }
    private static ListNode reverseList(ListNode head){
            if(head==null){
                return null;
            }
            ListNode result=null;
            ListNode cur=head;
            while(cur!=null){
                ListNode next=cur.next;
                cur.next=result;
                result=cur;                                             ;
                cur=next;
            }
        return result;
    }
    public static boolean chkPalindrome(ListNode A) {
        // write code here
       ListNode mid=getMid(A);
       ListNode n2=reverseList(mid);
       ListNode n1=A;
       while(n1!=null&&n2!=null){
           if(n1.val!=n2.val){
                return false;
           }
           if(n1.val==n2.val){
               n1=n1.next;
               n2=n2.next;
           }
       }
        return true;
    }
	public static void print(ListNode head){
		ListNode cur=head;
		while(cur!=null){
			System.out.printf("%d-->",cur.val);
			cur=cur.next;
		}
			System.out.println("null");
	}
	public static void main(String[] args){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(3);
		ListNode n6=new ListNode(2);
        ListNode n7=new ListNode(1);
		//ListNode n7=new ListNode(5);
       // ListNode n8=new ListNode(6);
		n1.next=n2;n2.next=n3;
		n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		print(n1);
		if(true==chkPalindrome(n1)){
			System.out.print("是回文");
		}
		else{
			System.out.print("不是回文");
		}
  }
}