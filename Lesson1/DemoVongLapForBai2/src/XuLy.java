import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		tinhTongSoChan(nhap);

	}
	public static void tinhTongSoChan( Scanner scan) {
		System.out.println("Vui lòng nhập N");
		int N = Integer.parseInt(scan.nextLine());
		int tongSoChan =0;
		for (int i = 0; i < N; i++) {
			if( (i%2) == 0) {
				tongSoChan += i;
			}
		}
		System.out.println("Tổng các số chẵn từ 1 - "+ N + " là:" +tongSoChan);
				
	}

}
