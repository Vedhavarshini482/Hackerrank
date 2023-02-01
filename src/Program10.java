import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size = scanner.nextInt();
		List<Integer> scores = new ArrayList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++)
			scores.add(scanner.nextInt());
		scanner.close();
		Program10 program = new Program10();
		program.breakingRecords(scores);
	}

	public List<Integer> breakingRecords(List<Integer> scores) {
		int minScore = scores.get(0), maxScore = scores.get(0);
		int min = 0, max = 0;
		for (int i = 0; i < scores.size(); i++) {
			if (maxScore < scores.get(i)) {
				maxScore = scores.get(i);
				max++;
			}
			if (minScore > scores.get(i)) {
				minScore = scores.get(i);
				min++;
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(max);
		list.add(min);
		System.out.println(list);
		return list;
	}
}