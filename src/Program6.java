import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list size");
		int size = scanner.nextInt();
		System.out.println("Enter the list elements");
		List<Integer> grades = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			grades.add(scanner.nextInt());
		scanner.close();
		Program6 program = new Program6();
		program.gradingStudents(grades);
	}

	public List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> gradingStudents = new ArrayList<Integer>();
		for (int i = 0; i < grades.size(); i++) {
			int temp = grades.get(i);
			if (temp % 5 >= 3 & temp > 35)
				if (temp % 5 == 3)
					temp += 2;
				else if (temp % 5 == 4)
					temp += 1;
			gradingStudents.add(temp);
		}
		System.out.print(gradingStudents);
		return gradingStudents;
	}
}