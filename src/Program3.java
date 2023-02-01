import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int n = scanner.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++)
			arr.add(scanner.nextInt());
		scanner.close();
		Program3 program = new Program3();
		program.miniMaxSum(arr);
	}

	public void miniMaxSum(List<Integer> arr) {
		Collections.sort(arr);
		long min = 0, max = 0;
		for (int i = 0; i < 4; i++)
			min += arr.get(i);
		for (int i = 4; i >= 0; i--)
			max += arr.get(i);
		System.out.println(min + " " + max);
	}
}