public class ThreadDaemon extends Thread{
    public ThreadDaemon() {
        setDaemon(true);
    }

    @Override
    public void run() {
        System.out.println("Daemon thread started");
    }
}
