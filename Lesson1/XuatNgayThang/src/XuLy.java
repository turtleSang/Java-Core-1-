import java.util.Scanner;

import com.sun.java.util.jar.pack.Instruction.Switch;

public class XuLy {

	public static void main(String[] args) {
		boolean flag =true;
		int day = 0;
		int thang;
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập vào tháng:");
		thang = Integer.parseInt(scan.nextLine());
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2: 
			day = 28;
			break;
		default:
			flag = false;
			System.out.println("Vui lòng nhập tháng hợp lệ từ 1 - 12");
			break;
		}
		
		if (flag) {
			System.out.println("Số ngày trong tháng là: " + day);
		}
	}

}
