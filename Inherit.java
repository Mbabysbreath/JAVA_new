abstract class List{
	private int size;
	public void pushFront(int val){
		insert(0,val);
	}
	public void pushBack(int val){
		insert(size,val);
	}
	public abstract void insert(int index,int val);
	protected void incsize(){
		size++;
	}
	public int getSize(){
		return size;
	}
	public abstract void display();
}

class LinkList extends List{
	class Node{
	int val;
	Node next;
	public Node(int val,Node next){
		this.val=val;
		this.next=next;
	}
}
	private Node head=null;
	public void insert(int index,int val){
		Node cur=head;
		if(index==0){
			head=new Node(val,head);
			// node.next=head;
			// head=node;
		}else{
				for(int i=0;i<index-1;i++){
					cur=cur.next;
				}
				// node.next=cur.next;
				// cur.next=node;
				cur.next= new Node(val,cur.next);
			}
			super.incsize();
		}
	public void display(){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.println(cur.val);				
			}
		//System.out.printf("null%n");
	}
	
}
class ArrayList extends List{
	private int[] array=new int[10];
	@Override
	public void insert(int index,int val){ //1 2 3     4 5 6
		for(int i=getSize()-1;i>=index;i--){//0 1 2   3 4 5
			array[i+1]=array[i];
		}
		array[index]=val;
		super.incsize();
}
	public void display(){
		for(int i=0;i<getSize();i++){
			System.out.println(array[i]);
		}
	}
}
	public class Inherit{
		private static void testLinkList(){
			LinkList list=new LinkList();
				list.pushFront(0);
				list.pushFront(3);
				list.pushBack(2);
				list.insert(1,4);
				list.insert(0,9);
				list.display();// 9 3 4 0 2
		}
		public static void testArrayList(){
			LinkList arraylist=new LinkList();
				arraylist.pushFront(0);
				arraylist.pushFront(3);
				arraylist.pushBack(2);
				arraylist.insert(1,4);
				arraylist.insert(0,9);
				arraylist.display();// 9 3 4 0 2
		}
		public static void main(String[] args){
		  testLinkList();
		  testArrayList();
	}
}			
