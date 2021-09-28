/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 31 heartRate class File
 *  Copyright 2021 Celina Alzenor
 */

package ex31;

public class heartRate
{
    private final int RHR;
    private final int age;

    //constructor
    public heartRate(int RHR, int age)
    {
        this.RHR = RHR;
        this.age = age;
    }

    //calculate target heart rate based on the intensity, age, and resting heart rate
    public int karvHR()
    {
        int sum = 0;

        System.out.printf("\nResting Pulse: %d \t \t \t Age: %d\n\n", this.RHR, this.age);

        //printing header for table
        System.out.print("Intensity\t| Rate\n");
        System.out.print("____________|________\n");

        /*calculates the target heart rate for each intensity
           each time the loop runs, the intensity increased by 5 until it reaches
           95. Prints the intensity and the corresponding heart rate
         */
        for(int intensity = 55; intensity <= 95; intensity +=5 ) {
            float THR = (float) (((220 - this.age) - this.RHR) * (intensity / 100.0) + this.RHR);
            sum += (int) THR; //sums up all the target heart rates for testing purposes

            System.out.printf("%d%s\t\t\t| %2d bpm\n", intensity, "%", (int) THR);

        }
        //returns the average target heart rate for testing purposes
        return sum/9;
    }

}
