/*
在一个排序的链表中，存在重复的结点，
请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/
// 
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class DeleteDuplication1 {
    public static ListNode deleteDuplication(ListNode pHead){
		if(pHead==null){
			return null;
		}
		ListNode prev=new ListNode(0);
		ListNode fake=prev;
		prev.next=pHead;
		ListNode p1=pHead;
		ListNode p2=pHead.next;
		while(p2!=null){
			if(p1.val!=p2.val){
				prev=p1;
				p1=p1.next;
				p2=p2.next;
			}else{
				while(p2!=null&&p1.val==p2.val){
					p2=p2.next;
				}
				prev.next=p2;//删除重复的值
				p1=p2;
				if(p2!=null){
					p2=p2.next;
				}
			}
		}
		return fake.next;
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
		ListNode n9=new ListNode(10);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(4);
        ListNode n6=new ListNode(4);
		ListNode n7=new ListNode(5);
        ListNode n8=new ListNode(6);
		n1.next=n2;n2.next=n3;
		n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		n7.next=n8;n8.next=n9;
		print(n1);
		ListNode result=deleteDuplication(n1);
		print(result);
  }
}