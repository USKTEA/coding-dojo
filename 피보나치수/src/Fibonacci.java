import java.util.Objects;

public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = calculateFibonacci(number);
    }

    private int calculateFibonacci(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return calculateFibonacci(number - 2)  + calculateFibonacci(number - 1);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Fibonacci fibonacci = (Fibonacci) object;

        return number == fibonacci.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public int number() {
        return number;
    }

    public int divideBy(int divider) {
        return this.number % divider;
    }
}
