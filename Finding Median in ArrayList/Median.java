import java.util.*;
class Median{
public static void main(String[] args){
ArrayList<Integer>arr=new ArrayList<>();
arr.add(2);
arr.add(4);
arr.add(5);
arr.add(7);
arr.add(9);
arr.add(0);
arr.add(1);
arr.add(3);
arr.add(6);
arr.add(8);
Collections.sort(arr);
System.out.println("ArrayList after adding the elements "+arr);
int n=arr.size();
if(n%2==0){
System.out.println("Median of the array is : "+(float)(arr.get(n/2)+arr.get(n/2-1))/2);
}
else if(n%2!=0){
System.out.println("Median of the array is : "+(float)arr.get(n/2));
}
}
}