package DateClassConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If you want to print current time or date - example program.
		// For this we need to import date.util package

		Date d = new Date();
		
		//if you want to print date in specific format
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		//System.out.println(d.toString());
		
		
		
	}

}
