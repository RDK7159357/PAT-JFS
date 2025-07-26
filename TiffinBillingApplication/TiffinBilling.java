package TiffinBillingApplication;

import java.util.*;

public class TiffinBilling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double  totalAmt = 0.0;
        String yorn ="";
        String bill ="";
        do{
            System.out.println("Enter Idly/Dosa/Poori/Upma/Vada");
            String tiffin = sc.next();
            System.out.println("How many plates");
            int noOfPlates = sc.nextInt();
            switch(tiffin){
                case "Idly":
                    totalAmt += 20.00 * noOfPlates;
                    bill += tiffin + "\t" +20.00 +"\t"+noOfPlates +"\t" + (20.00 * noOfPlates) + "\n"; 
                    break;

                case "Dosa":
                    totalAmt += 30.00 * noOfPlates;
                    bill += tiffin + "\t" +30.00 +"\t"+ noOfPlates +"\t" + (30.00 * noOfPlates) + "\n";
                    break;

                case "Poori":
                    totalAmt += 35.00 * noOfPlates;
                    bill += tiffin + "\t" +35.00 +"\t"+ noOfPlates +"\t" + (35.00 * noOfPlates) + "\n";
                    break;
                case "Upma":
                    totalAmt += 25.00 * noOfPlates;
                    bill += tiffin + "\t" +25.00 +"\t"+ noOfPlates +"\t" + (25.00 * noOfPlates) + "\n";
                    break;
                case "Vada":
                    totalAmt += 25.00 * noOfPlates;
                    bill += tiffin + "\t" +25.00 +"\t"+ noOfPlates +"\t" + (25.00 * noOfPlates) + "\n";
                    break;
                default:
                    System.out.println("Wrong tiffin entered");
                    break;
            }
            System.out.println("Do you want to continue? (Y/N)");
            sc.nextLine();
            yorn = sc.nextLine();

            }while(yorn.equalsIgnoreCase("Y"));

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Item\tPrice\tQty\tUnit Total");
            System.out.println("--------------------------------");
            System.out.println(bill);
            System.out.println("--------------------------------");
            System.out.println("\tTotal Amt: "+ totalAmt);
            System.out.println("--------------------------------");
            sc.close();






        }
    }

