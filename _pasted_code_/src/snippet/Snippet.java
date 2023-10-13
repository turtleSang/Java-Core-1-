package snippet;

public class Snippet {
	public static int demTongSoChiaHetCho3(Scanner scan) {
			System.out.println("Nh?p m?t s? ?? tính t?ng các s? chia h?t cho 3: ");
			int num = Integer.parseInt(scan.nextLine());
			int count = 0;
			for (int i = 0; i < num; i++) {
				if (i % 3 == 0 ) {
					count++;
				}
			}
			return count;
		}
}

