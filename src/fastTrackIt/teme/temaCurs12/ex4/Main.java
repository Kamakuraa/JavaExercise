package fastTrackIt.teme.temaCurs12.ex4;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(List.of(
                new DaySchedule("de facut tema la curs", DaysOfTheWeeks.LUNI),
                new DaySchedule("de mers la cumparaturi", DaysOfTheWeeks.MARTI),
                new DaySchedule("de sunat la banca", DaysOfTheWeeks.MIERCURI),
                new DaySchedule("pregtire pentru curs", DaysOfTheWeeks.JOI),
                new DaySchedule("etc, etc", DaysOfTheWeeks.VINERI),
                new DaySchedule("mers in parc", DaysOfTheWeeks.SAMBATA),
                new DaySchedule("sala", DaysOfTheWeeks.DUMINICA)
        ));

        System.out.println(schedule.getDaySchedules());
        System.out.println(schedule.toDo());
    }
}

