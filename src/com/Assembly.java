package com;

import java.util.Scanner;

public class Assembly {
    public static void main(String[] args) {
        double profit;
        String cat_company = " ";
        double cat_profit = 0;
        double taxOn_first_tax = 0;
        double total_Tax = 0;
        double untaxed_profits;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the profit made per month: ");
        profit = input.nextDouble();
        System.out.print("Enter the amount of any additional profit: ");
        double addOn_profit = input.nextDouble();


        if (profit <= 5000) {
            cat_profit = profit;
            cat_company = "Small Scale Business";
            System.out.println("This company is a small scale business.");

            double current_tax = small_Tax(3000, addOn_profit); //First 3000 tax and tax on any other profit
            taxOn_first_tax = second_Tax(current_tax);      //Taxing 2% on the first tax.
            untaxed_profits = cat_profit - 3000;    //Remainder of profit after first tax.
            total_Tax = current_tax + taxOn_first_tax;

            System.out.printf("The tax before refuse tax is calculated is GHs %.2f ", current_tax);
            System.out.println();
            System.out.printf("The refuse tax is GHs %.2f ", taxOn_first_tax);
            System.out.println();
            System.out.printf("The total tax is GHs %.2f", total_Tax);
        } else if (profit > 5000 && profit <= 10_000) {
            cat_profit = profit;
            cat_company = "Medium Scale Business";
            System.out.println("This company is a medium scale business.");

            double current_tax = medium_Tax(8000, addOn_profit);    //First 8000 tax & tax on any other profit.
            taxOn_first_tax = second_Tax(current_tax);      //Taxing 2% on the first tax.
            untaxed_profits = cat_profit - 8000;    //Remainder of profit after first tax.
            total_Tax = current_tax + taxOn_first_tax;

            System.out.printf("The tax before refuse tax is calculated is GHs %.2f", current_tax);
            System.out.println();
            System.out.printf("The refuse tax is GHs %.2f ", taxOn_first_tax);
            System.out.println();
            System.out.printf("The total tax is GHs %.2f ", total_Tax);
        } else if (profit > 10_000) {
            cat_profit = profit;
            cat_company = "Large Scale Business";
            System.out.println("This company is a large scale business.");

            double current_tax = large_Tax(15000, addOn_profit); // First 15000 tax and tax on any other profit
            taxOn_first_tax = second_Tax(current_tax);      //Taxing 2% on the first tax.
            untaxed_profits = cat_profit - 15_000;      //Remainder of profit after first tax.
            total_Tax = current_tax + taxOn_first_tax;      //

            System.out.printf("The tax before refuse tax is calculated is GHs %.2f ", current_tax);
            System.out.println();
            System.out.printf("The refuse tax is GHs %.2f ", taxOn_first_tax);
            System.out.println();
            System.out.printf("The total tax is GHs %.2f ", total_Tax);
        }
        /*double current_tax = first_Tax(cat_profit);
        taxOn_first_tax = second_Tax(current_tax);
        total_Tax = current_tax + taxOn_first_tax;
        System.out.println("The total tax is "+total_Tax + ".");*/

        //System.out.println("This company is a "+ cat_company + ".");
       /* System.out.println("The tax before refuse tax is calculated is "+ current_tax + ".");
        System.out.println("The refuse tax is "+ taxOn_first_tax + ".");*/

    }

    public static double small_Tax(double profit, double add_profit) {
        //profit = 3000;
        double first_tax = profit * 0.03;
        double add_tax = add_profit * 0.12;
        double total_small_tax = first_tax + add_tax;
        double res_first_tax = profit - 3000;
        return total_small_tax;
    }

    public static double medium_Tax(double profit, double add_profit) {
        //profit = 8000;
        double first_tax = profit * 0.05;
        double add_tax = add_profit * 0.12;
        double total_medium_tax = first_tax + add_tax;
        double res_first_tax = profit - 3000;
        return total_medium_tax;
    }

    public static double large_Tax(double profit, double add_profit) {
        //profit = 15_000;
        double first_tax = profit * 0.085;
        double add_tax = add_profit * 0.12;
        double total_large_tax = first_tax + add_tax;
        double res_first_tax = profit - 3000;
        return total_large_tax;
    }

    public static double second_Tax(double first_tax) {
        double res_second_tax = first_tax * 0.02;
        return res_second_tax;
    }
}
