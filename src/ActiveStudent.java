public class ActiveStudent {
    static void main() {
//        int[][] scores = {
//                {4, 6, 3},
//                {8, 2, 5},
//                {3, 3, 3}
//        };
        activeStudent();
    }

    static void activeStudent() {
        int[][] scores = {
                {4, 6, 3},
                {8, 2, 5},
                {3, 3, 3},
                {3, 3, 3},
                {3, 13, 3},
                {3, 32, 3},
                {3, 3, 3}

        };

        int k=0;
        int oldsum = 0;
        int max =0;
        int indexmax=0;




        for (int[] i: scores){

            int j = 0;
            int sum = 0;

            while (j<i.length){
                sum = sum + i[j];
                j++;
            }

            if (sum>oldsum){
                oldsum = sum;
                max=sum;
                indexmax=k;
            }
            k++;

        }
        System.out.println("Max sum is: "+max + " and index of max is: " + indexmax);

    }
}

//Task 4: Find the Most Active Student
//You are given a 2D integer array scores.
//scores[i][j]
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
