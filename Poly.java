class Animal{
    String name;
    Animal(){}
    Animal(String name){
        this.name=name;
    }
    void move(){
        System.out.println(name+"行走");
    }
    void eat(){
        System.out.println(name+"吃");
    }
}
class Elephant extends Animal{
    Elephant(){}
    Elephant(String name){
        super(name);
    }
    void move(){
        System.out.println(name+"慢慢走");
    }
    void eat(){
        System.out.println(name+"咯吱咯吱吃");
    }
}
class Mouse extends Animal{
    Mouse(){}
    Mouse(String name){
        super(name);
    }
    void move(){
        System.out.println(name+"跑啊跑");
    }
    void eat(){
        System.out.println(name+"吧唧吧唧吃");
    }
}

public class Poly {
    public static void main(String[] args) {
        Elephant ob1=new Elephant("象");
        Mouse  ob2=new Mouse("鼠");
        ob1.move();
        ob1.eat();
        ob2.move();
        ob2.eat();
    }
}
