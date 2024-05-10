public class ThreadClassMax extends Thread{
    private int[] arr;
    private int max;

    public int getMax() {
        return max;
    }

    public ThreadClassMax(int[] arr) {
        this.arr = arr;
    }
    public void run() {
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }
}
