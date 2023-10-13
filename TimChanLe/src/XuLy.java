import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		//Bước 1 tạo hàm nhập và biến number là số do người dùng nhập vào
		Scanner scan = new Scanner(System.in);
		int number;
		boolean check;
		boolean flag = true;
		
		System.out.println("Vui lòng nhập vào một số");
		number = Integer.parseInt(scan.nextLine());
		
		//Kiểm tra số nhập vào số có phải là số 0 
		if (number  == 0) {
			flag = false;
		}
		//nếu là số 0 thì không xét chẵn lẽ còn lại xét chẵn lẽ
		if (!flag) {
			System.out.println("Số bạn nhập vào là số không chẵn không lẽ");
		} else {
			//Kiểm tra số nhập vào là chẵn lẽ
			check = findParity(number);	
			if (check) {
				System.out.println("Số bạn nhập là số chẵn");
			} else {
				System.out.println("Số bạn nhập là số lẻ");
			}
		}
	}
	
	public static boolean findParity (int a) {
		boolean flag = false;
		if (a % 2 == 0) {
			flag = true;
		}
		return flag;
	}

}
