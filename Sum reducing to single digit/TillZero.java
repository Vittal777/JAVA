class TillZero{
public static void main(String[] args){
int n=63451;
int sum=0;
while(n>0){
sum+=n%10;
n/=10;
if(n==0 && sum>9){
n=sum;
sum=0;
}
}
System.out.println("Sum after it has been reduced to single digit is "+sum);
}
}
