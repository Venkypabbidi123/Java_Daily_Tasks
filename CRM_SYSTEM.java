public class CRM_SYSTEM {
  public static void main(String[] args) {

    // Customer

    int customer_id = 101;
    String customer_name = "Rajesh";
    double total_purchase = 7500;
    int interaction_count = 5;

     // Sales Lead

     int lead_ID = 501;
     double lead_Budget = 8000;
     boolean is_Contacted = true;

     //Sales_Opportunity

     double opportunity_value = 5500;
     boolean is_Closed = true;

     //operations
     int number_of_purchases = 5;
     double avg_purchase_value = (total_purchase / number_of_purchases);
     boolean Sales_Opportunity_is_high = opportunity_value >5000;
     boolean should_priortized = (lead_Budget > 3000) &&(is_Contacted);
     int new_interaction = 1;
     new_interaction++;
     interaction_count += new_interaction;

     //output

     System.out.println("customer_id : " + customer_id);
    System.out.println("customer_name : " + customer_name);
    System.out.println("Total_Purchase : " + total_purchase );
    System.out.println("Lead_ID : " + lead_ID);
    System.out.println("Lead_Budget : " + lead_Budget);
    System.out.println("IS_CONTACTED : " + is_Contacted);
    System.out.println("Average_Purchase : " + avg_purchase_value);
    System.out.println("Sales_Opportunity_is_high : " + Sales_Opportunity_is_high);
    System.out.println("should_priortized : " + should_priortized);
    System.out.println("Interaction_count : " + interaction_count);
  }
}
