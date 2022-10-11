package OOP;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime , endTime;
    public StopWatch(){
        startTime = LocalTime.now();
    }
    public StopWatch(LocalTime startTime , LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime(){
        return startTime;
    }
    public LocalTime getEndTime(){
        return endTime;
    }
    public void start(){
        startTime = LocalTime.now();
    }
    public void end(){
        endTime = LocalTime.now();
    }
}
