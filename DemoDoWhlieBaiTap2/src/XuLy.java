import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doanSo();
	}
	
	public static void doanSo() {
		int soBiMat = (int) (Math.random()*100+1);
		int soNhap;
		do {
			System.out.println("Vui lòng nhập vào 1 số: ");
			soNhap = Integer.parseInt(scan.nextLine());
			if(soNhap < soBiMat) {
				System.out.println("Số bạn nhập nhỏ hơn số Bí Mật");
			} else if (soNhap > soBiMat) {
				System.out.println("Số bạn nhập lớn hơn số Bí Mật");
			} 
			
			
		} while (soNhap != soBiMat);
		System.out.println("Số bí mật là: " + soBiMat);
	}
}
