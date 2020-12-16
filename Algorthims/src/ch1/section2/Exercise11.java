package ch1.section2;

import edu.princeton.cs.algs4.Date;

public class Exercise11 {

	public static void main(String[] args) {
		try {
			SmartDate smartDate = new SmartDate(12, 31, 2020);
			System.out.println(smartDate.toString());
			SmartDate smartDate1 = new SmartDate(13, 31, 2020);
			System.out.println(smartDate1.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class SmartDate {
	private final int month;
	private final int day;
	private final int year;
	
	public SmartDate(int m, int d, int y) throws Exception {
		if(!isInvaild(m, d, y)) throw new Exception("Not Invaild");
		month = m;
		day = d;
		year = y;
	}
	
	public String toString() {
		return year + ":" + month + ":" + day;
	}
	
	private boolean isInvaild(int m, int d, int y) {
		if(m > 12 || m < 1) return false;
		else if(d < 1 || d > 31) return false;
		else if(y < 0) return false;
		
		return true;
	}
}
