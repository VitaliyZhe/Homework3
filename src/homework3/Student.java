package homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student extends Human implements AddStudent {
	private Group group;
	private int course;
	private int performanceRating;
	private Scanner scanner = new Scanner(System.in);

	public Student(String firstName, String lastName, int age, int weight, int height, boolean sex, int course,
			int performanceRating) {
		super(firstName, lastName, age, weight, height, sex);
		this.course = course;
		this.performanceRating = performanceRating;
	}

	public Student() {
		super();
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}

	@Override
	public String toString() {

		return "Course=" + course + ", performanceRating=" + performanceRating + ", " + super.toString();
	}

	@Override
	public Student addStudentData(Student student) {
		// TODO Auto-generated method stub
		// String firstName, String lastName, int age, int weight, int height, boolean
		// sex, int course,
		// int performanceRating
		for (boolean i = true; i != false;) {
			System.out.println("Set student FirstName");

			String fName = scanner.next();
			try {
				if (!fName.matches("^\\D*$")) {
					System.out.println("You entered a name with numbers");
					throw new MyException();
				} else {
					i = false;
					student.setFirstName(fName);
				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}

		for (boolean i = true; i != false;) {
			try {
				System.out.println("Set student LastName");
				String fName = scanner.next();

				if (!fName.matches("^\\D*$")) {
					throw new MyException();
				} else {
					i = false;
					student.setLastName(fName);
				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
		for (boolean i = true; i != false;) {
			try {
				System.out.println("Set student Age 17-50");
				int fAge = scanner.nextInt();
				if (fAge > 16 && fAge < 50) {
					student.setAge(fAge);
					i = false;
				} else {
					throw new MyException();
				}
			}

			catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}

		for (boolean i = true; i != false;) {
			try {
				System.out.println("Set student Sex 0-man/1-whoman");
				int sex = scanner.nextInt();
				if (sex == 1 | sex == 0) {
					student.setSex((sex == 0) ? true : false);
					i = false;
				} else {
					throw new MyException();

				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
		for (boolean i = true; i != false;) {
			try {
				System.out.println("Set student cource 1-5");
				int cource = scanner.nextInt();

				if (cource >= 1 && cource < 6) {
					student.setCourse(cource);
					i = false;
				} else {
					throw new MyException();
				}
			}

			catch (MyException | InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		}
		for (boolean i = true; i != false;) {
			try {
				System.out.println("Performance rating 1-10");
				int rating = scanner.nextInt();
				if (rating >= 1 && rating <= 10) {
					student.setPerformanceRating(rating);
					i = false;
				} else {
					throw new MyException();
				}
			}

			catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Student add");
		System.out.println();

		return student;
	}
}
