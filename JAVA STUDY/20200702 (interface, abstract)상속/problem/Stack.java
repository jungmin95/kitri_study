package problem;

public class Stack implements IStack {

	String[] arr = new String[5];
	int length = 0;
	int Ptr = 0;

	@Override
	public boolean push(Object ob) {
		boolean result = false;
		if (length < arr.length) {
			arr[Ptr++] = (String) ob;
			length++;
			result = true;
		} else {
			String[] arrTemp = new String[arr.length * 2];
			System.arraycopy(arrTemp, 0, arrTemp, 0, length);
			arr = arrTemp;
			result = push(ob);
		}
		return result;
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public Object pop() {
		String result = null;
		if (!isEmpty()) {
			int popPtr = --Ptr;
			result = arr[popPtr];
			length--;
			arr[popPtr] = null;

			if (length < (arr.length / 3)) {
				String[] arrTemp = new String[arr.length / 2];
				System.arraycopy(arrTemp, 0, arrTemp, 0, length);
			}
		}
		return result;
	}

	@Override
	public Object peek() {
		String result = null;
		if (!isEmpty()) {
			int peekPtr = Ptr - 1;
			result = arr[peekPtr];
		}
		return result;
	}

	@Override
	public boolean isEmpty() {
		boolean result = (length > 0) ? false : true;
		return result;
	}

}
