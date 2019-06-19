class A{
	int val=1;
	static int staticval=2;//静态常量
	static void staticMethod(){//静态方法
			System.out.println("父类静态方法");
	}
	static{//静态代码块
		System.out.println("父类静态代码块");
	}
	{//非静态代码块
		System.out.println("父类非静态代码块");
	}
}
class B extends A{
	int val=100;
	static int staticval=200;
	static void staticMethod(){//子类静态方法
			System.out.println("子类静态方法");
	}
	static{//静态代码块
		System.out.println("子类静态代码块");
	}
	public void method(){
		System.out.println(val);//100
		System.out.println(this.val);//100
		System.out.println(super.val);//1
	}
}
public class Hiding{
	public static void main(String[] args){
		B object = new B();
		object.staticMethod();//子类静态方法
		System.out.println(object.val);//100
		System.out.println(object.staticval);//200
		object.method();//100 100 1
		B.staticMethod();//子类静态方法
		System.out.println(B.staticval);//200
		System.out.println(A.staticval);//2
		A.staticMethod();//父类静态方法
	}
}