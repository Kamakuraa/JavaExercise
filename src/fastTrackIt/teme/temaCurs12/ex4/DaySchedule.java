package fastTrackIt.teme.temaCurs12.ex4;


import java.util.Objects;

public class DaySchedule {
    private final String activity;
    private final DaysOfTheWeeks days;

    public DaySchedule(String activity, DaysOfTheWeeks days) {
        this.activity = activity;
        this.days = days;
    }

    public String getActivity() {
        return activity;
    }

    public DaysOfTheWeeks getDays() {
        return days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return Objects.equals(activity, that.activity) && days == that.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(activity, days);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "activity='" + activity + '\'' +
                ", days=" + days +
                '}';
    }
}
