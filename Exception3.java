class MyException extends Exception{
    MyException(String ErrorMessage){
        super(ErrorMessage);
    }
}
public class Exception3 {
    static int avg(int a,int b) throws MyException {
        if (a < 0 || b < 0)
            throw new MyException("负值不行");
        else if (a > 100 || b > 100)
            throw new MyException("数值过大");
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        try{
            System.out.println(avg(-10,2));
        }catch(MyException e){
            System.out.println(e);
        }
    }
}

