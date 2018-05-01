package lab1.prob4;

import java.util.*;

public class Solution {
    private Boolean subsetsum(List<Integer> X, Integer K){
        if(K == 0){
            return true;
        } else if(X.size() == 0){
            return false;
        }

        for(Integer i : X){
            if(i <= K){
                if(subsetsum(X.subList(0, X.size()-2), K-i)){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7));
        System.out.println(new Solution().subsetsum(list, 10));
    }
}
