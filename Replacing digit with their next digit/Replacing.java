class Replacing{
public static void main(String[] args){
int num=9191;	//9191->the first digit wont appear in the output..since it will be converted to 0...there's no value.
replaceOdd(num);
}
static void replaceOdd(int num){
int res=0;
int multiplier=1;
while(num>0){
int digit=num%10;

/*
if(digit%2!=0 && digit!=9){
digit++;
}
if(digit==9){
digit=0;
}
*/

digit=(digit==9)?0:(digit%2!=0) ?digit+1:digit;	//optimized snipped of the above if condtion.


res+=digit*multiplier;
multiplier*=10;
num/=10;

}
System.out.println("Result after replacing the digit with their corresponding next digit is "+res);
}
}