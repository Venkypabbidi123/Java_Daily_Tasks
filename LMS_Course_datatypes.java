public class LMS_Course_datatypes{
  public static void main(String[] args) {
    short course_id = 101;
    String title = "Introduction to Java";
    float rating = 4.5f;
    double price = 1999.99;
    boolean certificate_available = true;
    char level = 'B';
    long enrolled_students = 123456789l;
    byte modules = 10;
    byte duration = 60;

    System.out.println("Course_ID : " + course_id);
    System.out.println("Title : " + title);
    System.out.println("Rating : " + rating);
    System.out.println("Price : " + price);
    System.out.println("Certificate _Available : " + certificate_available);
    System.out.println("Level : " + level);
    System.out.println("Enrolled Students : " + enrolled_students);
    System.out.println("Module : " + modules);
    System.out.println("Duration (in minutes) : " + duration + " mins");
  }
}