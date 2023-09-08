public class BitEO{
public static void main(String[] args){
int n=7;
System.out.println("Is the number even? : "+even(n));
System.out.println("Is the number odd? : "+odd(n));
}


static boolean even(int n){
return (n&1)==0;
}
static boolean odd(int n){
return (n&1)==1;
}
}
/*In finding of e/o num we can use of bw operators.Like if in 1001 every bit is a power of 2 except the first bit from right.
which is 2^0.And then after 2^1,2^2....etc all are the powers of 2 which contributes the sum of multiplications to even.2^0 which
is known as Least Significant bit plays a pivotal role if its '0' then the sum of 2 powers remains even.If it is '1' then the power of sum 
becomes odd.*/