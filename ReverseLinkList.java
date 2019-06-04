class Node{
	public int value;
	public Node next;
	public Node(int value){
		this.value = value;
		this.next =null;
	}
}
	public class ReverseLinkList{//先遍历，再头插到新的链表中
		public static Node reverseLinkList(Node head){
			Node newList = null;//newList代表新链表的首结点和链表本身
			Node cur = head;
			while(cur != null){
				Node next = cur.next;//cur.next会分两个方向执行(向后遍历，头插新链表)，值不同，
									//所以设一个结点存储一个方向的cur.next
				
				cur.next = newList;//让cur.next 连接newList
				newList = cur;//更新新链表的头结点为当前的结点
				
				cur = next;//cur往后遍历
			}
			return newList;//返回头结点
		}
		public static Node reverseLinkList1(Node head){
			Node prev = null;
			Node cur = head;
			while(cur!=null){
				Node temp = cur.next;//temp 暂时存放当前结点的next，桥梁
										
				cur.next = prev;//后一个结点的next指向前一个节点prev
				prev = cur;//更新头结点
				cur =temp;//向后遍历
			}
			return prev;
		}
		public static Node reverseLinkList2(Node head){
			Node n1 = null;
			Node n2 = head;
			Node n3 = head.next;
			if(head == null){
				return null;
			}
			while(n2 != null){
				n2.next = n1;
				n1 = n2;
				n2 = n3;//向后遍历
				if(n3!=null){
					n3 = n3.next;
				}
			}
			return n1;
		}
		//头插
		public static Node pushFront(Node head,int value){
			Node newNode = new Node(value);
			newNode.next = head;
			return newNode;
		}
		//打印
		public static Node display(Node head){
			Node cur = head;
			for(cur = head;cur != null;cur = cur.next){
				System.out.printf("%d-->",cur.value);
			}
			System.out.printf("null%n");
			return head;
		}
		
		public static void main(String[] args){
			Node head = null;
			head=pushFront(head,1);
			head=pushFront(head,2);
			head=pushFront(head,3);
			head=pushFront(head,4);
			head=pushFront(head,3);
			display(head);//6 4 3 2 1
			head=reverseLinkList(head);
			display(head);  //1 2 3 4 3
			head=reverseLinkList1(head);
			display(head);
			head=reverseLinkList2(head);
			display(head);
			
		}
	}