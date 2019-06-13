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
public class DetectCycle {
    public static ListNode detectCycle(ListNode head) {
            ListNode front=head;//设快慢节点，如果有环
            ListNode back=head;
            if(head==null){
                return null;
            }
            do{
                front=front.next;
                if(front!=null){
                    front=front.next;
                    back=back.next;
                }
            }while(front!=null&&front!=back);//则一定会出现快慢相遇的情形
                if(front==null){//防止当front为空时，跳出while循环
                    return null;//从而继续进行下边的运算
                }
            ListNode p1=head;//如果是环，则让p1从头结点开始
            ListNode p2=back;//p2从相遇点开始
            while(p1!=p2){//只要p1==p2了，则一定为入口点
                p1=p1.next;
                p2=p2.next;
            }
        return p1;
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
		n1.next=n2;n2.next=n3;
		n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		n7.next=n3;
		ListNode result=detectCycle(n1);
		System.out.println(result.val);
	}
}