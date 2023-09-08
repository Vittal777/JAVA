import java.util.*;
class Append{
public static void main(String[] args){
String[] str={"1","2","3","4"};
String app = " RGM";
int n=str.length;
for(int i=0;i<n;i++){
System.out.println(i+app);
}
System.out.print("Reverse of a Array String str is ");
for(int j=n-1;j>=0;j--){
System.out.print(str[j]+" ");
}
}
}

