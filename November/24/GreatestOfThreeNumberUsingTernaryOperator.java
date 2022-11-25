public class GreatestOfThreeNumberUsingTernaryOperator {
    public static void main(String[] args) {
        // Value or Variable declaration
        int a = 10, b = 25, c = 15, max;
 
        // Maximum among a, b, c
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
 
        // Print the largest number
        System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
    }
}
