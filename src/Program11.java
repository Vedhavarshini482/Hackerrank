import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			s.add(scanner.nextInt());
		System.out.println("Enter the birth month");
		int m = scanner.nextInt();
		System.out.println("Enter the birth date");
		int d = scanner.nextInt();
		scanner.close();
		Program11 program = new Program11();
		program.birthday(s, d, m);
	}

	public int birthday(List<Integer> s, int d, int m) {
		int chocolate = 0;
		for (int i = 0; i < s.size() - (m - 1); i++) {
			int sum = 0;
			for (int j = i; j < m + i; j++)
				sum += s.get(j);
			if (sum == d)
				chocolate++;
		}
		System.out.println(chocolate);
		return chocolate;
	}
}