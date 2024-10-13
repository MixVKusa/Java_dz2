public class Time {
    public final int fullTime;
    private int hour;
    private int minute;
    private int second;

    public Time(int fullTime) {
        this.fullTime = fullTime;

        this.hour = fullTime / 3600;
        this.minute = (fullTime - hour * 3600) / 60;
        this.second = fullTime - hour * 3600 - minute * 60;
        this.hour %= 24;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
