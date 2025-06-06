public class Cardheko {
  public static void main(String[] args) {
    String brand = "Mahindra Thar";
    float ratings = 4.5f;
    float outoff = 1.4f;
    float price_from = 11.50f;
    float price_to = 17.62f;
    String description = "Mahindra Thar Specs & features";
    short engine_from = 1497;
    short engine_to = 2184;
    float power_from = 116.93f;
     float power_to = 150.19f;
     byte seating_capacity = 4;
     byte safety_rating = 4;
     short ground_clearance = 226;
     short torque_from = 300;
     short torque_to = 320;
     String drive_type = "4WD / RWD";
     System.out.println(brand);
     System.out.print(ratings);
     System.out.println("  " + outoff + "K Reviews");
     System.out.println("₹"+price_from + "-" + price_to + " Lakhs");
     System.out.println(description);
     System.out.println(engine_from + "cc" + "-" + engine_to + "cc");
     System.out.println(power_from + "-" + power_to + "bhp") ;
     System.out.println(seating_capacity);
     System.out.println(safety_rating + "star");
     System.out.println(ground_clearance + "mm");
     System.out.println(torque_from +"Nm" + "-" + torque_to + "Nm");
     System.out.println(drive_type);

  }
  
}
