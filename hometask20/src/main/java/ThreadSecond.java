public class ThreadSecond extends Thread{
    private ThreadsPrinter printer;

    public ThreadSecond(ThreadsPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print2();
    }
}
