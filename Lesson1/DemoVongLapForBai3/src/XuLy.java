import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int tongChiaHetCho3 = demTongSoChiaHetCho3(scan);
//		System.out.println("Tổng các số chia hết cho 3 là :" +tongChiaHetCho3);

		int tongChiahetcho3Cach2 = demCacSoChiaHet3(scan);
		System.out.println("Tổng các số chia hết cho 3 là :" + tongChiahetcho3Cach2);

	}

	public static int demTongSoChiaHetCho3(Scanner scan) {
		System.out.println("Nhập một số để tính tổng các số chia hết cho 3: ");
		int num = Integer.parseInt(scan.nextLine());
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int demCacSoChiaHet3(Scanner scan) {
		System.out.println("Nhập một số để tính tổng các số chia hết cho 3: ");
		int num = Integer.parseInt(scan.nextLine());
		int count = 0;
		int i = 0;
		while (i < num) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}
		return count;
	}
}
