public class Quick {
  /*
  *@return the index of the final position of the pivot element.
  */
  public static int partition (int [] data, int start, int end){
  	for (int i = start; i < end+1; i++) {
  		System.out.println(data[i]);
  	}
  	int pivot = end/2;
  	System.out.println("index "+pivot+": "+data[pivot]);
  	for (int i = start; i < end; i++) {
  		if (data[i] > data[pivot]) {
  			System.out.println(data[i]+" is GREATER than "+data[pivot]);
  		}
  		else {
  			System.out.println(data[i]+" is LESS than or equal to "+data[pivot]);

  		}
  	}
  	return -1;
  }

  public static void main(String[] args) {
  	int[] test = new int[]{17,61,67,47,93,12,20,4,44,68};
  	partition(test, 0, 9);
  }
}
