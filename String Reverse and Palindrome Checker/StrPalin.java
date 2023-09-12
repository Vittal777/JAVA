import java.util.Arrays;
import java.util.Scanner;
public class StrPalin{
public static void main(String[] args){
String str="Vittal";
palinstr(str);
String str1="Edokati";
sortstr(str1);
}
static void palinstr(String str){
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--){
rev = rev+str.charAt(i);
}			

System.out.print("Is string str, a palindrome?");		
if (str.toLowerCase().equals(rev.toLowerCase())){
System.out.println(" Yes");
}else{
System.out.println(" No");
}
}


static void sortstr(String str1){
String str2=str1.toLowerCase();				//Sorting a string
char[] charArr=str2.toCharArray();
Arrays.sort(charArr);
System.out.println("Reverse of a string str is "+new String(charArr));
}
}
