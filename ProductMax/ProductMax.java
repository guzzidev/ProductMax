package ProductMax;
//CHALLENGE: For a given input array of numbers, find the two that result in the largest product. The output should include the two numbers in the array along with their product.
//As an extra challenge, use an input of two arrays of numbers and find two numbers — one from each input array — that results in the largest product.
import static ProductMax.Numbers.numberingFirstArray;
import static ProductMax.Numbers.numberingSecondArray;

public class ProductMax {
    public static void main(String[] args) {
        GatheringNumbers.arrayNumbering();
        System.out.println(numberingFirstArray);
        System.out.println(numberingSecondArray);
        Product multiplier = new Product();
        multiplier.multiplyArray();
        // print the two numbers on the two different arrays that gave the highest product
        System.out.println(multiplier.fromFirstArray + ", " + multiplier.fromSecondArray);
    }
}