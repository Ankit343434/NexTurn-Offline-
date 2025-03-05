public class MathFunction {
    public static void main(String[] args) {
        double x = -5.7;
        double a = 10, b = 20;

        // Basic Math Operations
        System.out.println("Absolute value of x: " + Math.abs(x)); // |x|
        System.out.println("Maximum of a and b: " + Math.max(a, b)); // Max of a, b
        System.out.println("Minimum of a and b: " + Math.min(a, b)); // Min of a, b
        System.out.println("Square root of 25: " + Math.sqrt(25)); // √25
        System.out.println("Cube root of 27: " + Math.cbrt(27)); // ∛27
        System.out.println("2 raised to power 3: " + Math.pow(2, 3)); // 2³

        // Rounding Methods
        double y = 4.6;
        System.out.println("Ceiling of y: " + Math.ceil(y)); // Rounds up
        System.out.println("Floor of y: " + Math.floor(y)); // Rounds down
        System.out.println("Round y: " + Math.round(y)); // Rounds to nearest integer

        // Trigonometric Functions (Input in Radians)
        double angle = Math.PI / 6; // 30 degrees in radians
        System.out.println("sin(30°): " + Math.sin(angle)); // sin(π/6)
        System.out.println("cos(30°): " + Math.cos(angle)); // cos(π/6)
        System.out.println("tan(30°): " + Math.tan(angle)); // tan(π/6)
        System.out.println("asin(0.5): " + Math.asin(0.5)); // arcsin(0.5)
        System.out.println("acos(0.5): " + Math.acos(0.5)); // arccos(0.5)
        System.out.println("atan(1): " + Math.atan(1)); // arctan(1)

        // Logarithm and Exponential Functions
        System.out.println("e^2: " + Math.exp(2)); // e²
        System.out.println("ln(10): " + Math.log(10)); // Natural log of 10
        System.out.println("log10(100): " + Math.log10(100)); // Log base 10 of 100

        // Random Number Generation
        System.out.println("Random number (0 to 1): " + Math.random()); // Generates random number

        // Constants
        System.out.println("Value of PI: " + Math.PI); // π
        System.out.println("Value of E: " + Math.E); // Euler’s number
    }
}
