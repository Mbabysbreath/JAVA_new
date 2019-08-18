package  ListOp;
public  class MyLinkList implements  List{
    private static class Node {
        private int val;
        private Node prev;
        private Node next;
        Node(int val){
            this.val=val;
            this.prev=null;
            this.next=null;
        }
        Node(int val,Node prev,Node next){
            this(val);
            this.prev=prev;
            this.next=next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }
    /**
    *记录当前链表的头结点
     */
    private  Node head=null;
    /**
     * 记录当前链表的最后一个结点
     */
    private  Node last=null;
    /**
     * 记录当前链表的元素个数
     */
    private int size=0;
    @Override
    public boolean add(int element) {
        add(size,element);
        return true;
    }

    /**
     * 将值位element的元素插在index的位置
     * @param index 下标
     * @param element 值
     * @return true代表成功，false代表失败
     */
    @Override
    public boolean add(int index, int element) {
        //检查下标的合法性
        if(index<0||index>size){
            System.out.println("下标不合法");
            return false;
        }

        //index==0时，代表头插特殊处理
        if(index==0){
            head=new Node(element,null,head);
            if(head.next!=null){//原本链表非空
                head.next.prev=head;
            }
            if(size==0){//原本为空链表
                last=head;
            }
            size++;
            return true;
        }
        //index==size,在尾部插入，特殊处理
        if(index==size){
            last=new Node(element,last,null);
            if(last.prev!=null){//原本链表非空
                last.prev.next=last;
            }
            if(size==0) {//原本为空链表
                head = last;
            }
            size++;
            return true;
        }
        //普通情况
        Node curNode=getNode(index);
        Node newNode=new Node(element,curNode.prev,curNode);
        curNode.prev.next=newNode;
        curNode.prev=newNode;
        size++;
        return true;
    }

    /**
     * 找到当前链表下标为index的结点
     * index一定合法
     * @param index，下标
     * @return 返回该结点
     */
    private Node getNode(int index){

        if(index<size/2){
            Node cur=head;
            for(int i=0;i<index;i++){
                cur=cur.next;
            }
            return cur;
        }else{
            Node cur=last;
            for(int i=0;i<size-index-1;i++){
                cur=cur.prev;
            }
            return cur;
        }
    }
    @Override
    public int get(int index) {
        //判断下标合法性
        if(index<0||index>size){
            System.out.println("下标错误");
            return -1;
        }
        return getNode(index).val;
    }

    @Override
    public int set(int index, int val) {
        if(index<0||index>size){
            System.out.println("下标错误");
            return -1;
        }
        Node curNode=getNode(index);
        System.out.println("值："+curNode.val);
        int oldVal=curNode.val;
        curNode.val=val;
        return oldVal;
    }

    @Override
    public int remove(int index) {
        if(index<0||index>size){
            System.out.println("下标错误");
            return -1;
        }
        Node curNode=getNode(index);
        if(curNode.prev!=null){//删的不是头结点
            curNode.prev=curNode.next;
        }else{//删的头结点
            head=curNode.next;
        }
        if(curNode.next!=null) {//删除的不是尾节点
            curNode.next.prev=curNode.prev;
        }else {//删的是尾节点
            last=curNode.prev;
        }
        size--;
        return curNode.val;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        String r="[";
        for(Node cur=head;cur!=null;cur=cur.next){
            r+=(cur.val+",");
        }
        r+="]";
        return r;
    }

}