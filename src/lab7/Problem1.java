package lab7;

import java.util.Stack;

public class Problem1 {

    public String mirror(String sentence){
        Stack<Character> wordStack = new Stack();
        String result = "";

        for(int i=0; i< sentence.length(); i++){
            char cha = sentence.charAt(i);
            if(cha == ' '){
                while(!wordStack.isEmpty()) {
                    result += wordStack.pop();
                }
                result += " ";
            } else {
                wordStack.push(cha);
            }
        }

        while(!wordStack.isEmpty()) {
            result += wordStack.pop();
        }

        return result;
    }

    public static void main(String[] args){
        Problem1 p = new Problem1();
        System.out.println(p.mirror("We are the champions! my friend"));
    }
}
