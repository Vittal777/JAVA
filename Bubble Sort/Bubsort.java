import java.util.*;
class Bubsort{
    public static void main(String[] args) {
        int n=10;
        int[] numbers=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array values");
	for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();
	}
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
	System.out.println("Array after implementing Bubble sort");
	for(int i=0;i<n;i++){
        System.out.print(numbers[i]+" ");
	}
    }
}
