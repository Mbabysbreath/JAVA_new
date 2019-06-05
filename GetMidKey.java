class ListNode{
			int val;
			ListNode next;
			ListNode(int val){
				this.val=val;
			}
}
class Interview{
	public static ListNode getMidKey1(ListNode head){
		ListNode front=head;
		ListNode back=head;
		if(head==null){
			return null;
		}
		while(front!=null){
			front=front.next;
			if(front==null){
				break;
			}
			back=back.next;
			front=front.next;
		}
		return back;
	}
	public static ListNode getMidKey2(ListNode head){
		int length=0;
		for(ListNode cur=head;cur!=null;cur=cur.next){
			length++;
		}
		ListNode cur = head;
		for(int i=0;i<length/2;i++){
		cur=cur.next;
		}
		return cur;
	}
	public static ListNode display(ListNode head){
		for(ListNode cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d-->",cur.val);
		}
		System.out.printf("null%n");
		return head;
	}
}
public class GetMidKey{
	public static void test1(){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(6);
		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
		
		Interview s =new Interview();
		s.display(n1);
		ListNode result=s.getMidKey1(n1);
		s.display(result);
		System.out.printf("%d%n",result.val);
	}
	
	public static void test2(){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(6);
		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
		
		Interview s =new Interview();
		s.display(n1);
		ListNode result=s.getMidKey2(n1);
		s.display(result);
		System.out.printf("%d%n",result.val);
		
	}
	public static void main(String[] args){
		test1();
		test2();
}
}