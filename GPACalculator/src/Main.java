import gradeCalculator.GPA_Data;
import gradeCalculator.PrintFormat;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your GPA calculator");
        System.out.print("How many courses did you register?: ");
        int noofcourses = input.nextInt(), i = 0;
        System.out.println("Input accepted. \nCourses registered: " + noofcourses);

        GPA_Data[] courses = new GPA_Data[noofcourses];

        while (i < noofcourses) {
//            input = new Scanner(System.in);
            GPA_Data newentry = new GPA_Data();

            input = new Scanner(System.in);
            System.out.print("\nEnter course " + (i + 1) + " code: ");
            newentry.setCoursecode(input.nextLine());

            input = new Scanner(System.in);
            System.out.print("Enter course " + (i + 1) + " score: ");
            newentry.setCoursescore(input.nextInt());

            input = new Scanner(System.in);
            System.out.print("Enter course " + (i + 1) + " unit: ");
            newentry.setCourseunit(input.nextInt());

            System.out.print("Course " + (i + 1) + " Input Accepted \n");

            courses[i] = newentry;
            i++;
        }
        PrintFormat print = new PrintFormat();
        print.printfiletable(courses);


    }
}