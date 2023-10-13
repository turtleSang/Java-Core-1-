import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bigger;
		int d1;
		int d2;
		
		System.out.println("Mời bạn nhập vào d1");
		d1 = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập vào d2");
		d2 = Integer.parseInt(scan.nextLine());
		
		if (d1 < d2) {
			bigger = d2;
		}
		else
		{
			bigger =d1;
		}
		System.out.println("Số lớn hơn là " + bigger);

	}

}
