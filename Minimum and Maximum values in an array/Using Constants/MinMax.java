class MinMax{
public static void main(String[] args){
int[] arr={6,9,3,5,8,1,2};
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<arr.length-1;i++){
if(arr[i]>max){
max=arr[i];
}
if(arr[i]<min){
min=arr[i];
}
}
System.out.println("Maximum element of an array arr is "+max);
System.out.println("Minimum element of an array arr is "+min);
}
}