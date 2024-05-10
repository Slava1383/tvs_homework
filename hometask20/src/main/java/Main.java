import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        ThreadExt threadExt = new ThreadExt();
        Thread threadRun = new Thread(new ThreadRun());
        threadExt.start();
        threadRun.start();
        try {
            threadExt.join();
            threadRun.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Finished");
        int[] numbers = {12, 34, 83, 22, 9};
        ThreadClassMax threadClassMax = new ThreadClassMax(numbers);
        ThreadClassMin threadClassMin = new ThreadClassMin(numbers);
        threadClassMax.start();
        threadClassMin.start();
        try {
            threadClassMax.join();
            threadClassMin.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(threadClassMax.getMax());
        System.out.println(threadClassMin.getMin());
        ThreadDaemon threadDaemon = new ThreadDaemon();
        threadDaemon.start();
        Object monitor = new Object();
        ThreadsPrinter threadsPrinter = new ThreadsPrinter(monitor);
        ThreadFirst threadFirst = new ThreadFirst(threadsPrinter);
        ThreadSecond threadSecond = new ThreadSecond(threadsPrinter);
        threadFirst.start();
        threadSecond.start();

    }
}
