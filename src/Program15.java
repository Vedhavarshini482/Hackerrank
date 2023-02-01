import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		List<Integer> bill = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			bill.add(scanner.nextInt());
		System.out.println("Enter the index of the item Anna doesn't eat");
		int k = scanner.nextInt();
		System.out.println("Enter the amount of money that Anna contributed to the bill");
		int b = scanner.nextInt();
		scanner.close();
		new Program15().bonAppetit(bill, k, b);
	}

	public void bonAppetit(List<Integer> bill, int k, int b) {
		int sum = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i == k)
				continue;
			else
				sum += bill.get(i);
		}
		System.out.println(b == (sum / 2) ? "Bon Appetit" : b - (sum / 2));
	}
}