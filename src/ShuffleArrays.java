
import java.awt.datatransfer.DataFlavor;
import java.util.Arrays;

public class ShuffleArrays {
    static void main() {
        ShuffleTheArrays();
    }

    public static void ShuffleTheArrays(){
        int[] Array1 = {2, 5, 1, 3, 4, 7, 8, 1, 10 ,3};
        int borderIndex = Array1.length/2;
        System.out.println("Border index in array is: " + borderIndex + ". Value os 2nd array ast element is - " + Array1[borderIndex]);

        int[] NewArray = new int[Array1.length];

        for (int i=0; i<Array1.length; i++) {
            if (i%2 == 0){
                NewArray[i]=Array1[i/2];
            } else {
                NewArray[i]=Array1[i/2+borderIndex];
            }
            }
        System.out.println(Arrays.toString(NewArray));
    }
}

//Task 2: Shuffle the Array
//You are given an array nums containing 2n elements in the following format:
//[x1, x2, ..., xn, y1, y2, ..., yn]
//Return a new array in the following format:
//[x1, y1, x2, y2, ..., xn, yn]
//Example 1
//Input
//nums = {2, 5, 1, 3, 4, 7};
//Output
//{2, 3, 5, 4, 1, 7}
//ask 1: Check if Two String Arrays Represent the Same String
//Two string arrays can represent a single string when all their elements are joined together in order.
//Write a method that returns true if both arrays represent the same string, otherwise return false.
//Example 1
//Input
//word1 = {"ab", "c"};
//Explanation
//x = {2, 5, 1}
//y = {3, 4, 7}
//
//Result = {2, 3, 5, 4, 1, 7}
//Example 2
//Input
//nums = {1, 2, 3, 4, 4, 3, 2, 1};
//Output
//{1, 4, 2, 3, 3, 2, 4, 1}
//Example 3
//Input
//nums = {1, 1, 2, 2};
//Output
