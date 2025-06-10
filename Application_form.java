public class Application_form{
  public static void main(String[] args) {
    String heading = "Application For College Admission Test";

    // STUDENT DETAILS

    String last_Name = "Reddy";
    String first_Name = "Lingampalli";
    String middle_Name = "Sumanth";
    String complete_address = "kadapa, Andhra Pradesh";
    String date_of_birth = "19-08-2002";
    char gender = 'M';
    long contact_number = 12345678910l;
    short graduation_year = 2017;
    float average = 88.35f;
    short last_school_year = 2016;
    boolean disability = false;

    // PARENT DETAILS

    String name = "SUbba Reddy";
    String occupation = "Farmer";
    String parent_address = "kadapa, Andra Pradesh";
    long parent_contact = 2134567899l;

    //PRINTING STUDENT DETAILS

    System.out.println(heading);
    System.out.println("Last_Name : " + last_Name);
    System.out.println("First_Name : " + first_Name);
    System.out.println("Middle_Name : " + middle_Name);
    System.out.println("Complete_Address : " + complete_address);
    System.out.println("Date_Of_Birth : " + date_of_birth);
    System.out.println("Gender : " + gender);
    System.out.println("Contact_Number : " + contact_number);
    System.out.println("Graduation_Year : " + graduation_year);
    System.out.println("Average : " + average);
    System.out.println("Last_School_Year : " + last_school_year);
    System.out.println("Disability / PWD : " + disability);

    // PRINTING PARENT DETAILS

    System.out.println("Parent_Name : " + name);
    System.out.println("Parent_Occupation : " + occupation);
    System.out.println("Parent_Address : " + parent_address);
    System.out.println("Parent_Contact : " + parent_contact);
  }
}