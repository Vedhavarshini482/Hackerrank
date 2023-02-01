import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a time String");
		String s = scanner.nextLine();
		scanner.close();
		Program5 program = new Program5();
		program.timeConversion(s);
	}

	public String timeConversion(String s) {
		String string = "";
		if (s.charAt(8) == 'A') {
			if ((s.charAt(0) == '1' && s.charAt(1) == '2'))
				string = "00" + s.substring(2, 8);
			else
				string = s.substring(0, 8);
		} else {
			if ((s.charAt(0) == '1' && s.charAt(1) == '2'))
				string = s.substring(0, 8);
			else {
				String dup = "" + s.charAt(0) + s.charAt(1);
				int temp = Integer.parseInt(dup) + 12;
				string = Integer.toString(temp) + s.substring(2, 8);
			}
		}
		System.out.println(string);
		return string;
	}
}