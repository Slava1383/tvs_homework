public class ThreadMax extends Thread{
    private int max;
    private int[] arrMax;

    public ThreadMax(int[] arrMax) {
        this.arrMax = arrMax;
    }

    public int getMax() {
        return max;
    }
    public void run(){
        max = arrMax[0];
        for(int i=0; i<arrMax.length; i++){
            if(arrMax[i] > max){
                max = arrMax[i];
            }
        }
    }
}
