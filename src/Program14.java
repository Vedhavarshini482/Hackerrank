import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an year");
		int year = scanner.nextInt();
		scanner.close();
		new Program14().dayOfProgrammer(year);
	}

	public String dayOfProgrammer(int year) {
		String programmerDay = "";
		if (year == 1918)
			programmerDay = "26.09.1918";
		else if (year > 1918)
			programmerDay = year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)) ? "12.09." + year
					: "13.09." + year;
		else
			programmerDay = year % 4 == 0 ? "12.09." + year : "13.09." + year;
		System.out.println(programmerDay);
		return programmerDay;
	}
}