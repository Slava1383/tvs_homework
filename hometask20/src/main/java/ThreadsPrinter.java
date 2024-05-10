public class ThreadsPrinter {
    private Object monitor;
    public ThreadsPrinter(Object monitor) {
        this.monitor = monitor;
    }
    public void print1() {
        synchronized (monitor) {
            while (true){
                System.out.println("1");
                System.out.println("1");
                System.out.println("1");
                monitor.notify();
                try{
                    monitor.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void print2() {
        synchronized (monitor){
            while (true){
                System.out.println("2");
                System.out.println("2");
                System.out.println("2");
                monitor.notify();
                try{
                    Thread.sleep(2000);
                    monitor.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
