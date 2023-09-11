import java.util.*;
class Emo{
public static void main(String[] args){
int n=6431,rem,max=0,min=9;
while(n>0){
rem=n%10;
if(rem>max){
max=rem;
}
if(rem<min){
min=rem;
}
n/=10;
}
System.out.println("Max digit : "+max);
System.out.println("Min digit : "+min);
System.out.println("Sum of min and max digits is "+(max+min));
System.out.println("Square of max digit : "+ Math.pow(max,2));
System.out.println("Cube of least digit : "+ Math.pow(min,3));
}
}