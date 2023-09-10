import java.util.*;
public class Frequency{
public static void main(String[] args){
int[] arr={5,7,8,9,0,3,5,6,1,2,7,8,9,9};
int mostfreq = findingmostfreq(arr);
System.out.println("Most occurred digit is : "+mostfreq);
}


public static int findingmostfreq(int arr[]){
int[] count=new int[15];
for(int n:arr){
while(n!=0){
int rem=n%10;
count[rem]++;
n/=10;
}
}

int mostfreqdig=0;
int maxfreq=0;
for(int i=0;i<count.length;i++){
if(count[i]>maxfreq){
maxfreq=count[i];
mostfreqdig=i;
}
}
return mostfreqdig;
}
}