import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the list");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter the list elements");
		List<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			ar.add(scanner.nextInt());
		Program12 program = new Program12();
		System.out.println("Enter the dividor");
		int k = scanner.nextInt();
		scanner.close();
		program.divisibleSumPairs(n, k, ar);
	}

	public int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int validPairs = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				if ((ar.get(i) + ar.get(j)) % k == 0)
					validPairs++;
		}
		System.out.println(validPairs);
		return validPairs;
	}
}