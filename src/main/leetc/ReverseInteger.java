package leetc;

public class ReverseInteger {
    public int reverse(int x) {
        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE || x ==0){
            return 0;
        }
        long result = 0;
        int reminder = 0;
        while(x != 0){
            reminder = x % 10;
            result = result * 10 + x % 10;
            if(result >= (Integer.MAX_VALUE-1) || result < (Integer.MIN_VALUE)){
                return 0;
            }
            x = x /10;
        }
        return (int)result;
    }
}
