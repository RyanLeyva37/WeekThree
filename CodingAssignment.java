package com.promineo.ryanleyva1.week3;

import java.util.Random;

public class CodingAssignment {
    static Random random = new Random();

    public static void main(String[] args){
        int[] exampleOne = new int [ ] { 3, 9, 23, 64, 2, 8, 28, 93 };
        int[] exampleTwo = new int [ ] { 3, 9, 23, 64, 2, 8, 28, 93, 27 };
        int[] exampleThree = new int [ ] { 3, 9, 23, 64, 2, 8, 28, 93 };
        String[] exampleFour = new String [ ] { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
        int[] nameLengths = new int[6];
        System.out.println ( "1:A " + processIntArray ( exampleOne ) );
        System.out.println ( "1:B : " + processIntArray ( exampleTwo ) );
        System.out.println ( "1:C : " + calcAverage( exampleThree ) );
        processStringArray ( exampleFour );
        System.out.println("3 : array[ array.length - 1 ]");
        System.out.println("4 : array[ 0 ]");

        for(int i = 0; i < exampleFour.length; i++){ // 5
            nameLengths[i] = exampleFour[i].length();
        }
        int total = 0;
        for(int i = 0 ; i < nameLengths.length; i++){
            total += nameLengths[i];
        }
        total = total / nameLengths.length;
        System.out.println("6: " + total);

        System.out.println( "7 : " + processString("Test", 5));

        System.out.println( "8 : " + createName("Ryan", "Leyva"));

        System.out.println("9 : " + isGreaterThenOneHundred( new int [ ] { 10, 20, 30, 40 } ) );
        System.out.println("9 : " + isGreaterThenOneHundred( new int [ ] { 10, 20, 30, 40, 50 } ) );
        System.out.println("10 : " + doubleAverage(new double [ ] { 10.3, 20.40, 30.53, 40, 22 } ) );
        System.out.println("11 : " + arrayCompare(new double [ ] { 10.3, 20.40, 30.53, 40, 22},
                                                  new double [ ] { 1.3, 2.40, 3.53, 4, 2 } ) );

        System.out.println("12 : " + willBuyDrink(true, 11));

        System.out.println("13 : " + getRandomInt(20));

    }

    static int getRandomInt(int cap){ // This method generates a random integer lower then the cap parameter.
        return random.nextInt(cap); // I created it because it would make the output more interesting
    }//Sadly because it would make it hard for my instructor to check my code I won't implement

    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){

        if(isHotOutside){
            return moneyInPocket > 10.50;
        }else{
            return false;
        }

    }

    static boolean arrayCompare(double[] array, double[] secondArray){
        double average = 0;
        for(int i = 0; i < array.length; i++){
            average+= array[i];
        }
        average = average / array.length;

        double averageTwo = 0;
        for(int i = 0; i < secondArray.length; i++){
            averageTwo+= secondArray[i];
        }
        averageTwo = averageTwo / array.length;

        return average > averageTwo;
    }

    static double doubleAverage(double[] doubles){
        double total = 0;
        for(int i = 0; i < doubles.length; i++){
            total += doubles[i];
        }
        total = total / doubles.length;
        return total;
    }

    static boolean isGreaterThenOneHundred(int[] array){ //9
        int solution = 0;
        for(int i = 0; i < array.length; i++){
            solution += array[i];
        }
        return solution > 100;
    }

    static String createName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static String processString(String word, int n){ // 7
        String solution = "";
        for(int i = 1; i <= n; i++){
            solution += word;
        }
        return solution;
    }

    static void processStringArray(String[] array){
        int total = 0;
        for(String s : array){
            total += s.length();
        }
        int average = total / array.length;
        System.out.println("2:A : " + average);
        String concat = "";
        for(String s : array){
            concat += s +" ";
        }

        System.out.println("2:B : " + concat);

    }

    static int processIntArray(int[] array){
        int solution = array[array.length - 1] - array[0]; // 3:  4: array[0]
        return solution;
    }

    static int calcAverage(int[] array){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        int secondSolution = total / array.length;
        return secondSolution;
    }

}
