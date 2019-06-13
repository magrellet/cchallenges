package ctci.c1;

public class IsUnique {

    public static void main(String[] args) {

    }

    public static boolean isUniqueInString(String word) {

        boolean isUnique = true;
        char[] stringArray = word.toCharArray();
        for (int i =0; i <= stringArray.length-1; i++){
            for(int j =i+1; j <= stringArray.length-1; j++){
                if(stringArray[i] == stringArray[j]){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                break;
            }
        }
        return isUnique;
    }


}
