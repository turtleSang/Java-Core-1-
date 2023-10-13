import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bạn muốn thấy bao nhiêu số Fibonaci ");
		int num = Integer.parseInt(scan.nextLine());
		printArrayFi(num);
		

	}
	public static void printFibonacci (int num) {
		int numFi = 0;
		int preNumFi1 = 0;
		int preNumFi2 = 1;
		int soFiThui = 0;
		for (int i = 0; i < num; i++) {
			if ( i == 0 || i == 1) {
				numFi = i;
			} else {
				numFi = preNumFi1 + preNumFi2;
				preNumFi1 =preNumFi2;
				preNumFi2 = numFi;
				soFiThui = numFi;
			}
			System.out.println("Số fibonaci thứ " + (i+1) + " là: " + numFi );
		}
		System.out.println("Số Fibonaci thứ i là: " +soFiThui);
	}
	
	public static int  prinFi (int n) {
		int kq = 0;
		int a0 = 0;
		int a1 = 1;
		int an = 1;
		if(n == 1 || n == 0) {
			kq = n;
		} else if(n < 0) {
			kq = -1;
		} else {
			for (int i = 2; i < n; i++) {
				a0 = a1;
				a1 = an;
				an = a1+ a0;
				kq = an;
			}
		}
		return kq;
	}
	
	public static void printArrayFi(int n) {
		for (int i = 0; i < n; i++) {
			int a = prinFi(i);
			System.out.print(a + " \t");
		}
	}
}
