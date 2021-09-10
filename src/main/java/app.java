/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        double weight = 0, height = 0, BMI;
        String output;

        while(weight == 0)
        {
            try
            {
                System.out.println("Enter your weight in pounds:");
                scan = new Scanner(System.in);
                weight = Double.parseDouble(scan.next());
            }
            catch(Exception e)
            {
                System.out.println("Enter a number!");
            }
        }

        while(height == 0)
        {
            try
            {
                System.out.println("Enter your height in inches:");
                scan = new Scanner(System.in);
                height = Double.parseDouble(scan.next());
            }
            catch(Exception e)
            {
                System.out.println("Enter a number!");
            }
        }

        BMI = (weight / (height * height)) * 703;

        if(BMI >= 18.5 && BMI <= 25)
        {
            output = String.format("Your BMI is %.2f. You are within the ideal weight range.", BMI);
        }
        else
        {
            output = String.format("Your BMI is %.2f. You are overweight. You should see your doctor.", BMI);
        }

        System.out.println(output);
    }
}