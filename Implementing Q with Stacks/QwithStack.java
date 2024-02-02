import java.util.Stack;

class QwithStack{
	Stack<Integer> enqStack=new Stack<>();
	Stack<Integer> dqStack=new Stack<>();
	
	public void enqueue(int val){
		enqStack.push(val);
	}
	public int dequeue(){
		if(dqStack.isEmpty()){
			if(enqStack.isEmpty()){
				return -1;
			}
		while(!enqStack.isEmpty()){
			dqStack.push(enqStack.pop());
			}
		}
		return dqStack.pop();
	}
	public boolean isEmpty(){
		return enqStack.isEmpty() && dqStack.isEmpty();
	}
	public int size(){
		return enqStack.size()+dqStack.size();
	}
	public static void main(String[] args){
		QwithStack q=new QwithStack();
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println("Dequeue : "+q.dequeue());
		System.out.println("Size : "+q.size());
	}
}