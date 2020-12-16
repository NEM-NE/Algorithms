package ch1.section2;

public class Exercise12 {

	public static void main(String[] args) {

	}

}
class SmartDate {
	private final int month;
	private final int day;
	private final int year;
	private final String[]  
	public SmartDate(int m, int d, int y) throws Exception {
		if(!isInvaild(m, d, y)) throw new Exception("Not Invaild");
		month = m;
		day = d;
		year = y;
	}
	
	public String dayOfWeek() {
		if(year < 2000) return "you must input up to 2000.";
		
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