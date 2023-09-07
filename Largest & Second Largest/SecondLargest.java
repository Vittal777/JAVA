import java.util.*;
public class SecondLargest{
public static void main(String[] args){
int[] a = {9,4,6,1,7,0,15};
int size = a.length;
for(int i=0;i<size;i++){
for(int j=i+1;j<size;j++){
if(a[i]>a[j]){
int max = a[i];
a[i] = a[j];
a[j] = max;
}
}
}
System.out.println("Largest : "+a[size-1]);
System.out.println("Second Largest : "+a[size-2]);
}
}


