public class Time {
    public int hour;
    public int minute;
    public int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time netxSecond(){
        return new Time(hour, minute, second+1);
    }
    public Time previousSecond(){
        return new Time(hour , minute, second-1);
    }
}
