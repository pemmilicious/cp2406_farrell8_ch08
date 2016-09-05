/**
 * Created by Bradley on 5/09/2016.
 */

public class arraymethoddemo {

    public static void main(String [] args) {
        int[] numbers = {12, 23, 34, 45, 56, 67, 78, 89, 100, 112};
        int i;
        int limit = 12;
        for (i = 0; i < numbers.length; i++)
            System.out.println(numbers[i] + " ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.println(numbers[i] + " ");
        System.out.println();
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);

    }


    public static void displaySum(int[] numbers)
    {
        int total = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            total += numbers[i];
        }
        System.out.println("\nThe sum of all numbers is " + total);
    }
    public static void displayLessThan(int[] numbers, int limit)
    {
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] < limit)
                System.out.print(numbers[i] + " ");
        System.out.println("are less than the limit " + limit);

    }
    public static void displayHigherThanAverage(int[] numbers)
    {
        int sum = 0;
        double average;
        for(int i = 0; i < numbers.length; ++i)
            sum += numbers[i];
        average = sum * 1.0 / numbers.length;
        System.out.println("The average is " + average);
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] > average)
                System.out.print(numbers[i] + "  ");
        System.out.println("are greater than the average");
    }
}
