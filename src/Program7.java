import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting point and ending point");
		int s = scanner.nextInt(), t = scanner.nextInt();
		System.out.println("Enter the apples and oranges count");
		int m = scanner.nextInt(), n = scanner.nextInt();
		System.out.println("Enter the location of apple tree");
		int a = scanner.nextInt(), b = scanner.nextInt();
		List<Integer> apples = new ArrayList<Integer>();
		List<Integer> oranges = new ArrayList<Integer>();
		System.out.println("Enter apple landing distance");
		for (int i = 0; i < m; i++)
			apples.add(scanner.nextInt());
		for (int i = 0; i < n; i++)
			oranges.add(scanner.nextInt());
		scanner.close();
		Program7 program = new Program7();
		program.countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	public void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		for (int i = 0; i < apples.size(); i++)
			apples.set(i, apples.get(i) + a);
		for (int i = 0; i < oranges.size(); i++)
			oranges.set(i, oranges.get(i) + b);
		int appleCount = 0, orangeCount = 0;
		for (int i = 0; i < apples.size(); i++)
			if (apples.get(i) >= s && apples.get(i) <= t)
				appleCount++;
		for (int i = 0; i < oranges.size(); i++)
			if (oranges.get(i) >= s && oranges.get(i) <= t)
				orangeCount++;
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
}