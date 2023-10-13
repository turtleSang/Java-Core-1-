import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {

		/*
		 * Bước 1 tạo ra hàm nhập và tọa biến Tung độ ordinateC, ordinateM, Hoành độ:
		 * abscissaC, abscissaM, Bán kính R: radiusR; Khoản cách điểm M và C: distance
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		float radiusR;
		float ordinateC;
		float ordinateM;
		float abscissaC;
		float abscissaM;
		double distance;

		/*
		 * Bước 2 in ra màn hình và cho người dùng nhập vào tung độ C hoành độ C, tung
		 * độ M, hoành độ M, bán kính R
		 * 
		 */
		System.out.println("Mời bạn nhập vào tung độ điểm C");
		ordinateC = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập vào hoành độ điểm C");
		abscissaC = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập vào Bán kính của C");
		radiusR = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập vào tung độ điểm M");
		ordinateM = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập vào tung độ điểm M");
		abscissaM = Float.parseFloat(scan.nextLine());

		/*
		 * Bước 3 tính khoản cách điểm C và M distance khoản cách = căn bật 2 của (tung
		 * độ C - tung độ M)^2 + (hoành độ C - Hoành độ D)^2
		 * 
		 */
		distance = Math.sqrt(Math.pow((ordinateC - ordinateM), 2) + Math.pow((abscissaC - abscissaM), 2));

		/*
		 * Bước 4 so sánh khoản cách của điểm M và C so với bán kính R Nếu R = khoảng
		 * cách thì điểm M nằm trên đường tròn C Nếu R > khoản cách thì điểm M nằm trong
		 * đường tròn C Nếu R < khoản cách thì điểm M nằm ngoài đường tròn C
		 */
		if (distance == radiusR) {
			System.out.println("Điểm M nằm trên đường tròn C");
		} else if (distance < radiusR) {
			System.out.println("Điểm M nằm bên trong đường tròn C");
		} else {
			System.out.println("Điểm M nằm ngoài đường tròn C");
		}
	}
}
