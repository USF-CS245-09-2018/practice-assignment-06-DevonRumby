
public class ArrayStack implements Stack{
	Object[] arr;
	int start;
	ArrayStack(){
		arr = new Object[10];
		start = 0;
	}
	
	@Override
	public void push(Object item) {
		arr[start] = item;
		start++;
		if(start >= arr.length) {
			Object[] temp = new Object[arr.length *2];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
	}

	@Override
	public Object pop() {
		start --;
		Object item = arr[start];
		arr[start] = null;
		return item;
	}

	@Override
	public Object peek() {
		return arr[start - 1];
	}

	@Override
	public boolean empty() {
		if(start == 0) {
			return true;
		}
		return false;
	}

}
