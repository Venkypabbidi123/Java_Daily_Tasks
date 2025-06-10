public class CRM_Interaction_datatype {
  public static void main(String[] args) {
    short interaction_ID = 201;
    short customer_ID = 101;
    String interaction_type = "Phone Call";
    String interaction_date = "2024-06-10";
    String notes = "Discussed interiors options and pricing";
    String handled_by = "venu";
    byte duration = 30;
    boolean follow_up_required = true;
    
    
    System.out.println("interaction_ID : " + interaction_ID);
    System.out.println("Customer_Id : " + customer_ID);
    System.out.println("Interaction_type : " + interaction_type);
    System.out.println("Interaction_date : " + interaction_date);
    System.out.println("Notes : " + notes);
    System.out.println("handled_By : " + handled_by);
    System.out.println("Duration (In Minutes) : " + duration + "mins");
    System.out.println("Follow_up_required : " + follow_up_required);
  }
}
