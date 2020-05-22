public class StopWatch {
    private double starTime;
    private double endTime;

    public StopWatch() {
    }
    public double star(){
        return starTime = System.currentTimeMillis();
    }
    public double stop(){
        return endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return endTime - starTime;
    }
}
