import java.util.Arrays;
class MinMax{
public static void main(String[] main){
int[] arr={5,6,9,0,1,2,4,10};
int max=Arrays.stream(arr).max().getAsInt();
int min=Arrays.stream(arr).min().getAsInt();
System.out.println("Maximum value of an array arr is "+max);
System.out.println("Minimum value of an array arr is "+min);
}
}
