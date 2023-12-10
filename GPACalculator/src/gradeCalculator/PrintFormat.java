package gradeCalculator;

public class PrintFormat {
    public void printfiletable(GPA_Data[] courses) {
        System.out.println("\n Breakdown of data: ");
        System.out.println("|-----------------|-----------------|--------|-----------| \n");
        System.out.printf("| %15s | %13s | %7s | %10s |\n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
        System.out.println("|-----------------|-----------------|-------|------------|\n");
        for (GPA_Data courselist : courses) {
            System.out.printf("| %-15s | %-13d | %-7s | %-10d |\n", courselist.getCoursecode(), courselist.getCourseunit(), courselist.getCoursegrade(), courselist.getCoursegradeunit());
        }
        System.out.println("|--------------------------------------------------------|\n");
        GPA_Calculator calculate = new GPA_Calculator();
        System.out.printf("Your GPA is: %.2f", calculate.overallfunction(courses));
    }

}