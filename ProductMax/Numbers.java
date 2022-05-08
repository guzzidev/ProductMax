package ProductMax;

import java.util.ArrayList;
import java.util.Scanner;


public class Numbers {

    public static ArrayList<Float> numberingFirstArray = new ArrayList<>();
    public static ArrayList<Float> numberingSecondArray = new ArrayList<>();
    public static ArrayList<Float> getNumbersForFirstArray () {
        System.out.print("enter your first set number here :");

        Scanner numbers1 = new Scanner(System.in);
        float k = numbers1.nextFloat();
        numberingFirstArray.add(k);
        return numberingFirstArray;
    }
    public static ArrayList<Float> getNumbersForSecondArray () {
        System.out.print("enter your second set number here :");

        Scanner numbers2 = new Scanner(System.in);
        float k2 = numbers2.nextFloat();
        numberingSecondArray.add(k2);
        return numberingSecondArray;
    }
}
