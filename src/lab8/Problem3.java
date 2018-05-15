package lab8;

public class Problem3 {
    private Boolean isPrime(int n){
        if(n <= 1) return true;
        int mid = n/2;
        for(int i=2; i<= mid; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Problem3 prob = new Problem3();
        System.out.println(prob.isPrime(83));
    }
}
