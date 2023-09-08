public class PrimeSpecified {
    public static void main(String[] args) {
        int start=4;
        int end=50;
        int count=countPrimeNum(start,end);
        System.out.println("Number of prime numbers between "+start+" and "+end+" are "+count);
    }
    public static int countPrimeNum(int start,int end){
        int count=0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
