package lab10;

public class Problem8 {
    private int min(int n){
        int[] S = new int[n+1];
        return recurse(S, n);
    }

    private int recurse(int[] S, int n){
        int j =(int) Math.sqrt(n);
        if(j*j == n){
            S[n] = 1;
            return 1;
        }

        int min = n;

        for(int i=j; i>=1; i--){
            if(S[n - i*i] == 0){
                min = Math.min(min, recurse(S, n - i*i));
                S[n - i*i] = min;
            } else {
                min = Math.min(min, S[n - i*i]);
            }
        }
        S[n] = min+1;
        return S[n];
    }

    public static void main(String[] args){
        Problem8 prob = new Problem8();
        System.out.println(prob.min(17));
    }
}
