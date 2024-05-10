public class ThreadClassMin extends Thread{
    private int[] arr;
    private int min;

    public int getMin() {
        return min;
    }

    public ThreadClassMin(int[] arr) {
        this.arr = arr;
    }
    public void run() {
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }
}
