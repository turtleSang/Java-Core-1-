import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int count = DemLanThiLaie();
		System.out.println("Sau "+count+" lần thi");
		
	}
	public static int DemLanThiLaie() {
		float diem = 0;
		int count = 0;
		while (diem < 5) {
			System.out.println("Mời bạn nhập điểm thi");
			diem = Float.parseFloat(scan.nextLine());
			if (diem < 5) {
				count++;
			} else {
				System.out.print("Chúc Mừng bạn đã thi đậu ");
			}
		}
		return count;
	}

}
