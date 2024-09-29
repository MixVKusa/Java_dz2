public class Time {
    public int secs;

    public Time(int secs) {
        this.secs = secs;
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
