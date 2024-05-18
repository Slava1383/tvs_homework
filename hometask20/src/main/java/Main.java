public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ThreadExt threadExt = new ThreadExt();
        Thread threadRan = new Thread(new ThreadRun());
        threadExt.start();
        threadRan.start();
        try {
            threadExt.join();
            threadRan.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        ThreadMax threadMax = new ThreadMax(arr);
        ThreadMin threadMin = new ThreadMin(arr);
        threadMax.start();
        threadMin.start();
        try {
            threadMax.join();
            threadMin.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(threadMax.getMax());
        System.out.println(threadMin.getMin());

        ThreadDaemon threadDaemon = new ThreadDaemon();
        threadDaemon.setDaemon(true);
        threadDaemon.start();
         Object monitor = new Object();
        ThreadsPrinter threadsPrinter = new ThreadsPrinter(monitor);
        ThreadFirst threadFirst = new ThreadFirst(threadsPrinter);
        ThreadSecond threadSecond = new ThreadSecond(threadsPrinter);
        threadFirst.start();
        threadSecond.start();
    }
}
