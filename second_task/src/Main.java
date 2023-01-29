public class Main {
    public static void main(String[] args) {
        int n = 57;
        int dec = n / 10;
        int units = n % 10;
        int sum = dec + units;
        int multi = dec * units;
        System.out.println("The number of tens in the number: " + dec);
        System.out.println("The number of units in the number: " + units);
        System.out.println("The sum of the digits: " + sum);
        System.out.println("The multiplication: " + multi);

    }
}