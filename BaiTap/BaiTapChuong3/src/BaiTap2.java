import java.util.Scanner;

public class BaiTap2 {
	
	public static void main(String[] args) {

		// Tạo biến và yêu cầu người dùng nhập vào ngày tháng năm giả sử nhập đúng
		Scanner scan = new Scanner(System.in);
		int day;
		int month;
		int year;

		System.out.println("Mời bạn nhập vào ngày");
		day = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập vào tháng");
		month = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập vào năm");
		year = Integer.parseInt(scan.nextLine());

		// Gọi hàm tìm số ngày trong tháng
		int top = timSoNgayTrongThang(month, year);

		// Gọi hàm tìm ngày tiếp theo
		findNextDay(day, month, year, top);
		// Gọi hàm tìm ngày hôm trước
		findPreviousDay(day, month, year);
	}

	// Hàm tìm số ngày trong tháng
	public static int timSoNgayTrongThang(int month, int year) {
		
		// Kiểm tra năm nhuận của year
		boolean namNhuan = false;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			namNhuan = true;
		}
		
		//tạo ra biến top chứa số ngày trong tháng
		int top = 0;
		
		//Xét tháng nếu tháng 4 6 9 11 có 30 ngày tháng 2 nếu năm nhuận là 29 ngày năm không nhuận là 28 ngày còn lại là 31 ngày
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			top = 30;
			break;
		case 2:
			if (namNhuan) {
				top = 29;
			} else {
				top = 28;
			}
			break;
		default:
			top = 31;
			break;
		}
		//Trả về số ngày trong tháng
		return top;
	}

	// Hàm tìm ngày hôm sau
	public static void findNextDay(int day, int month, int year, int top) {
		
		//Xét day và top nếu day < top thì day +=1
		if (day < top) {
			day += 1;
		} else if (day == top) {
			//Nếu day ==top thì chia làm 2 trường hợp nếu là tháng 12 thì ngày tiếp theo là ngày 1/1/ year +1
			if (month == 12) {
				day = 1;
				month = 1;
				year += 1;
			} else {
				//còn lại thì day = 1 && month +=1
				day = 1;
				month += 1;
			}
		} 
		//Xuất ra ngày tháng năm là ngày tiếp theo
		System.out.println("Ngày tiếp theo là:" + day + "/" + month + "/" + year);
	}

	// Hàm tìm ngày hôm trước
	public static void findPreviousDay(int day, int month, int year) {
		// Trường hợp 1 nếu day 1 thì day -=1 xuất ra day month yearr
		if (day > 1) {
			day -= 1;
			System.out.println("Ngày hôm trước là :" + day + "/" + month + "/" + year);
		} else {
			switch (month) {
			case 1:
				day = 31;
				month = 12;
				year -= 1;
				System.out.println("Ngày hôm trước là :" + day + "/" + month + "/" + year);
				break;

			default:
				month -= 1;
				// Gọi hàm số ngày trong tháng để tìm ra số ngày của tháng trước đó
				day = timSoNgayTrongThang(month, year);
				System.out.println("Ngày hôm trước là :" + day + "/" + month + "/" + year);
				break;
			}
		}

	}
}
