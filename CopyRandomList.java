
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val) {
        this.val = _val;
      //  next = _next;
        //random = _random;
    }
}

class CopyRandomList {
    public static Node copyRandomList(Node head) {
		if(head==null){
			return null;
		}
		Node cur=head;
		//1.新结点插到老节点之后
		while(cur!=null){
			Node node=new Node(cur.val);//复制新节点
			node.next=cur.next;
			cur.next=node;
			cur=node.next;
		}
	//2.random赋值
		cur=head;
		while(cur!=null){
			if(cur.random!=null){
			cur.next.random=cur.random.next;
			}else{
				cur.next.random=null;
			}
			cur=cur.next.next;
		}
	//3.拆分新老链表
		Node newHead=head.next;
		cur=head;
		while(cur!=null){
			Node node = cur.next;
			cur.next=node.next;
			if(node.next!=null){
			node.next=node.next.next;
			}
			cur=cur.next;
		}
		return  newHead;
		
		
	}
	public static void print(Node head){
		Node cur=head;
		while(cur!=null){
			System.out.printf("%d-->",cur.val);
			cur=cur.random;
		}
			System.out.println("null");
	}
	public static void main(String[] args){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(9);
		Node n4=new Node(4);
        Node n5=new Node(5);
		Node n6=new Node(2);
        Node n7=new Node(8);
		//ListNode n7=new ListNode(5);
       // ListNode n8=new ListNode(6);
		n1.next=n2;n2.next=n3;
		n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		n1.random=n6;
		n2.random=n5;
		n3.random=n1;
		n4.random=n5;
		n5.random=n6;
		n6.random=null;
		n7.random=n1;
		Node r=copyRandomList(n1);
		print(r);
	}
}