package ListOp;

public class Main {
    private static void testList(List list){
        list.add(1);
       list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("该位置的值为："+list.get(2));
        System.out.println(list);
        list.set(0,100);
        System.out.println(list);
         list.set(5,200);
         list.add(4,200);
        System.out.println(list);
        System.out.println("线性表长度:"+list.size());
        System.out.println(list.isEmpty());
        System.out.println("删除了"+list.remove(3));
        System.out.println(list);
    }
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        MyLinkList ml=new MyLinkList();
        System.out.println("+++++++++顺序表开始++++++++++++++++");
        testList(ma);
        System.out.println("+++++++++链表开始++++++++++++++++");
       testList(ml);
    }
}
