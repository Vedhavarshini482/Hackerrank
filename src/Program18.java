import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the steps");
		int steps = scanner.nextInt();
		System.out.println("Enter the path");
		String path = scanner.next();
		scanner.close();
		new Program18().countingValleys(steps, path);
	}

	public int countingValleys(int steps, String path) {
		int valleysCount = 0;
		int traverse = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'D')
				traverse--;
			else {
				traverse++;
				if (traverse == 0)
					valleysCount++;
			}
		}
		System.out.println(valleysCount);
		return valleysCount;
	}
}
