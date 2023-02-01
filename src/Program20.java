import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the position of cat A and cat B");
		int x = scanner.nextInt(), y = scanner.nextInt();
		System.out.println("Enter the mouse position");
		int z = scanner.nextInt();
		scanner.close();
		new Program20().catAndMouse(x, y, z);
	}

	public String catAndMouse(int x, int y, int z) {
		if (Math.abs(z - y) == Math.abs(z - x)) {
			System.out.println("Mouse C");
			return "Mouse C";
		} else if (Math.abs(z - y) < Math.abs(z - x)) {
			System.out.println("Cat B");
			return "Cat B";
		} else {
			System.out.println("Cat A");
			return "Cat A";
		}
	}
}