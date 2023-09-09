class Dec2All{
public static void main(String[] args){
int num=45;
convertToBinary(num);
convertToOctal(num);
convertToHex(num);
}
static void convertToBinary(int num){
int mul=1;
int binarynum=0;
int temp=num;
while(num>0){
int rem=num%2;
num/=2;
binarynum+=rem*mul;
mul*=10;
}
System.out.println("Conversion of "+temp+" to binary is "+binarynum);
}
static void convertToOctal(int num){
int mul=1;
int octalnum=0;
int temp=num;
while(num>0){
int rem=num%8;
num/=8;
octalnum+=rem*mul;
mul*=10;
}
System.out.println("Conversion of "+temp+" to octal is "+octalnum);
}
static void convertToHex(int num){
String hexnum="";
char[] arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
int temp=num;
while(num>0){
int rem=num%16;
hexnum=arr[rem]+hexnum;
num/=16;
}
System.out.println("Conversion of "+temp+" to hex is "+hexnum);
}
}

