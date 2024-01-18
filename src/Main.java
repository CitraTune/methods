import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student James = new Student("James", "Keating");
        James.addCourse(new Course("english", 95));
        James.addCourse(new Course("history", 85));
        James.addCourse(new Course("math", 90));
        Student LE = new Student("Ellie", "Davis");
        LE.addCourse(new Course("english", 100));
        LE.addCourse(new Course("science", 90));
        LE.addCourse(new Course("elective", 80));
        System.out.println(James);
        System.out.println(LE);
    }
}
class Student
{
    private String firstName, lastName;
    private ArrayList<Course> Courses = new ArrayList<Course>();

    public ArrayList<Course> getCourses() {
        return Courses;
    }
    public String toString(){
        String classesAndScores = "";
        for(int i = 0; i < Courses.size(); i++){
            classesAndScores = classesAndScores + Courses.get(i).getCourseName() + ": " + Courses.get(i).getTestScore() + ", ";
        }
        return "Name of student: " + firstName + " " + lastName + ". Student's classes and scores: "  + classesAndScores + " Average Score: " + this.getAverage();
    }

    public void setCourses(ArrayList<Course> courses) {
        Courses = courses;
    }
    public void addCourse(Course course){
        Courses.add(course);
    }

    public float getAverage(){
        int numberOfTests = 3;
        float average = 0;
        for(int i = 0; i < numberOfTests; i++){
            average += Courses.get(i).getTestScore();
        }
        average = average/numberOfTests;
        return average;
    }
    public Student()
    {
        firstName = "";
        lastName = "";
    }
    public Student(String first, String last)
    {
        firstName = first;
        lastName = last;
    }
}
class Course{


    String courseName;
    int testScore = 0;
    public Course(){

    }
    public Course(String courseName, int testScore){
        this.courseName = courseName;
        this.testScore= testScore;
    }

    public int getTestScore() {
        return testScore;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
}