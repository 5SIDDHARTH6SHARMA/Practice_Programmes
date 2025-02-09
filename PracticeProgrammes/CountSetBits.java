public class CountSetBits {

    private int count = 0;

    public void countSetBits(int number) {
        while (number != 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number = number >> 1;
        }

        System.out.println("The number of Set bits in the given number are: " + count);
    }
}
