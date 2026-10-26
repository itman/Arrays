public class FinalValue {
    static void main() {
        operations();
    }

    static void operations() {
        int X=0;
        String[] operations = {"X++", "++X","X--","X++"};
        int result = 0;

        for (int i=0; i<operations.length; i++){
            switch (operations[i]){
                case "X++","++X" -> X++;
                case  "X--","--X"-> X--;
//                case "X++" -> X++;
//                case "++X" -> X++;
//                case "X--" -> X--;
//                case "--X" -> X--;
                default -> System.out.println("Incorrect operation");
            }
        }
        System.out.println("result of output is: " + X);
    }
}
//Task 3: Final Value of Variable After Operations
//There is a programming language with only one variable X and four possible operations:
//++X  → Increment X by 1
//X++  → Increment X by 1
//--X  → Decrement X by 1
//X--  → Decrement X by 1
//Initially, the value of X is:
//X = 0;
//You are given an array of strings operations, where each element represents one operation.
//Return the final value of X after performing all operations.
//Example 1
//Input
//String[] operations = {"--X", "X++", "X++"};
//Output
//1
//Explanation
//Initially X = 0
//
//"--X" → X = -1
//"X++" → X = 0
//"X++" → X = 1
//
//Final value = 1
//Example 2
////Input
////
//String[] operations = {"++X", "++X", "X++"};
//Output
//3
//Example 3
//Input
//String[] operations = {"X++", "++X", "--X", "X--"};
//Output
//0
//Optional Challenge
//Task 4: Find the Most Active Student
//You are given a 2D integer array scores.
//        scores[i][j]
//represents the number of exercises completed by the i-th student during the j-th week.
//Return the total number of exercises completed by the most active student.
//A student's activity score is the sum of all exercises completed across all weeks.
//Requirements
//✅ Use an enhanced for-each loop to iterate through students.
//✅ Use a while loop to calculate each student's total score.
//❌ Do not use:
//Streams
//Collections
//Arrays.stream()
//Other utility methods that solve the problem automatically
//Example
//Input
//int[][] scores = {
//    {4, 6, 3},
//    {8, 2, 5},
//    {3, 3, 3}
//};
//Output
//15
//Explanation
//Student 1 → 4 + 6 + 3 = 13
//Student 2 → 8 + 2 + 5 = 15
//Student 3 → 3 + 3 + 3 = 9
//The most active student completed 15 exercises.