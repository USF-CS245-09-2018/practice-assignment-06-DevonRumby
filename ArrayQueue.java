
public class ArrayQueue implements Queue {
	int start;
	int end;
	Object[] arr;
	ArrayQueue(){
		start = 0;
		end = 0;
		arr = new Object[10];
	}
	@Override
	public Object dequeue() {
		Object item = arr[start];
		arr[start] = null;
		start++;
		if(start >= arr.length) {
			start = 0;
		}
		return item;
	}

	@Override
	public void enqueue(Object item) {
		arr[end] = item;
		end++;
		if(end >= arr.length) {
			end = 0;
		}
		if(start == end) {
			Object[] temp = new Object[arr.length *2];
			int j = 0;
			for(int i = start; i < arr.length; i++) {
				temp[j] = arr[i];
				j++;
			}
			for(int i = 0; i < end; i++) {
				temp[j] = arr[i];
				j++;
			}
			arr = temp;
			end = j;
			start = 0;
		}
	}

	@Override
	public boolean empty() {
		if(start == end) {
			return true;
		}
		return false;
	}

}
