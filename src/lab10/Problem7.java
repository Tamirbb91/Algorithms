package lab10;

public class Problem7 {
    private int maxSequence(String a, String b){
        int[][] maxSeq = new int[a.length()][b.length()];
        for(int i=0; i< a.length(); i++){
            for(int j=0; j< b.length(); j++){
                int max = 0;
                if(a.charAt(i) == b.charAt(j)){
                    if(i >= 1 && j >= 1){
                        max = maxSeq[i-1][j-1];
                    }
                    max++;
                } else {
                    if(i >= 1){
                        max = Math.max(maxSeq[i-1][j], max);
                    }

                    if(j >= 1){
                        max = Math.max(maxSeq[i][j-1], max);
                    }

                    if(max > 1 && (j == 0 || i == 0)){
                        max = 1;
                    }
                }

                maxSeq[i][j] = max;
            }
        }
        return maxSeq[a.length()-1][b.length()-1];
    }

    public static void main(String[] args){
        Problem7 prob = new Problem7();
        System.out.println(prob.maxSequence("AGGTAB", "GXTGXAYB"));
    }
}
