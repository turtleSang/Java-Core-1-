import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		//Hàm scan
		Scanner nhap = new Scanner(System.in);
		
		//Khai Báo biến
		int giaVeLon;
		int giaVeNho;
		int soVeLon;
		int soVeNho;
		int phanTramTuThien;
		float tongThu;
		float tuThien;
		float conLai;
		String tenPhim;

		//input
		System.out.println("Mời bạn nhập tên phim");
		tenPhim = nhap.nextLine();
		System.out.println("Mời bạn nhập vào giá vè Người lớn");
		giaVeLon = Integer.parseInt(nhap.nextLine());
		System.out.println("vui lòng nhập vào vé Trẻ em");
		giaVeNho = Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập vào số lượng vé người lớn");
		soVeLon = Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập vào số vé trẻ em");
		soVeNho = Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập vào số vé từ thiện");
		phanTramTuThien = Integer.parseInt(nhap.nextLine());
		
		//Process
		tongThu = soVeLon*giaVeLon + soVeNho*giaVeNho;
		tuThien = (tongThu*phanTramTuThien*1.0f)/100;
		conLai = tongThu - tuThien;
		
		//Output
		//String text = String.format("%-50s","Tên-phim").replace(' ', '.').replace('-', ' ');
		
		final int KHOANGTRANG = -50;
		String text = String.format("%1$"+KHOANGTRANG +"s","Tên-phim").replace(' ', '.').replace('-', ' ');
		
		
		System.out.println(text + tenPhim);
		
		text = String.format("%1$"+KHOANGTRANG +"s","Số-vé-đã-bán").replace(' ', '.').replace('-', ' ');
		System.out.println( text + (soVeLon + soVeNho));
		
		text = String.format("%1$"+KHOANGTRANG +"s","Doanh-thu").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tongThu);
		
		text = String.format("%1$"+KHOANGTRANG +"s","Trích-phần-trăm-từ-thiện").replace(' ', '.').replace('-', ' ');
		System.out.println(text + phanTramTuThien + "%");
		
		text = String.format("%1$"+KHOANGTRANG +"s","Số-tiền-từ-thiện").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tuThien);
		
		text = String.format("%1$"+KHOANGTRANG +"s","Số-tiền-còn-lại").replace(' ', '.').replace('-', ' ');
		System.out.println(text + conLai);
	}

}
