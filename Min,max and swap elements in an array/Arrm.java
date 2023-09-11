import java.util.*;
public class Arrm{
public static void main(String[] args){
int[] arr={5,6,7,1,2,3,0};
System.out.println("Maximum element in an array is "+max(arr));
System.out.println("Minimum element in an array is "+min(arr));
System.out.println("Array before swapping "+Arrays.toString(arr));
swap(arr,1,5);			//It swaps the index 1 and index 5 elements..
System.out.println("Swapping of index 1 and index 5 elements results in the array "+Arrays.toString(arr));
}

static int max(int arr[]){
int maxval=arr[0];
for(int i=1;i<arr.length;i++){
	if(arr[i]>maxval){
		maxval=arr[i];
}
}
return maxval;
}
static int min(int arr[]){
int minval=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]<minval){
minval=arr[i];
}
}
return minval;
}
static void swap(int arr[],int a,int b){
int temp=arr[a];
arr[a]=arr[b];
arr[b]=temp;
}
}
