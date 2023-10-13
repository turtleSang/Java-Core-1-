
public class BaiTap2 {
	static final int NUM = 10000;
	public BaiTap2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int tong = 0;
		int n = 0;
		for (int i = 0; tong <= NUM; i++) {
			tong +=i;
			n = i;
		}
		System.out.println("Số n nhỏ nhất để 1+2+3+ ..+n > " + NUM +" là: " + n);

	}
	
}
