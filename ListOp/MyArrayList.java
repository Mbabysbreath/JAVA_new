package ListOp;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements List {
    int[] arr=null;
    int size=0;
    @Override
    public boolean add(int element) {
      return   add(size,element);
    }

    @Override
    public boolean add(int index, int element) {
        if(index<0||index>size){
            System.out.println("下标错误");
            return false;
        }
            ensureCapacity();
            System.arraycopy(arr, index, arr, index + 1, size - index);
            arr[index] = element;
            size++;
        return true;
    }

    @Override
    public int get(int index) {
        if(index<0||index>=size){
            System.out.println("下标错误");
            return -1;
        }
        return arr[index];
    }

    @Override
    public  int set(int index, int val) {

        if(index<0||index>=size){
            System.out.println("下标错误");
            return -1;
        }
       int oldVal=arr[index];
        arr[index]=val;
        return oldVal ;
    }

    @Override
    public int remove(int index) {
        if(index<0||index>=size){
            System.out.println("下标错误");
            return -1;
        }
        int oldVal=arr[index];
            System.arraycopy(arr,index+1,arr,index,size-index-1);
            size--;
        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    private void ensureCapacity(){
        if(arr!=null&&size<arr.length){
            return ;
        }
        int capaCity;
        if(arr==null) {
            capaCity=10;
            arr=new int[capaCity];
        }else{
            capaCity=2*arr.length;
            arr=Arrays.copyOf(arr,capaCity);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr,size));
    }
}
