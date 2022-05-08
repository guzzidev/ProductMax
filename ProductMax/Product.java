package ProductMax;

import static ProductMax.Numbers.numberingFirstArray;
import static ProductMax.Numbers.numberingSecondArray;

public class Product {
    float fromFirstArray = 0;
    float fromSecondArray = 0;
    float result = 0;

    public void multiplyArray() {
        // multiply first and second array
        for (int X = 0; X < numberingFirstArray.size(); X++) {
            for (int Y = 0; Y < numberingSecondArray.size(); Y++) {
                float result1 = (numberingFirstArray.get(X) * numberingSecondArray.get(Y));
                // capture the two numbers that gave the largest product
                if (result < result1) {
                    result = result1;
                    fromFirstArray = numberingFirstArray.get(X);
                    fromSecondArray = numberingSecondArray.get(Y);
                }
            }
        }
    }
}