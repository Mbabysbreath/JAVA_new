package 线程;

public class Synchronization6 {
    public static void main(String[] args) {
        HMaker maker=new HMaker();
        HAssistant assistant=new HAssistant();
        maker.start();
        assistant.start();
    }
}
