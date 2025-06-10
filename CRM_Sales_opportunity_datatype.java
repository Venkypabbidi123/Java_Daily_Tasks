public class CRM_Sales_opportunity_datatype {
  public static void main(String[] args) {
    short opportunity_ID = 201;
    short customer_ID = 101;
    String opportunity_name = "Interiors Installation";
    String expected_close_date = "2024-06-10";
    float estimated_value = 75000.54f;
    String stage = "Proposal sent";
    String created_by = "venu";
    boolean is_converted = true;
    
    
    System.out.println("opportunity_ID : " + opportunity_ID);
    System.out.println("Customer_Id : " + customer_ID);
    System.out.println("opportunity_name : " + opportunity_name);
    System.out.println("Estimated_close_date : " + expected_close_date);
    System.out.println("Estimated value : " + estimated_value);
    System.out.println("Stage : " + stage);
    System.out.println("Created_By : " + created_by);
    System.out.println("Is_Converted : " + is_converted);
  }
}
