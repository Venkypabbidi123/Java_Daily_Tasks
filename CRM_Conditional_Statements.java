public class CRM_Conditional_Statements {
  public static void main(String[] args) {
    int customer_ID = 101;
    String customer_name = "Nagarjuna";
    boolean isPremium = true;
    int years_of_partnership = 5;
    String deal_Stage = "Closed";
    double deal_value = 50000.00;
    double base_discount = 0;
    if (isPremium){
      base_discount += 0.1;
    }
    else if (years_of_partnership >= 3){
      base_discount += 0.05;
    }
    else{
      base_discount += 0;
    }

double final_base_dicount =  base_discount*100;

double extra_discount = 0;
    switch (deal_Stage){
      case "Proposal":
          extra_discount += 0.02;
          break;
      case "Negotiation":
          extra_discount += 0.03;
          break;
      case "Closed" :
          extra_discount += 0.05;
          break;
      default :
          extra_discount += 0;
          break;
    }

double final_extra_discount = extra_discount*100;
double final_discount = ((base_discount + extra_discount) * 100);
double discounted_deal_value = deal_value - (deal_value * final_discount) / 100;

System.out.println("Customer_ID : " + customer_ID);
System.out.println("Customer_Name : " + customer_name);
System.out.println("IS a Premium customer : " + isPremium);
System.out.println("Years_of_partnership : " + years_of_partnership);
System.out.println("Base Discount : " + final_base_dicount + "%");
System.out.println("Extra Duscount : " + final_extra_discount + "%");
System.out.println("Totl Discount : " + final_discount + "%");
System.out.println("Final Deal Value : " + discounted_deal_value);

  } 
}
