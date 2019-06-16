class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
public class InterviewZM{
	//1.删除给定val
	public static ListNode removeValue(ListNode head,int val){
		if(head==null){
			return null;
		}
		ListNode cur = head;
		ListNode newList=null;
		ListNode last=null;
		while(cur!=null){
			ListNode next=cur.next;
			if(cur.val!=val){
				if(newList==null){
					newList=cur;
					
				}else{
					last.next=cur;
				}
				last=cur;
			}
			cur=next;
		}
		if(last!=null){
			last.next=null;
			}
			return newList;
	}
	
	//2.逆置单链表
	public static ListNode reverseList(ListNode head){
		if(head==null){
			return null;
		}
		ListNode newList=null;
		ListNode cur=head;
		while(cur!=null){
			ListNode next=cur.next;
			cur.next=newList;
			newList=cur;
			cur=next;
		}
			return newList;
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
		ListNode n3=new ListNode(9);
		ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(2);
        ListNode n7=new ListNode(8);
		//ListNode n7=new ListNode(5);
       // ListNode n8=new ListNode(6);
		n1.next=n2;n2.next=n3;
		n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		print(n1);
		ListNode result1=removeValue(n1,1);
		print(result1);
		ListNode result2=reverseList(n1);
		print(result2);
	}
}