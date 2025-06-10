public class CRM_Support_Ticket_datatype {
  public static void main(String[] args) {
    short ticket_ID = 201;
    short customer_ID = 101;
    String issue_type = "Installation Dealy";
    String description = "The installation team did not arrive on the time";
    String created_date = "2024-06-19";
    boolean is_resolved = false;
    String priority = "High";
    String assigned_to = "veeru";
    
    
    System.out.println("Ticket_ID : " + ticket_ID);
    System.out.println("Customer_Id : " + customer_ID);
    System.out.println("Issue_Type : " + issue_type);
    System.out.println("Created_date : " + created_date);
    System.out.println("Description : " + description);
    System.out.println("IS_Resolved : " + is_resolved);
    System.out.println("Priority : " + priority);
    System.out.println("Assigned_To : " + assigned_to);
  }
  
}
