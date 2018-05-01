package lab1.prob3;

import java.util.*;

public class Solution {

    private List<Set> powerSet(List<Integer> X){
        List<Set> P = new ArrayList<>();
        Set S = new HashSet<Integer>();
        P.add(S);
        while(!X.isEmpty()){
            int f = X.get(0);
            X.remove(0);
            int size = P.size();
            for(int i=0; i< size; i++){
                Set T = new HashSet(P.get(i));
                T.add(f);
                P.add(T);
            }
        }
        return P;
    }

    private Set subsetsum(List<Integer> X, Integer K){
        List<Set> powerSets = powerSet(X);
        for(Set s : powerSets){
            List<Integer> subset = new ArrayList<>(s);
            int sum = 0;
            for(Integer val : subset){
                sum += val;
            }
            if(sum == K){
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7));
        System.out.println(new Solution().subsetsum(list, 40));
    }
}
