class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
	    val = x;
        next = null;
    }
  }
public class GetIntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
			
        ListNode cur1=headA;
        ListNode cur2=headB;
        int len1=0,len2=0;
        for(cur1=headA;cur1!=null;cur1=cur1.next){
            len1++;
        }
        for(cur2=headB;cur2!=null;cur2=cur2.next){
            len2++;
        }
        cur1=headA;
        cur2=headB;
            if(len1<len2){
                for(int i=0;i<len2-len1;i++){
                    cur2=cur2.next;
                }
            }
            if(len1>len2){
                for(int i=0;i<len1-len2;i++){
                cur1=cur1.next;
				}
			}
			
			while(cur1!=cur2){
				cur1=cur1.next;
				cur2=cur2.next;
			}
			if(cur1==null){
				return null;
			}
        return cur1;
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
		ListNode head=new ListNode(1);
		ListNode n2=new ListNode(3);
		ListNode n3=new ListNode(5);
		ListNode n4=new ListNode(8);
		ListNode n5=new ListNode(19);
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		ListNode head2=new ListNode(1);
		ListNode m2=new ListNode(2);
		head2.next=m2;
		m2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		print(head);
		print(head2);
		
		
		System.out.println(getIntersectionNode(head,head2).val);
	}
}