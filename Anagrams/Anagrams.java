import java.util.Scanner;
import java.util.Arrays;
public class Anagrams{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the strings");
String s1=sc.next();
String s2=sc.next();
if(s1.length()!=s2.length()){
System.out.println("Not Anagrams");
}
if(s1.length()==s2.length()){
char[] ch=s1.toCharArray();
char[] ch2=s2.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch2);
boolean res=Arrays.equals(ch,ch2);
if(res){
System.out.println("s1 & s2 are anagrams");
}else{
System.out.println("Not Anagrams");
}
}
}
}
