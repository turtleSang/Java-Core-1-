import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử n =");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		System.out.println("\n");
		xuatMang2(a);
		

	}
	public static int[] nhapMang(int n, Scanner scan) {
		int a [] = new int [n];
		System.out.println("Nhập Mảng một chiều");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i +"] = ");
			a[i]= Integer.parseInt(scan.nextLine());
		}	
		return a;
	}
	public static void xuatMang(int b []) {
		System.out.println("Xuất mảng cách 1");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
	}
	public static void xuatMang2(int c []) {
		System.out.println("Xuất mảng cách 2");
		for (int item : c) {
			System.out.print(item + "\t");
		}
	}
}
