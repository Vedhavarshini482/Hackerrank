import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int size = scanner.nextInt();
		System.out.println("Enter the list elements");
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			arr.add(scanner.nextInt());
		scanner.close();
		Program13 program = new Program13();
		program.migratoryBirds(arr);
	}

	public int migratoryBirds(List<Integer> arr) {
		int max = Integer.MIN_VALUE;
		Collections.sort(arr);
		LinkedHashSet<Integer> set = new LinkedHashSet<>(arr);
		ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(set);
		int array[] = new int[listWithoutDuplicates.size()];
		for (int i = 0; i < listWithoutDuplicates.size(); i++) {
			int count = 0;
			for (int j = 0; j < arr.size(); j++) {
				if (listWithoutDuplicates.get(i) == arr.get(j))
					count++;
			}
			array[i] = count;
		}
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		System.out.println(listWithoutDuplicates.get(index));
		return listWithoutDuplicates.get(index);
	}
}