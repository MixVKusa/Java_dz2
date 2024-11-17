package ru.tataev.calculating;

public class Time {
    public final int fullTime;
    private final int hour;
    private final int minute;
    private final int second;

    public Time(int fullTime) {
        if (fullTime > 86399) {
            throw new IllegalArgumentException("ru.tataev.calculating.Time must be in range of one day");
        }
        this.fullTime = fullTime;

        this.hour = fullTime / 3600;
        this.minute = (fullTime - hour * 3600) / 60;
        this.second = fullTime - hour * 3600 - minute * 60;
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
