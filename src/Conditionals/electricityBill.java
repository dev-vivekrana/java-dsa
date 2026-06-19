package Conditionals;

import java.util.Scanner;

public class electricityBill {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units ");
        int units = sc.nextInt();
        double rate = 0;
        double totalAmount = 0;
        int newUnits ;
        if(units >0){
            if(units<=100){
                rate = 4.2;
                totalAmount = units * rate;
                System.out.println(totalAmount + "bill with rate 4.2");
            }
                if(units>100 && units<=200){
                    newUnits = units-100;
                    rate = 6;
                    totalAmount = (rate*newUnits) + 100 * 4.2;

                }
            if(units>200 && units<=400){
                newUnits = units-200;
                rate = 8;
                totalAmount = (rate*newUnits) + 100 * 4.2 + 100 * 6;
            }
            if(units>400){
                newUnits = units-400;
                rate = 13;
                totalAmount = (rate*newUnits) + 100 * 4.2 + 100 * 6 + 200 * 8;
            }
        }

        System.out.println(totalAmount);



    }
}
