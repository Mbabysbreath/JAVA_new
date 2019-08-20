import sun.awt.image.ImageWatched;

import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        List<String> list1=new LinkedList<>();
   //     list.getFirst();
        System.out.println(list.peekFirst());
        list.add("Java");
        list.add("C");
        list.addFirst("数据结🐶");
        list.addLast("😂");
        list.add(2,"🐷");
        System.out.println(list);
        list.poll();
        System.out.println(list);
        list.peek();
        list.pollLast();
        System.out.println(list);
        System.out.println("-----------");
        list.getFirst();
    }
}
