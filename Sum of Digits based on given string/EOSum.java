import java.util.*;
public class EOSum{
public static void main(String[] args){
int n=765431;

String str="odd";
int sum=Sum(n,str);
System.out.println(sum);
}
static int Sum(int n,String str){
int rem,sum=0;
while(n>0){
rem=n%10;
if(rem%2==0 && str.equals("even")){
sum+=rem;
}
else if(rem%2!=0 && str.equals("odd")){
sum+=rem;
}
n/=10;
}
System.out.println("Sum of "+str+" digits is");
return sum;
}
}

