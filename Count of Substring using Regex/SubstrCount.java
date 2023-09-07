import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SubstrCount{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String str=s.nextLine();
System.out.println("Enter a substring");
String substr=s.nextLine();
Pattern pattern=Pattern.compile(substr);
Matcher matcher=pattern.matcher(str);
int count=0;
while(matcher.find()){
count++;
}
System.out.println("The occurence of substring "+substr+" in "+str+" is "+count+" times");
}
}