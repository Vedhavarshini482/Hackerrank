import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first list size");
		int size1 = scanner.nextInt();
		System.out.println("Enter the second list size");
		int size2 = scanner.nextInt();
		System.out.println("Enter the first list elements");
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < size1; i++)
			a.add(scanner.nextInt());
		System.out.println("Enter the second list elements");
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < size2; i++)
			b.add(scanner.nextInt());
		scanner.close();
		Program9 program = new Program9();
		program.getTotalX(a, b);
	}

	public int getTotalX(List<Integer> a, List<Integer> b) {
		List<Integer> count = new ArrayList<Integer>();
		for (int i = 1; i <= b.get(b.size() - 1); i++) {
			int temp = 0;
			for (int j = 0; j < a.size(); j++) {
				if (i % a.get(j) == 0)
					temp++;
			}
			if (temp == a.size())
				count.add(i);
		}
		System.out.println(count);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < count.size(); i++) {
			int temp = 0;
			for (int j = 0; j < b.size(); j++) {
				if (b.get(j) % count.get(i) == 0)
					temp++;
			}
			if (temp == b.size())
				list.add(count.get(i));
		}
		System.out.println(list.size());
		return list.size();
	}
}