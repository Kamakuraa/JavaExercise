package fastTrackIt.teme.temaCurs12.ex4;


import java.util.*;

public class Schedule {
    private final List<DaySchedule> daySchedules = new ArrayList<>();

    public Schedule(Collection<DaySchedule> daySchedules) {
        this.daySchedules.addAll(daySchedules);
    }

    public List<DaySchedule> getDaySchedules() {
        return daySchedules;
    }

    public Map<String, DaysOfTheWeeks> toDo() {
        Map<String, DaysOfTheWeeks> result = new HashMap<>();
        for (DaySchedule daySchedule : daySchedules) {
            result.put(daySchedule.getActivity(), daySchedule.getDays());
        }
        return result;
    }
}
