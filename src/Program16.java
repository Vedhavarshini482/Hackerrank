import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int n = scanner.nextInt();
		List<Integer> ar = new ArrayList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++)
			ar.add(scanner.nextInt());
		scanner.close();
		new Program16().sockMerchant(n, ar);
	}

	public int sockMerchant(int n, List<Integer> ar) {
		Collections.sort(ar);
		int sum = 0;
		for (int i = 0; i < n;) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (ar.get(i).equals(ar.get(j)))
					count++;
			}
			if (count != 0)
				sum += count / 2;
			else
				i++;
			i += count;
		}
		System.out.println(sum);
		return sum;
	}
}