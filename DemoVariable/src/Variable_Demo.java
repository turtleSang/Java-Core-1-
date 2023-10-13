import java.util.Scanner;

public class Variable_Demo {

	public static void main(String[] args) {
		//Khai báo hàm nhập Scanner
		Scanner scan = new Scanner(System.in);
		
		/*
		 * khai báo hằng số pi
		 * */
		final float pi = 3.14f;
		
		//Hàm khai báo bán kính và biến
		float banKinh = 3;
		float chuVi = banKinh*2*pi;
		float dienTich = banKinh*banKinh*pi;
		System.out.println(banKinh + " " + chuVi + " " + dienTich);;
	}

}
