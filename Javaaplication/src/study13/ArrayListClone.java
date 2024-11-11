package study13;

public class ArrayListClone {

	private String[] arr;
	private int size;
	
	public ArrayListClone() {
		arr = new String[10];
	}
	
	
	public void add(String str) {
		if(size ==arr.length) {
			String [] temp = new String [arr.length+10];
			for(int i=0; i<arr.length; i++) {
				temp[i] = arr[i];
			}
			arr=temp;
		}
		arr[size++] = str;
	}
	
	public String get(int num) {
		return arr[num];
	}
	
	public int getSize() {
		
		return size;
	}
	
	public String remove(int num) {
		String str = get(num);
		System.arraycopy(arr, num+1, arr, num, arr.length-1);
		
		return str;
	}
	
}
