package ProductMax;

import java.util.Scanner;

import static ProductMax.Numbers.getNumbersForFirstArray;
import static ProductMax.Numbers.getNumbersForSecondArray;

public class GatheringNumbers {

    private static String condition;

    public static void arrayNumbering() {
        getNumbersForFirstArray();
        getCondition();
        do {
            getNumbersForFirstArray();
            getCondition();
        }
        while (condition.equalsIgnoreCase("Yes"));
        getNumbersForSecondArray();
        getCondition();
        do {
            getNumbersForSecondArray();
            getCondition();
        }
        while (condition.equalsIgnoreCase("Yes"));
    }
    public static String getCondition(){
        System.out.println("Do you want to add another number? type Yes or No :");
        Scanner looping = new Scanner(System.in);
        condition = looping.nextLine();
        return condition;
    }
}
