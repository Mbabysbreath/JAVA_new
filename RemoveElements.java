class Node{
	public int value;
	public Node next;
	public Node(int value){
		this.value=value;
		this.next=null;
	}
}
public class RemoveElements{
	public static Node removeElements(Node head,int value){
		Node cur=head;
		Node newList=null;
		Node last=null;
		while(cur!=null){
			Node next = cur.next;
			if(cur.value != value){//如果头结点就要被删除的话
									//，last.next 就会出问题
				if(newList==null){
				cur.next = newList;
				newList=cur;
			}
			else{
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
	
	public static Node removeElements1(Node head,int value){
		Node prev =head;//先把第一个头结点存起来不管
		Node cur=head.next;//直接从头结点的下一个开始
		while(cur!=null){
			if(cur.value==value){
				prev.next=cur.next;
			}else{
				prev=cur;
			}
			cur=cur.next;
		}
		if(head.value==value){//最后处理头结点是否应该被删
			head = head.next;
		}
		return head;
	}
	
	public static Node removeElements2(Node head,int value){
		Node fakeHead=new Node(0);//设一个临时头结点，不为空，值不一定为零
		fakeHead.next=head;//让临时头结点的下一个指向真正的头结点，可自由删除
		Node prev=fakeHead;
		Node cur=head;
		while(cur!=null){
			if(cur.value==value){
				prev.next=cur.next;
			}else{
				prev=cur;
			}
			cur=cur.next;
		}
		return fakeHead.next;//为什么不直接返回head,为防止开始时头结点为可被删除的值
	}
	public static Node pushFront(Node head,int value){
		Node newNode=new Node(value);
		newNode.next=head;
		return newNode;
	}
	public static Node display(Node head){
		Node cur=head;
		for(cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d-->",cur.value);
		}
		System.out.printf("null%n");
		return head;
	}
	
	public static void main(String[] args){
		Node head=null;
			head=pushFront(head,1);
			head=pushFront(head,2);
			head=pushFront(head,3);
			head=pushFront(head,4);
			head=pushFront(head,3);
			head=pushFront(head,5);
			head=pushFront(head,6);
			head=pushFront(head,6);
			head=pushFront(head,1);
			head=pushFront(head,3);
			head=pushFront(head,7);
			display(head);//6 4 3 2 1
			head=removeElements(head,3);
			display(head);
			head=removeElements1(head,6);
			display(head);
			head=removeElements2(head,7);
			display(head);
	}
}