package assi;
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) {
		// Get current date time
		Date currentDate=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(sdf.format(currentDate));
		
		//Convert string to date
		try {
			String strDate="02/13/1998";
			SimpleDateFormat sdfBirthday=new SimpleDateFormat("MM/dd/yyyy");
			Date birthday=sdfBirthday.parse(strDate);
			SimpleDateFormat sdfBirthday1=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Birthday:"+ sdfBirthday1.format(birthday));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//using calendar
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		System.out.println("Year:"+c.get(Calendar.YEAR));
		System.out.println("Month"+c.get(Calendar.MONTH));
	}

}
