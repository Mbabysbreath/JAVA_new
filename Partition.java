import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public static ListNode partition(ListNode pHead, int x) {
        // write code here
       if(pHead==null){
            return null;
       }
        ListNode sList= null;
        ListNode lList=null;
        ListNode last2=null;
        ListNode last1=null;
		ListNode cur=pHead;
       // ListNode lHead=new ListNode(x);
        while(cur!=null){
            if(cur.val<x){
                if(sList==null){
                    sList=cur;
                }
                else{
                    last1.next=cur;
                }
                last1=cur;
            }
            
            else{
                if(lList==null){
                    lList=cur;
                }
				else{
                 last2.next=cur;
            }
                last2=cur;
        }   
            cur=cur.next;
	}
       if(sList==null){
            return lList;
       }else{
		    last1.next=lList;
            if(last2!=null){
                last2.next=null;
            }
        return sList;
     }
   }
	public static void print(ListNode head){
		ListNode cur=head;
		while(cur!=null){
			System.out.printf("%d-->",cur.val);
			cur=cur.next;
		}
			System.out.println("null");
	}
	public static void main(String args[]){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(6);
		ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(3);
		n1.next=n2;n2.next=n3;
		n3.next=n4;
		print(n1);
		ListNode m=partition(n1,3);
		print(m);
	}
}
