package com.company;
import java.util.Scanner;

public class Main {

    static int Add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // total Income
        System.out.println("Enter Income: ");
        int monthyIncome = input.nextInt();

        System.out.print("CURRENCY LIST\nUSD, euro, Pound, zmk");
        System.out.println("\nWhat currency is your income: ");
        String currency = input.next().toLowerCase();

        switch (currency){
            case "usd":
                monthyIncome *= 17;
                System.out.printf("%s", monthyIncome);
                break;

            case "euro":
                monthyIncome *= 18;
                break;
            case "pound":
                monthyIncome *= 21;
                break;
            default:
                System.out.println("Your Income is in kwacha");
        }

        int salary = monthyIncome * 12;
        salary *= 0.4;

        for (int years = 0; years < 5; years++){
            String IsRich = (salary > 500_000 && years <= 2) ? "You are nearly a millionaire" : "Work Harder";
            System.out.println(salary);
            System.out.println(IsRich);
            salary *= 2;

        }
    }
}
