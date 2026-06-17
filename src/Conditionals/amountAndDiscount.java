package Conditionals;

import java.util.Scanner;

public class amountAndDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        int discount=0;
        if(amount>0 && amount <=5000){
            discount = 0;
//            System.out.println(amount);
        }
        else if(amount>5000 && amount <=7000){
            discount = 5;
//            discount = (int) (amount*0.05);
//            amount -= discount;
//            System.out.println(amount);
        }
        else if(amount>7000 && amount <=9000){
            discount = 10;
//            discount = (int) (amount*0.1);
//            amount -= discount;
//            System.out.println(amount);
        }else if(amount>9000){
            discount = 20;
//            discount = (int) (amount*0.2);
//            amount -= discount;
//            System.out.println(amount);
        }
        int disamount = (amount *discount)/100;
        System.out.println(amount-disamount);

    }
}
