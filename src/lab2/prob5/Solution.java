package lab2.prob5;

import java.util.*;

public class Solution {

    private List<Integer> removeDups(List<Integer> L){
        Map<Integer, Integer> M = new HashMap<>();
        for(int i=0; i<L.size(); i++){
            if(!M.containsKey(L.get(i))){
                M.put(L.get(i), 0);
            }
        }
        return new ArrayList<>(M.keySet());
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,3,4,5,5,5,7));
        System.out.println(new Solution().removeDups(list));
    }
}
