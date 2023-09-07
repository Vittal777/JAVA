class Bin2Dec{
public static void main(String[] args){
int num=101101;
cond(num);
}
static void cond(int num){
int base=1;
int rem=0;
int res=0;
while(num>0){
rem=num%10;
num/=10;
res=res+rem*base;
base=base*2;
}
System.out.println("Result of binary number after converting to decimal is "+res);
}
}