public class Time {
    public final int secs;

    public Time(int secs) {
        this.secs = secs;
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
    }

    public String toString() {
        int resHours;
        int resMinutes;
        int resSeconds = secs;

        resMinutes = resSeconds / 60;
        resSeconds -= resMinutes * 60;
        resHours = resMinutes / 60;
        resMinutes -= resHours * 60;
        resHours = resHours % 24;

        return String.format("%02d:%02d:%02d", resHours, resMinutes, resSeconds);
    }
}
