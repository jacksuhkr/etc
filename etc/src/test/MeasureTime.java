package test;

public class MeasureTime {
    private static long startTime, endTime;
    private static float timeSpent;
    
    public static void main(String args[]) {
        startTime = System.nanoTime();
        endTime = System.nanoTime();
    	timeSpent = (float) (endTime - startTime) / (float) 1000000000;
    	System.out.println("걸린시간 : " + timeSpent + "초");
    }
}
