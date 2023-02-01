import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total pages count");
		int n = scanner.nextInt();
		System.out.println("Enter the page number");
		int p = scanner.nextInt();
		scanner.close();
		new Program17().pageCount(n, p);
	}

	public int pageCount(int n, int p) {
		int mid = n / 2, pageCount = 0;
		if (p <= mid) {
			for (int i = 1; i < p; i += 2)
				pageCount++;
		} else {
			if (n % 2 != 0)
				n = n - 1;
			for (int i = n; i > p; i -= 2)
				pageCount++;
		}
		System.out.println(pageCount);
		return pageCount;
	}
}