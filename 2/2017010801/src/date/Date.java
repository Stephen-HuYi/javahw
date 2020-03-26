package date;

public class Date {
	int year;
	int month;
	int day;
	Date(String s) {
		switch(s.substring(0,s.indexOf(".")+1)) {
		case "Jan.":
			month = 1;
			break;
		case "Feb.":
			month = 2;
			break;
		case "Mar.":
			month = 3;
			break;
		case "Apr.":
			month = 4;
			break;
		case "May.":
			month = 5;
			break;
		case "Jun.":
			month = 6;
			break;
		case "Jul.":
			month = 7;
			break;
		case "Aug.":
			month = 8;
			break;
		case "Sept.":
			month = 9;
			break;
		case "Oct.":
			month = 10;
			break;
		case "Nov.":
			month = 11;
			break;
		case "Dec.":
			month = 12;
			break;
		default:
			System.out.println("invalid input!!!");
	}
	day = Integer.parseInt(s.substring(s.indexOf(".")+2,s.indexOf(",")));
	year =  Integer.parseInt(s.substring(s.indexOf(",")+2));
	}
	Date(String m,int d,int y) {
		switch(m) {
			case "Jan.":
				month = 1;
				break;
			case "Feb.":
				month = 2;
				break;
			case "Mar.":
				month = 3;
				break;
			case "Apr.":
				month = 4;
				break;
			case "May.":
				month = 5;
				break;
			case "Jun.":
				month = 6;
				break;
			case "Jul.":
				month = 7;
				break;
			case "Aug.":
				month = 8;
				break;
			case "Sept.":
				month = 9;
				break;
			case "Oct.":
				month = 10;
				break;
			case "Nov.":
				month = 11;
				break;
			case "Dec.":
				month = 12;
				break;
			default:
				System.out.println("invalid input!!!");
		}		
		year = y;
		day =d;
	}
	Date(int y,int m,int d) {
		year = y;
		month = m;
		day =d;
	}
	String print() {
		return (String.valueOf(year)+"/"+String.valueOf(month)+"/"+String.valueOf(day));
	}
}
