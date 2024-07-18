import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Currtime
{
	public static void main(String args[])
	{
		SimpleDateFormat obj=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		obj.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
		System.out.println("Now: "+obj.format(System.currentTimeMillis()));
	}
}