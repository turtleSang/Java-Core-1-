import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		//Bước 1: Tạo hàm Nhập
		Scanner nhap = new Scanner(System.in);
		
		//Bước 2: tạo Biến ketQua
		int tongNamSo = 0;
		
		//Bước 3: in câu lệnh nhập số thứ nhất và gán kết quả cộng dồn bằng +=
		System.out.println("Vui lòng nhập số thứ 1");
		tongNamSo += Integer.parseInt(nhap.nextLine());
		
		//Bước 4 làm lại bước 3 4 lần
		System.out.println("Vui lòng nhập số thứ 2");
		tongNamSo += Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập số thứ 3");
		tongNamSo += Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập số thứ 4");
		tongNamSo += Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập số thứ 5");
		tongNamSo += Integer.parseInt(nhap.nextLine());
		
		//Bước 5 tạo biến kêt quả kiểu Float ketQua gán cho tongNamSo*1.0f/5  
		Float ketQua = tongNamSo*1.0f/5; 
		
		//Bước 6 xuất ra màn hình  kết quả
		System.out.println("Trung Bình 5 số bạn vừa nhập là: \t" + ketQua);
	}

}
