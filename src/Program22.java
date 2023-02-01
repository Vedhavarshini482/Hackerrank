import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of List");
		int size = scanner.nextInt();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < size; i++)
			a.add(scanner.nextInt());
		scanner.close();
		System.out.println(new Program22().pickingNumbers(a));
	}

	public int pickingNumbers(List<Integer> a) {
		int max = 0, count;
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			count = 1;
			for (int j = i + 1; j < a.size(); j++)
				if (Math.abs(a.get(i) - a.get(j)) <= 1)
					count++;
				else
					break;
			if (count > max)
				max = count;
		}
		return max;
	}
}