public class PowerOfTwo {

    public boolean isPowerOfTwo(int number) {
        boolean bool = false;
        // My version:
        // int count = 0;
        // if(number > 1)
        // while(number != 0){
        // count = count + (number & 1);
        // number = number >> 1;
        // }

        // if(count == 1)
        // bool = true;

        // Enhanced version:
        if (number > 1)
            return (number & (number - 1)) == 0;

        return bool;
    }
}
