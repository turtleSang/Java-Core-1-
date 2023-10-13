import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		//Tạo hàm nhập
		Scanner nhap = new Scanner(System.in);
		
		//Yêu cầu nhập số n
		System.out.println("Mời bạn nhập vào số n");
		int n;
		n = Integer.parseInt(nhap.nextLine());
		
		//Khai báo biến kySo
		int kySo1;
		int kySo2;
		int kySo3;
		
		//Tìm ký số đầu tiên bằng cách chia hết cho 100 và gán n = n%100
		kySo1 = n/100;
		n = n%100;
		kySo2 = n/10;
		kySo3 = n%10;
		
		
		//Khai báo biến kết quả
		int ketQua = kySo1 + kySo2 + kySo3;
		System.out.println("Tổng của 3 ký số là: \t" + ketQua);
	}

}
