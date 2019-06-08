import java.util.Arrays;
public class SeqList1{
	private int[] array;
	private int size;
	//1.初始化,构造函数
	public	SeqList1(){
		array=new int[11];
		size=0;
	}
	//2.头插
	public void pushFront(int element){
		ensureCapacity();
		for(int i=size-1;i>=0;i--){
			array[i+1]=array[i];
		}
		array[0]=element;
		size++;
	}
	//3.尾插
	public void pushBack(int element){
		ensureCapacity();
		array[size++]=element;
	}
	
	//4.中间插 
	public void insert(int index,int element){
		if(index<0||index>size){
			System.out.println("下标异常，不能插入");
			return ;
		}
		ensureCapacity();
		for(int i=size;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
		size++;
	}
			
	//5.头删
	public void popFront(){
		if(size==0){
		System.out.println("空表");
		}
		for(int i=0;i<size;i++){
			array[i]=array[i+1];
		}
		size--;
	}
	
	//6.尾删
	public void popBack(){
		if(size==0){
	System.out.println("空表");
		}
	size--;}
	//7.中间删
	public void erase(int index){
		if(index<0||index>=size){
			System.out.println("下标异常,不能删除");
			return ;
		}
		for(int i=index;i<size;i++){
			array[i]=array[i+1];
		}
		size--;
	}
	
	//8.查找
	public int indexOf(int element){
		for(int i=0;i<size;i++){
			if(array[i]==element){
				return i;
			}
		}
			return -1;
	}
	//9.根据下标，获取元素
	public int get(int index){
	if(index<0||index>=size){
		System.out.println("下标异常");
		return -1 ;
	}
	for(int i=0;i<size;i++){
		if(array[i]==array[index]){
			return array[i];
		}
	}
			return -1;
}
	
	//10.给定下标，修改元素的值
	public void set(int index,int element){
		for(int i=0;i<size;i++){
			if(i==index){
				array[i]=element;
			}
		}
	}
	//11.显示当前表中元素长度
	public int size(){
		return size;
	}
	//12.判断表是否为空
	public boolean isEmpty(){
		return size==0;
	}
	//13.查询表的容量
	public int capacity(){
		return array.length;
	}
	//14.打印显示表中已有元素
	public String toString(){
		return Arrays.toString(
		Arrays.copyOf(array,size));
	}
	//15.删除表中的一个元素
	public void remove(int element){
		int index=indexOf(element);
		if(index!=-1){
			erase(index);
		}
	}
	//16.删除表中相同元素
	public void removeAll(int element){
		int j=0;
		for(int i=0;i<size;i++){
			if(array[i]!=element){
				array[j++]=array[i];
			}
		}
		size=j;
	}
	//17.扩容
	private void ensureCapacity(){
		if(size<array.length){
			return ;
		}
		//申请空间
		int newCapacity=array.length+array.length/2;
		int[] newArray=new int[newCapacity];
	   //搬家
	   for(int i=0;i<array.length;i++){
		   newArray[i]=array[i];
	   }
	   //官宣
	   this.array=newArray;
}
	public static void test1(String [] args){
		SeqList1 sq = new SeqList1();
		//[]
		System.out.println(sq.toString());
		//头插1 2 3
		sq.pushFront(1);
		sq.pushFront(2);
		sq.pushFront(3);
		System.out.println(sq.toString());
		//尾插10，20，30
		sq.pushBack(10);
		sq.pushBack(20);
		sq.pushBack(30);
		System.out.println(sq.toString());
		//1,2,3,10,20,30
		sq.insert(2,15);
		sq.insert(4,28);
		System.out.println(sq.toString());
		//当前容量
		System.out.println(sq.capacity());
		//尾插
		
		sq.pushBack(10);
		sq.pushBack(2000);
		sq.pushBack(3000);
		// sq.pushBack(4000);
		sq.pushBack(5000);
		sq.pushBack(6000);
		System.out.println("当前容量为"+ sq.capacity());
		//头删
		sq.popFront();
		//尾删
		sq.popBack();
		//中间删
		sq.erase(3);
		System.out.println(sq.toString());
	}
		public static void test2(String [] args){
			SeqList1 s =new SeqList1();
		s.pushBack(1);
		s.pushBack(2);
		s.pushBack(3);
		s.pushBack(4);
		s.pushBack(1);
		s.pushBack(2);
		s.pushBack(3);
		s.pushBack(4);
		// [ 1, 2, 3, 4, 1, 2, 3, 4 ]
		System.out.println(s.toString());
		s.remove(4);
		// [ 1, 2, 3,  1, 2, 3, 4 ]
		System.out.println(s.toString());
		s.removeAll(4);
		// [ 1, 2, 3,  1, 2, 3,  ]
		System.out.println(s.toString());
		}
		public static void main(String[] args){
			test1(args);
			test2(args);
		}
	}
			
		
