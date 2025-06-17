import java.util.*;
public class LMS_LOOPS{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Student_ID : ");
    int student_ID = in.nextInt();
    System.out.println("Enter Student Name : ");
    String student_name = in.next();
    System.out.print("Enter _Attendance : ");
    double attendence = in.nextDouble();
    int total_score = 0;
    int number_of_subjects = 0;
    String user = "yes";
    while (user.equals("Yes") || user.equals("yes")){
      System.out.println("Enter Score of subject : " + (number_of_subjects + 1));
      int sub_score = in.nextInt();
      total_score += sub_score;
      System.out.println("Do you want to enter another score ? (yes/no)");
      user = in.next();
      number_of_subjects++;
       attendence+=1;
    }
    double avg_score = (double) total_score/number_of_subjects;
    String performance;
    if (avg_score >= 85){
      performance = "Excellent";
    }
    else if (avg_score > 70){
      performance = "Good";
    }
    else if (avg_score > 60){
      performance = "Average";
    }
    else{
      performance = "Needs Improvement";
    }
    String attendance_performance;
    if (attendence < 75){
      attendance_performance = "Low Attendance";
    }
    else{
      attendance_performance = "Good";
    }
    System.out.println("Student_ID : " + student_ID);
    System.out.println("Student_Name : " + student_name);
    System.out.println("Total_Score : " + total_score);
    System.out.println("Average_Score : " + avg_score);
    System.out.println("Performance Level : " + performance);
    System.out.println("Attendance Level : " + attendance_performance);
  }
}