import java.util.*;
class Selesort{
public static void main(String[] args){
int n=7;
int[] nums=new int[n];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array values");
for(int i=0;i<n;i++){
nums[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
int minimumindex=i;
for(int j=i+1;j<n;j++){
if(nums[j]<nums[minimumindex]){
minimumindex=j;
}
}
int temp=nums[minimumindex];
nums[minimumindex]=nums[i];	//minimum element is swapped with first element
nums[i]=temp;
}
System.out.println("Array after implementing Selection sort");
for(int i=0;i<n;i++){
System.out.print(nums[i]+" ");
}
}
}