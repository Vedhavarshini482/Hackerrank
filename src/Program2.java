import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Program2 program = new Program2();
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		scanner.close();
		program.staircase(n);
	}

	public void staircase(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("#");
			System.out.println();
		}
	}
}