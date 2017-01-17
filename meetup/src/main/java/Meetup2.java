import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Meetup2 {


	private Map<String,Integer> map = new HashMap<String,Integer>();


	private int m,y;
	public Meetup2(int i, int j) {
		this.m=i;
		this.y=j;
		initialize();
	}


	public LocalDate day(DayOfWeek monday, MeetupSchedule teenth) {
		int d= map.get(teenth+" "+monday);


		return LocalDate.of(y,m,d);
	}
	
	
	public void initialize(){

		LocalDate ld;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, m-1);
		cal.set(Calendar.YEAR, y);
		for(int d=1;d<=cal.getActualMaximum(Calendar.DAY_OF_MONTH);d++){
			ld= LocalDate.of(y, m, d);
			if(d>=13 && d<=19){
				map.put(MeetupSchedule.TEENTH+" "+ld.getDayOfWeek(), d);
			}
			if(d+7>=cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
				MeetupSchedule ms = MeetupSchedule.values()[4];
				map.put(ms.name()+" "+ld.getDayOfWeek(), d);
			}
		
				int no = ((d-1)/7)%5;
				MeetupSchedule ms = MeetupSchedule.values()[no];
				map.put(ms.name()+" "+ld.getDayOfWeek(), d);
				
		
			
		}
System.out.println(map);

	}
}
