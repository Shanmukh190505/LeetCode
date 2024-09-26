class Solution {
    public boolean checkPerfectNumber(int num) {
        // Perfect number should be greater than 1
        if (num <= 1) {
            return false;
        }
        
        int sum = 1; // Start sum with 1, because 1 is a divisor of any number
        // Find divisors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // Add both the divisor and its complementary divisor
                sum += i; // `i` is a divisor
                if (i != num / i) {
                    sum += num / i; // Add complementary divisor
                }
            }
        }
        
        // Check if the sum of divisors equals the original number
        return sum == num;
    }
}
