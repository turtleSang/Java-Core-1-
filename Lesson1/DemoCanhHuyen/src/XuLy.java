import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		//Khai báo biến
		Scanner nhap = new Scanner(System.in);
		int edge1;//Cạnh góc vuông 2
		int edge2;//Cạnh góc vuông 2
		double edge3;
		
		//Nhập dữ liệu		
		System.out.println("Vui lòng nhập vào cạnh 1");
		edge1 = Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập vào số cạnh 2");;
		edge2 = Integer.parseInt(nhap.nextLine());
		edge3 = Math.sqrt(edge1*edge1+edge2*edge2);
		
		//Xuất dữ liệu
		System.out.println("Cạnh huyền là: \t"+edge3);
		
	}

}
