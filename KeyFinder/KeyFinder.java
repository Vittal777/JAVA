public class KeyFinder {
    public static void main(String[] args) {
        int input1 = 1234;
        int input2 = 5678;
        int input3 = 9012;
        
        int key = findKey(input1, input2, input3);
        
        System.out.println("The key is: " + key);
    }
    
    public static int findKey(int input1, int input2, int input3) {
        // Finding the largest digits
        int largestDigit1 = findLargestDigit(input1);
        int largestDigit2 = findLargestDigit(input2);
        int largestDigit3 = findLargestDigit(input3);
        
        // Finding the smallest digits
        int smallestDigit1 = findSmallestDigit(input1);
        int smallestDigit2 = findSmallestDigit(input2);
        int smallestDigit3 = findSmallestDigit(input3);
        
        // Calculating the key
        int sumOfLargestDigits = largestDigit1 + largestDigit2 + largestDigit3;
        int sumOfSmallestDigits = smallestDigit1 + smallestDigit2 + smallestDigit3;
        
        int key = sumOfLargestDigits - sumOfSmallestDigits;
        
        return key;
    }
    
    private static int findLargestDigit(int number) {
        int maxDigit = 0; 
        while (number > 0) {
            int digit = number % 10;
            maxDigit = Math.max(maxDigit, digit);
            number /= 10;
        }
        
        return maxDigit;
    }
    
    private static int findSmallestDigit(int number) {
        int minDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            minDigit = Math.min(minDigit, digit);
            number /= 10;
        }
        
        return minDigit;
    }
}
