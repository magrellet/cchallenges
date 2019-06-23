package hrank.amonthofcoding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Check if a word is palindrome using queue and stack
* */

public class QueuesAndStacks {
    public Stack<Character> stacky = new Stack<>();
    public Queue<Character> queuey = new LinkedList<>();

    public void pushCharacter(char ch){
        stacky.push(ch);
    }

    public void enqueueCharacter(char ch){
        queuey.add(ch);
    }

    public char popCharacter(){
        return stacky.pop();
    }

    public char dequeueCharacter(){
        return queuey.remove();

    }

    public static void main(String[] args) {
        String first="menem";
        String second="meme";

        checkPalindrome(first);
        checkPalindrome(second);

    }

    public static void checkPalindrome(String input) {
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks qs = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            qs.pushCharacter(c);
            qs.enqueueCharacter(c);
        }



        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (qs.popCharacter() != qs.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ));
    }

}