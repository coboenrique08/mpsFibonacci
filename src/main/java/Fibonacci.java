public class Fibonacci {

    /**
     * Method that calculate the Fibonacci number of a given value
     * @param value
     * @return fibonacci
     */
    public int compute(int value) {
        int fibonacci;

        if (value < 0) {
            throw new RuntimeException("Fibonacci only works with positive values. Given value: " + value);
        }

        if(value == 0) {
            fibonacci = 0;
        } else if (value == 1) {
            fibonacci = 1;
        } else {
            fibonacci = compute(value - 1) + compute(value - 2);
        }

        return fibonacci;
    }

}
