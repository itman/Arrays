import org.w3c.dom.ls.LSOutput;

public class Check2Arrays {
    static void main() {
        checkingArrays();
    }

    static void checkingArrays() {
        String[] Array1 = {"ab","c","mazda","miata","mer","cedes"};
        String[] Array2 = {"a","bc","maz","d","a","miata","mercedes"};

        String A = "";
        String B = "";


        for (int i=0; i<Array1.length;i++){
            A = A + Array1[i];
            System.out.println("Step number " + i + ". A = "+ A);

        }

        for (int k=0; k<Array2.length;k++){
            B = B + Array2[k];
        }

        System.out.println("My first string is: " + A);
        System.out.println("My second string is: " + B);


//s        String B = Array2[0] + Array2[1];

        if (A.equals(B)) {
            System.out.println("true - Strings are equal");
        } else {
            System.out.println("false - Strings are differnet");
        }
//
//        System.out.println(A);
//        System.out.println(B);


//
//        int lengthArray1 = Array1.length;
//        int lengthArray2 = Array2.length;
//        String[] Array1result;

//        for (int i=0; i< lengthArray1; i++){
//            Array1result = Array1result.substring(0, Array1result.length - 1) + Array1[i];
//        }
//        System.out.println("My first string is : " + Array1result);


    }
}
//ask 1: Check if Two String Arrays Represent the Same String
//Two string arrays can represent a single string when all their elements are joined together in order.
//Write a method that returns true if both arrays represent the same string, otherwise return false.
//Example 1
//Input
//word1 = {"ab", "c"};
//word2 = {"a", "bc"};
//Output
//true
//Explanation
//word1 → "ab" + "c"  = "abc"
//word2 → "a" + "bc"  = "abc"
//Both arrays represent the same string.
//Example 2
//Input