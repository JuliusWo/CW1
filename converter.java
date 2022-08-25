
import java.util.*;
import java.text.DecimalFormat;


public class converter {

  public static double MILES, KILOM,  NAUTICAL;
  
  static int measure(String Amount, String units) {
          /* Return value : 
             0 - Unit and value to convert are ok
             1 - Unit is not ok
             2- Value to convert is not ok
             3 - both are not ok
             */
            // For Conversion
            double amount, miles, kilom, nautical;
            DecimalFormat f = new DecimalFormat("##.##");
     
            boolean ValueisNumeric = isNumeric(Amount);
  
            if(!ValueisNumeric){
                System.out.println("The value to convert is not a numerical value! ");
                return 2;}
    
            amount = Integer.parseInt(Amount);
            switch (units) {
                    case "miles" :
                        // For Mile Conversion
                        kilom  = amount * 1.61;
                        nautical = amount * 0.87;
                        // Updating :
                        KILOM = kilom;
                        NAUTICAL = nautical;
                        System.out.println(amount + " Miles = " + f.format(kilom) + " Kilometers or " + f.format(nautical) + " Nautical Miles");
                        break;

                    case "kilometers" :
                        // For Kilometer Conversion
                        miles  = amount * 0.26;
                        nautical = amount * 0.54;
                
                        // Updating :
                        NAUTICAL = nautical;
                        MILES = miles;
                
                        System.out.println(amount + " Kilometers = " + f.format(miles) + " Miles or " + f.format(nautical) + " Nautical Miles");
                        break;

                    case "nautical" :
                        // For Nautical Conversion
                        miles  = amount * 1.15;
                        kilom = amount * 18.5;
                
                        // Updating :
                        KILOM = kilom;
                        MILES = miles;
                        System.out.println(amount + " Nautical Miles = " + f.format(miles) + " Miles or " + f.format(kilom) + " Kilometers");
                        break;
                    default :
                        System.out.println("The unit is not correct ");
                        return 1;
                        
                }
            return 0;
    }
    
        public static boolean isNumeric(String string) {
          String regex = "[0-9]+[\\.]?[0-9]*";
          return string.matches(regex);
      }
  
  
        public static void main(String[] args) {       
                    int val = measure(args[1],  args[0]);
                     System.out.println("Thank you for using the converter.");

        }
}
