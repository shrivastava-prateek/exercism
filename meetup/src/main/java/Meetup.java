import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Meetup {

	private Map<MeetupSchedule,Integer> map = new HashMap<>();


	private int m,y;

	public Meetup(int i, int j) {
		this.m=i;
		this.y=j;
		initialize();
	}


	public LocalDate day(DayOfWeek monday, MeetupSchedule teenth) {

		int lDate = map.get(teenth);

		int fDate = (lDate-7)+1;

		LocalDate lD = null;
		for(int d=fDate;fDate<=lDate;d++){
			lD = LocalDate.of(y, m, d);
			if(lD.getDayOfWeek().equals(monday)){
				return lD;
			}
		}
		return lD;
	}


	public void initialize(){

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, m-1);
		cal.set(Calendar.YEAR, y);


		map.put(MeetupSchedule.FIRST, 7);
		map.put(MeetupSchedule.SECOND, 14);
		map.put(MeetupSchedule.THIRD, 21);
		map.put(MeetupSchedule.FOURTH, 28);
		map.put(MeetupSchedule.LAST, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		map.put(MeetupSchedule.TEENTH, 19);


	}
}
