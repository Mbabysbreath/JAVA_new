class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
class Interview{
	public static ListNode getKNode1(ListNode head,int k){
		int length=0;
		for(ListNode cur=head;cur!=null;cur=cur.next){
			length++;
		}
		ListNode cur=head;
		if(length<k){
			return null;
		}
		for(int i=0;i<length-k;i++){
			cur=cur.next;
		}
		return cur;
	}
	public static ListNode getKNode2(ListNode head,int k){
		ListNode front=head;
		ListNode back=head;
		for(int i=0;i<k;i++){
			if(front==null){
				return null;
			}
			front=front.next;
		}
		
		while(front!=null){
			front=front.next;
			back=back.next;
		}
		return back;
	}
	public static ListNode display(ListNode head){
		for(ListNode cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d-->",cur.val);
		}
		System.out.printf("null%n");
		return head;
	}
}
public class GetKNode {
	public static void test1(){
		ListNode n1 = new ListNode(6);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(6);
		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
		
		Interview s=new Interview();
		s.display(n1);
		ListNode result=s.getKNode1(n1,2);
		System.out.println(result.val);
	}
	public static void test2(){
		ListNode n1 = new ListNode(6);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(6);
		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
		
		Interview s=new Interview();
		s.display(n1);
		ListNode result=s.getKNode2(n1,3);
		System.out.println(result.val);
	}

public static void main(String[] args){
	test1();
	test2();
}
}		