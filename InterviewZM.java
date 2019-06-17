class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
public class InterviewZM{
	//1.删除给定val
	public static ListNode removeValue1(ListNode head,int val){
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
	//删除给定结点2
	public static ListNode removeValue2(ListNode head,int val){
		if(head==null){
			return null;
		}
		ListNode prev=head;
		ListNode cur=head.next;
		//ListNode cur=head.next;
		while(cur!=null){
			if(cur.val==val){
				prev.next=cur.next;
			}else{
				prev=cur;
			}
			cur=cur.next;
			}
			if(head.val==val){
			head=head.next;
			}
		return head;
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
	//3.合并两个有序链表
	public static ListNode merge(ListNode head1,ListNode head2){
		
		if(head1==null){
			return head2;
		}
		if(head2==null){
			return head1;
		}
		ListNode cur1=head1;
		ListNode cur2=head2;
		ListNode last=null;
		ListNode newList=null;
		while(cur1!=null&&cur2!=null){
			
			if(cur1.val<=cur2.val){
				ListNode next1=cur1.next;
				if(newList==null){
					newList=cur1;
				}else{
					last.next=cur1; 
				}
				last=cur1;
				cur1=cur1.next;
			}
			else{
				ListNode next2=cur2.next;
				if(newList==null){
					newList=cur2;
				}else{
					last.next=cur2;
				}
				last=cur2;
				cur2=next2;
			}
		}
		if(last!=null){
			last.next=null;
		}
		return newList;
	}
	//4.删除重复结点
	public static ListNode deleteRepeat(ListNode head){
		if(head==null){
			return null;
		}
		//设假结点
		ListNode prev=null;
		ListNode p1=head;
		ListNode p2=head.next;
		while(p2!=null){
			if(p1.val!=p2.val){
				prev=p1;
				p1=p2;
				p2=p2.next;
			}else{
				while(p2!=null&&p2.val==p1.val){
					p2=p2.next;
				}
				if(prev==null){
					head=p2;
				}else{
				prev.next=p2;
				}
				p1=p2;
				if(p2!=null){
					p2=p2.next;
				}
			}
		}
		return head;
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
		ListNode n3=new ListNode(2);
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
		ListNode result1=removeValue2(n1,2);
		print(result1);
		ListNode result2=reverseList(n1);
		print(result2);//逆置完后是将n1逆置到最后一个位置
		ListNode result3=deleteRepeat(result2);
		print(result3);
	}
}
