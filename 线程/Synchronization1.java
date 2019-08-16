package 线程;
class PrintThread extends Thread {
    char ch;

    public PrintThread(char ch) {
        this.ch = ch;
    }

    public void PrintCh10() {
        for (int i = 0; i < 4; i++) {
            System.out.print(ch);
        }
    }
        public void run () {
            for (int i = 0; i < 4; i++) {
                PrintCh10();
                System.out.println();
            }
        }
    }
public class Synchronization1  {
    public static void main(String[] args) {
        PrintThread pt1=new PrintThread('A');
        PrintThread pt2=new PrintThread('B');
        pt1.start();
        pt2.start();
    }

}
