public class ThreadFirst extends Thread{
    private ThreadsPrinter printer;

    public ThreadFirst(ThreadsPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print1();
    }
}
