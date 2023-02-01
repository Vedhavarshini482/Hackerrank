import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		int b = scanner.nextInt();
		System.out.println("Enter the size of keyboard array and drives array");
		int size1 = scanner.nextInt();
		int size2 = scanner.nextInt();
		System.out.println("Enter the keyboards");
		int[] keyboards = new int[size1];
		for (int i = 0; i < size1; i++)
			keyboards[i] = scanner.nextInt();
		System.out.println("Enter the drives");
		int[] drives = new int[size2];
		for (int i = 0; i < size2; i++)
			drives[i] = scanner.nextInt();
		scanner.close();
		new Program19().getMoneySpent(keyboards, drives, b);
	}

	public int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int mostHighAmount = 0;
		int[] array = new int[keyboards.length * drives.length];
		for (int i = 0, index = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++, index++)
				array[index] = keyboards[i] + drives[j];
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= b)
				mostHighAmount = Math.max(mostHighAmount, array[i]);
		}
		if (mostHighAmount == 0)
			mostHighAmount = -1;
		System.out.println(mostHighAmount);
		return mostHighAmount;
	}
}