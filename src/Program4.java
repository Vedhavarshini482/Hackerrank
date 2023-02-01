import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list length");
		int length = scanner.nextInt();
		System.out.println("Enter the list elements");
		List<Integer> candles = new ArrayList<Integer>();
		for (int i = 0; i < length; i++)
			candles.add(scanner.nextInt());
		scanner.close();
		Program4 program = new Program4();
		program.birthdayCakeCandles(candles);
	}

	public int birthdayCakeCandles(List<Integer> candles) {
		Collections.sort(candles);
		int max = candles.get(candles.size() - 1);
		int count = 0;
		for (int i = 0; i < candles.size(); i++)
			if (max == candles.get(i))
				count++;
		System.out.println(count);
		return count;
	}
}