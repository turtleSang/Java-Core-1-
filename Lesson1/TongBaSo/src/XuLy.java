import java.util.Scanner;

public class XuLy {

	public static float tongBaSo(float a, float b, float c) {
		float tong = a + b+ c;
		return tong;
	}
	
	public static void main(String[] args) {
		float a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào số thứ nhất");
		a = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào số thứ hai");
		b = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào số thứ ba");
		c = Float.parseFloat(scan.nextLine());
		System.out.println("tổng 3 số vừa nhập là: " + tongBaSo(a, b, c));
	}

}
