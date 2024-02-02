import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackwithQ{
	Queue<Integer>q1=new LinkedList<>();
	Queue<Integer>q2=new LinkedList<>();
	public void push(int val){
		q1.offer(val);
		while(!q2.isEmpty()){
			q1.offer(q2.poll());
		}
		Queue<Integer> temp= q1;
		q1 = q2;		// Swapping since Stack is LIFO r FILO.
		q2 = temp; 
	}
	public int pop(){
		if(isEmpty()){
			return -1;
		}
	return q2.poll();
	}
	public boolean isEmpty(){
		return q1.isEmpty() && q2.isEmpty();
	}
	public int size(){
		return q1.size() + q2.size();
	}
	public static void main(String[] args){
		StackwithQ stack=new StackwithQ();
		stack.push(3);
		stack.push(1);
		stack.push(9);
		System.out.println("POP : "+stack.pop());
		System.out.println("POP : "+stack.pop());
		System.out.println("Size : "+stack.size());
		System.out.println("POP : "+stack.pop());
		System.out.println("POP : "+stack.pop());
		System.out.println("Size : "+stack.size());
	}
}