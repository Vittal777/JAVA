import java.util.*;
class SumEqualsn{
public static void main(String[] args){
ArrayList<Integer>arr=new ArrayList<>();
arr.add(2);
arr.add(7);
arr.add(9);
arr.add(5);
arr.add(8);
arr.add(5);
boolean foundCombination=pairsThatSumUpN(arr,7);
if(!foundCombination){
System.out.println("There is no combo of elements which sums up 10");
}
}
public static boolean pairsThatSumUpN(ArrayList<Integer>arr,int target){
for(int i=0;i<arr.size();i++){
for(int j=i+1;j<arr.size();j++){
if(arr.get(i)+arr.get(j)==target){
System.out.println("The elements which sums up to "+target+" are "+arr.get(i)+" and "+arr.get(j));
return true;
}
}
}
return false;
}
}
