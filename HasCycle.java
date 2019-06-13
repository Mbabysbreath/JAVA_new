/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class HasCycle {
    public static boolean hasCycle(ListNode head) {
         ListNode front=head;
        ListNode back=head;
        if(head==null){
            return false;
        }
        if(head.next==head){
            return true;
        }
        while(front!=null){
            front=front.next;
            if(front!=null&&front.next!=null){
                front=front.next;
                back=back.next;
                if(back.next==front.next){
                return true;
            }
            
            }
        }
        return false;
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
        ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
		//ListNode n7=new ListNode(5);
       // ListNode n8=new ListNode(6);
		n1.next=n2;n2.next=n3;
		n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		n7.next=n3;
		if(true==hasCycle(n1)){
			System.out.printf("链表有环");
		}else{
			System.out.printf("链表无环");
		}
		print(n1);
		
	}
}