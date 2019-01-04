package ds.queue;

public class Queue { // FIFO (First In First Out Queue)
	
	private int maxSize; // initialize the set number of slots
	private long[] queArray; // slots to maintain the data
	private int front; // index position for the element in the front
	private int rear; // index position for the back of the line
	private int nItems; // counter to maintain the number of items in our queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; // index position of the first slot of array
		rear = -1; // there is not item in the array yet to be considered as the last item
		nItems = 0; // we don't have elements in the array yet
	}
	
	public void insert(long j) {
		
		if(rear == maxSize -1) {
			rear = -1;
		}
		
		rear++;
		queArray[rear] = j;
		nItems ++;
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems --;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
}
