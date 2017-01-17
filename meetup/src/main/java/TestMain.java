
import java.util.Calendar;

public class TestMain {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.DATE, 1);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(Calendar.MONDAY);
	    System.out.println(DayOfWeek.MONDAY.getValue());
	    System.out.println(cal.getMaximum(Calendar.DATE));
	    
	    
	    LocalDate ld= LocalDate.of(2017, 1, 1);
	    System.out.println(ld.getDayOfWeek());
	    
	    for (MeetupSchedule ms : MeetupSchedule.values()){
			 System.out.println(ms);
		 }*/
	    
	    //Meetup mt = new Meetup(6, 2013);
	    Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.YEAR, 2013);
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		//Meetup mt = new Meetup(8, 2013);

	}

}
