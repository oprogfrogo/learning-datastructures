package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(14);
		myQueue.insert(13);
		myQueue.insert(44);
		myQueue.insert(33);
		myQueue.insert(55);
		myQueue.view();
	}

}
