/**
 * Author :Khushi verma
 */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int month;
        Scanner in = new Scanner(System.in);
        System.out.println("To check your birthday months enter the number");
        month=in.nextInt();
        if(month<=12){
            switch (month){
                case 1:
                    System.out.println("January is your birthday month");
                    break;
                case 2:
                    System.out.println("February is your birthday month");
                    break;
                case 3:
                    System.out.println("March is your birthday month");
                    break;
                case 4:
                    System.out.println("April is your birthday month");
                    break;
                case 5:
                    System.out.println("May is your birthday month");
                    break;
                case 6:
                    System.out.println("June is your birthday month");
                    break;
                case 7:
                    System.out.println("July is your birthday month");
                    break;
                case 8:
                    System.out.println("August is your birthday month");
                    break;
                case 9:
                    System.out.println("September is your birthday month");
                    break;
                case 10:
                    System.out.println("October is your birthday month");
                    break;
                case 11:
                    System.out.println("November is your birthday month");
                    break;
                case 12:
                    System.out.println("December is your birthday month");
                    break;
            }
        }
        else{
            System.out.println("Oops! You are not from this planet!");
        }
    }

}
