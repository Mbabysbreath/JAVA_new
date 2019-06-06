class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
class Interview{
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		ListNode cur1=l1;
		ListNode cur2=l2;
		ListNode result=null;
		ListNode last=null;
		while(cur1!=null&&cur2!=null){
			
		if(cur1.val<=cur2.val){
			ListNode next=cur1.next;
			if(result==null){
				cur1.next=result;
				result=cur1;
			}
			else{
				cur1.next=null;//为什么？？？
				last.next=cur1;
			}
			last=cur1;
			cur1=next;
		}
		else{
			if(cur1.val>cur2.val){
				ListNode next=cur2.next;
				if(result==null){
					cur2.next=result;
					result=cur1;
				}
				else{
					cur2.next=null;
					last.next=cur2;
				}
				last=cur2;
				cur2=next;
			}
		}
	
	}
	if(cur1!=null){
		last.next=cur1;
	}
	if(cur2!=null){
		last.next=cur2;
	}
	return result;
	}
	public static ListNode display(ListNode head){
		ListNode cur=head;
		for(cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d-->",cur.val);
		}
		System.out.printf("null%n");
		return head;
	}
}
public class MergeTwoLists{
	public static void test(){
		Interview s=new Interview();
		ListNode l1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(6);
		l1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
		s.display(l1);
		ListNode l2 = new ListNode(2);
		ListNode m2 = new ListNode(4);
		ListNode m3 = new ListNode(5);
		ListNode m4 = new ListNode(6);
		ListNode m5 = new ListNode(7);
		ListNode m6 = new ListNode(7);
		l2.next = m2; m2.next = m3; m3.next = m4; m4.next = m5; m5.next = m6;
		s.display(l2);
		ListNode result=s.mergeTwoLists(l1,l2);
		s.display(result);
	}
	public static void main(String[] args){
		test();
	}
}