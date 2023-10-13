import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		/*
		 * Bước 1 tạo biến int a, b, c, biggest
		 * Bước 2 tạo hàm lớn nhất
		 * 		+ public static int findBiggest (int a, int b, int c)
		 * 		+ tạo câu điều kiện
		 * 			--nếu a > b
		 * 				- biggest = a
		 * 					nếu biggest < c 
		 * 						biggest = c
		 * 				eles 
		 * 					biggest = b
		 * 					nếu biggest < c
		 * 						biggest = c
		 * 		return biggest
		 * */
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Mời bạn nhập số a");
		a = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập số b");
		b = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập số c");
		c = Integer.parseInt(scan.nextLine());
		
		int biggest = findBiggest(a, b, c);
		System.out.println("Số lớn nhất là: " + biggest);
	}
	
	
	
	
	//Tạo hàm findBiggest tạo parameters int a,b,c tạo biến Biggest
	// nếu a>b -> biggest = a nếu a < c biggest = c
	// còn lại -> biggest = b nếu b < c biggest = c
	public static int findBiggest(int a, int b, int c ) {
		int biggest;
		if (a > b) {
			biggest = a;
			if (a < c) {
				biggest = c;
			}
		}else {
			biggest = b;
			if (c > b) {
				biggest = c;
			}
		}
		return biggest;
	}	
}
