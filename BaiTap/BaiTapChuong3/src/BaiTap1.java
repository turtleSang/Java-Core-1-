import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("nhập số a");
		a = Integer.parseInt(scan.nextLine());
		System.out.println("nhập số b");
		b = Integer.parseInt(scan.nextLine());
		System.out.println("nhập số c");
		c = Integer.parseInt(scan.nextLine());

		// Nếu a < b xét b và c
		if (a < b) {

			if (b < c) {
				System.out.println(a + "<" + b + "<" + c);

			} else if (b > c) {
				if (a < c) {
					System.out.println(a + "<" + c + "<" + b);
				} else if (a > c) {
					System.out.println(c + "<" + a + "<" + b);
				} else {
					System.out.println(a + "=" + c + "<" + b);
				}

			} else {
				System.out.println(a + "<" + b + "=" + c);
			}

		} else if (a > b) {
			if (c < b) {
				System.out.println(c + "<" + b + "<" + a);
			} else if (c > b) {
				if (a < c) {
					System.out.println(b + "<" + a + "<" + c);
				} else if (a > c) {
					System.out.println(b + "<" + c + "<" + a);
				} else {
					System.out.println(b + "<" + a + "=" + c);
				}

			} else {
				System.out.println(b + "=" + c + "<" + c);
			}
		} else {
			if (b < c) {
				System.out.println(a + "=" + b + "<" + c);
			} else if (b > c){
				System.out.println(c + "<" + a + "=" + b);
			} else {
				System.out.println(a + "=" + b + "=" + c);
			}
		}

	}

}
