class Node{
	public int value;
	public Node next;
	
	public Node(int value){//构造方法
		this.value=value;
		this.next=null;
	}
}
	public class LinkListP{
		//1.遍历一个链表
		public static void display(Node head){
			
			for(Node cur=head;cur!=null;cur=cur.next){   //不能写cur.next!=null,
														//会在打印时漏掉最后一个
				System.out.printf("%d-->",cur.value);
			}
			System.out.println("null");
		}
		
		//2.头插
			public static Node pushFront(Node head,int value){
				Node newNode = new Node(value);//创建一个新结点
				newNode.next=head; //更新newNode的next
				//head=newNode;更新头结点，可以不做，
				//因为返回时，是直接返回头结点的，可以直接用返回表示
				return newNode;
			}
			
		//3.尾插
			public static Node pushBack(Node head,int value){
				Node cur = head;
				if(head == null){
					return pushFront(head,value);//如果当前链表为空，即头结点为空
												//就相当于头插
				}
				else{
					Node newNode = new Node(value);
					cur = getLast(head);//链表不为空，找到当前链表的最后一个结点
					cur.next = newNode;//使最后一个结点的next指向要插入的新结点
					newNode.next=null;
				}
				return head;
			}
			//得到最后一个结点
			private static Node getLast(Node head){
				Node cur = head;
				while(cur.next!=null){//遍历当前链表，直到当前结点指向的下一个结点为空
					cur = cur.next;
				}
				return cur;//再返回当前结点，就得到最后一个结点
			}
			//4.头删
			public static Node popFront(Node head){
				if(head == null){
					System.out.println("当前链表为空，无法删除");
					return null;
				}
				return head.next;//不为空时。返回头结点的下一个结点
			}
			//4.尾删
			public static Node popBack(Node head){
				if(head == null){System.out.println("当前链表为空，无法删除");
					return null;
				}	
				if(head.next == null){//当前链表只有一个结点
					return null;//删完后链表为空
				}
				else{					       
					Node cur = lastSecond(head);//链表中有多个结点，
												//需要找倒数第二个不为空的结点
						cur.next = null;
					
				}
				return head;
			}
			
			//找倒数第二个不为空的结点
			public static Node lastSecond(Node head){
				Node cur = head;
				while(cur.next.next != null){
					cur = cur.next;
				}
				return cur;//当找到当前结点下一个的下一个结点为空时
							//返回当前结点
			}
			public static void main(String[] args){
				Node head = null;
				head = pushFront(head,1);
				head = pushFront(head,2);
				head = pushFront(head,3);
				head = pushFront(head,4);
				display(head);//4 3 2 1
				head = pushBack(head,5);
				head = pushBack(head,6);
				head = pushBack(head,7);
				head = pushBack(head,8);
				display(head);//4 3 2 1 5 6 7 8
				head =popFront(head);
				display(head);//3 2 1 5 6 7 8
				head =popBack(head);
				display(head);//3 2 1 5 6 7
			}
	}