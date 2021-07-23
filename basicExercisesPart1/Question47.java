package basicExercisesPart1;
import java.text.SimpleDateFormat;
import java.util.*;
/*47. Write a Java program to display the current date time in specific format. 
Sample Output:

Now: 2017/06/16 08:52:03.066 */
class Question47 {

	public static void main(String[] args) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("Now: "+cdt.format(System.currentTimeMillis()));
	}
}