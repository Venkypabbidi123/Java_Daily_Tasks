public class CRm_Sales_lead_datatype {
  public static void main(String[] args) {
    short lead_ID = 201;
    short customer_ID = 101;
    String lead_source = "website";
    String lead_status = "New";
    String assigned_to = "Rahul";
    long contact_number = 9876543210l;
    double budget = 250000.34;
    boolean is_qualified = true;
    String created_date = "2024-06-10";
    
    System.out.println("Lead_ID : " + lead_ID);
    System.out.println("Customer_Id : " + customer_ID);
    System.out.println("Lead_Source : " + lead_source);
    System.out.println("Lead_status : " + lead_status);
    System.out.println("Assigned_To : " + assigned_to);
    System.out.println("Contact_Number : " + contact_number);
    System.out.println("Budget : " + budget);
    System.out.println("IS_Qualified : " + is_qualified);
    System.out.println("Crated_Date : " + created_date);
  }
  
}
