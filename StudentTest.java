import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student1 = new Student("Jane Green", 93.5);
        Student student2 = new Student("John Blue", 72.75);

        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());

        System.out.printf("Enter new average for " + student1.getName() + ": ");
        double newAverage1 = input.nextDouble();
        student1.setAverage(newAverage1);

        System.out.printf("%s's new letter grade is: %s%n", student1.getName(), student1.getLetterGrade());

        System.out.print("Enter new average for " + student2.getName() + ": ");
        double newAverage2 = input.nextDouble();
        student2.setAverage(newAverage2);

        System.out.printf("%s's new letter grade is: %s%n", student2.getName(), student2.getLetterGrade());
    }
}