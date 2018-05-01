package lab1.prob2;

public class Solution {

    private int calculateGCD(int m, int n){
        for(int i= (m>n) ? n : m; i>1; i--){
            if(m%i == 0 && n%i == 0){
                return i;
            }
        }
        return 1;
    }


    public static void main(String[] args){
        System.out.println(new Solution().calculateGCD(12, 20));
    }
}
