public class ThreadDaemon extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
        }
    }
}
