//迭代器接口
interface Iterator{
	boolean hasNext();//看顺序表是否有后续
	int next();//得到线性表的值
}
//线性表接口
interface List{
	void pushFront();
	void pushuBack();
	void insert(int index,int val);
	int size();
	Iterator iterator();
}
interface RandomAccess();
abstract class AbstractList implements List{
	protected int size;
	public void pushFront(int val){
		insertInternal(0,val);
	}
	public void pushBack(int val){
		insertInternal(size,val);
	}
	public void insert(int index,int val){
		if(index<0||index>size){
			System.out.printf("下标错误");
			return;
		}
		insterInternal(index,val);
	}
	abstract void insertInternal(int index,int val);
	public int size(){
		return size;
	}
}
//顺序表类
class  ArrayList extends AbstractList implements List,RandomAccess{
       	public void insertInternal(int index,int val){
		for(int i=size;i<index;i--){
			array[i+1]=array[i];
		}
		array[index]=val;
		size++;
		
	}
	
	
			
