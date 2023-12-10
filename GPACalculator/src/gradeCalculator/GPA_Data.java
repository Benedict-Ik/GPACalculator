package gradeCalculator;

public class GPA_Data {
    private String Coursecode;
    private int Courseunit;
    private String Coursegrade;
    private int Coursegradeunit;
    private int coursescore;


    public void setCoursecode(String coursecode) {
        this.Coursecode = coursecode;
    }
    public String getCoursecode() {
        return Coursecode;
    }
    public void setCourseunit(int courseunit) {
        this.Courseunit = courseunit;
    }
    public int getCourseunit() {
        return Courseunit;
    }

    public void setCoursescore(int score) {
        this.coursescore = score;
        if (this.coursescore >= 70) {
            this.Coursegradeunit = 5;
            this.Coursegrade = "A";
            System.out.print("Excellent!\n");
        } else if (this.coursescore >= 60) {
            this.Coursegradeunit = 4;
            this.Coursegrade = "B";
            System.out.print("Very Good\n");
        } else if (this.coursescore >= 50) {
            this.Coursegradeunit = 3;
            this.Coursegrade = "C";
            System.out.print("Good\n");
        } else if (this.coursescore >= 45) {
            this.Coursegradeunit = 2;
            this.Coursegrade = "D";
            System.out.print("Fair\n");
        } else if (this.coursescore >= 40) {
            this.Coursegradeunit = 1;
            this.Coursegrade = "E";
            System.out.print("Pass\n");
        } else if (this.coursescore >= 0) {
            this.Coursegradeunit = 0;
            this.Coursegrade = "F";
            System.out.print("Fail\n");
        }
    }

    public  String getCoursegrade() {
        return this.Coursegrade;
    }

    public int getCoursegradeunit() {
        return this.Coursegradeunit;
    }
}