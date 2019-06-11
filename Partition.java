public static ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode sList= null;
        ListNode lList=null;
        ListNode last2=null;
        ListNode last1=null;
		ListNode cur=pHead;
       // ListNode lHead=new ListNode(x);
        while(cur!=null){
            ListNode next=cur.next;
            if(cur.val<=x){
                if(last1==null){
                    sList=cur;
                    last1=cur;
                }
                else{
                    last1.next=cur;
                    last1=cur;
                }
                
            }
            
            else{
                if(last2==null){
                    lList=cur;
                    last2=cur;
                }
				else{
                 last2.next=cur;
                 last2=cur;
                
            }
            cur=next;
        }   
	}
		last1.next=lList;
        return sList;
 }
	public static void print(ListNode head){
		ListNode cur=head;
		while(cur!=null){
			System.out.printf("%d-->",cur.val);
			cur=cur.next;
		}
			System.out.println("null");
	}
	public static void main(String args[]){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(6);
		ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(3);
		n1.next=n2;n2.next=n3;
		n3.next=n4;
		print(n1);
		ListNode m=partition(n1,1);
		print(m);
	}
}
