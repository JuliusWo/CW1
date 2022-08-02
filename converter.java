import java.util.*;
import java.text.DecimalFormat;

public class converter {

        public static void main(String[] args) {

                double amount, miles, kilom, nautical;

                DecimalFormat f = new DecimalFormat("##.##");

                String units = args[0];
                amount = Integer.parseInt(args[1]);

                // For Conversion
                switch (units) {
                    case "miles" :
                        // For Mile Conversion
                        kilom  = amount * 1.61;
                        nautical = amount * 0.87;
                        System.out.println(amount + " Miles = " + f.format(kilom) + " Kilometers or " + f.format(nautical) + " Nautical Miles");
                        break;

                    case "kilometers" :
                        // For Kilometer Conversion
                        miles  = amount * 0.26;
                        nautical = amount * 0.54;
                        System.out.println(amount + " Kilometers = " + f.format(miles) + " Miles or " + f.format(nautical) + " Nautical Miles");
                        break;

                    case "nautical" :
                        // For Nautical Conversion
                        miles  = amount * 1.15;
                        kilom = amount * 18.5;
                        System.out.println(amount + " Nautical Miles = " + f.format(miles) + " Miles or " + f.format(kilom) + " Kilometers");
                        break;
                }

                System.out.println("Thank you for using the converter.");

        }
}
