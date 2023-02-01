import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the positions of the two Kangaroo's");
		int x1 = scanner.nextInt(), x2 = scanner.nextInt();
		System.out.println("Enter the two kangaroo's jumps per meter");
		int v1 = scanner.nextInt(), v2 = scanner.nextInt();
		scanner.close();
		Program8 program = new Program8();
		program.kangaroo(x1, v1, x2, v2);
	}

	public String kangaroo(int x1, int v1, int x2, int v2) {
		if ((v1 > v2) && ((x2 - x1) % (v2 - v1) == 0)) {
			System.out.println("YES");
			return "YES";
		}
		System.out.println("NO");
		return "NO";
	}
}