import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner((System.in));
		int day;
		int month;
		int year;
		int dayOfWeek;
		int top = 0;
		boolean flag = true;

		System.out.println("Vui lòng nhập ngày");
		year = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập tháng");
		month = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập năm");
		day = Integer.parseInt(scan.nextLine());

		if (year < 1852 || month < 1 || month > 12) {
			flag = false;
		}
//		} else {
//			switch (month) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//				top = 31;
//				break;
//			case 2:
//				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//					top = 29;
//				} else {
//					top = 28;
//				}
//				break;
//			default:
//				top = 30;
				break;
			}
		}
		
		System.out.println(top + "....." + flag);
		
		
//		if (day > top || day < 1) {
//			flag = false;
//		}
//		
//		if (!flag) {
//			System.out.println("ngày tháng nhập không hợp lệ");
//		} else {
//			int a = (14 - month)/12;
//			year -= a;
//			month += a*12 - 2;
//			dayOfWeek = ((day + year/4 - year/100 + year/400 + (31*month)/12))%7;
//			System.out.println(dayOfWeek);
//			
//		}
		
		
		
		
		
	}

}
