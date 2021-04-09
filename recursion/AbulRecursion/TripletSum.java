package recursion.AbulRecursion;

class Main
{
    // Naive recursive function to check if triplet exists in an array
    // with the given sum
    public static boolean tripletExists(int[] A, int n, int sum, int count)
    {
        // if triplet has the desired sum, return true
        if (count == 3 && sum == 0) {
            return true;
        }
 
        // return false if the sum is not possible with the current configuration
        if (count == 3 || n == 0 || sum < 0) {
            return false;
        }
 
        // recur with including and excluding the current element
        return tripletExists(A, n - 1, sum - A[n - 1], count + 1) ||
                        tripletExists(A, n - 1, sum, count);
    }
 
    public static void main(String[] args)
    {
        int[] A = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int sum = 6;
 
        if (tripletExists(A, A.length, sum, 0)) {
            System.out.print("Triplet exists");
        }
        else {
            System.out.print("Triplet doesn't exist");
        }
    }
}