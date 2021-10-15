
public final class SelectionSort {
	
	public static void sort(Integer[] a){
		
		Integer[] results = new Integer[a.length];
		
		int len = a.length;
		int min;
		
		for(int i = 0; i < len; i++) {
			
			min = i;
			
			for(int j = i + 1; j < len; j++) {
				
				if (a[j] < a[min]) {
					min = j;
				}
				
			}
			
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			
		}
				
	}

}
