package leetc;

public class IsPalindrome {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        } else if(x < 10){
            return true;
        }

        int originalValue = x;
        int inverted = 0;
        int mod = 0;

        while(x > 0) {
            mod = x % 10;
            inverted = inverted * 10 + mod;
            x = x / 10;
        }
        if(originalValue == inverted) {
            return true;
        } else {
            return false;
        }


    }
}
