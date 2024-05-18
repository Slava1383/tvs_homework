public class ThreadMin extends Thread{
    private int min;
    private int[] arrMin;

    public ThreadMin(int[] arrMin) {
        this.arrMin = arrMin;
    }

    public int getMin() {
        return min;
    }
    public void run(){
        min = arrMin[0];
        for(int i = 1; i < arrMin.length; i++){
            if(arrMin[i] < min){
                min = arrMin[i];
            }
        }
    }
}
