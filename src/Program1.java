import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Program1 program = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int size = scanner.nextInt();
		System.out.println("Enter the list elements");
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			arr.add(scanner.nextInt());
		scanner.close();
		program.plusMinus(arr);
	}

	public void plusMinus(List<Integer> arr) {
		float positive = 0, negative = 0, zero = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0)
				positive++;
			else if (arr.get(i) < 0)
				negative++;
			else
				zero++;

		}
		System.out.println(positive / arr.size());
		System.out.println(negative / arr.size());
		System.out.println(zero / arr.size());
	}
}