import java.util.ArrayList;
import java.util.Iterator;
public class Itera{
public static void main(String[] args){
ArrayList<String>arl=new ArrayList<>();
arl.add("c");
arl.add("v");
arl.add("s");
arl.add("7");
Iterator<String>itr=arl.iterator();
System.out.print("Iterating through array list by iterator interface : ");
while(itr.hasNext()){
System.out.print(itr.next()+" ");
}
}
}