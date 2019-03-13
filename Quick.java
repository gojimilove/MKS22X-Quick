public class Quick {
  /*
  *@return the index of the final position of the pivot element.
  */
  public static int partition (int [] data, int start, int end){
  	// for (int i = start; i < end+1; i++) {
  	// 	System.out.println(data[i]);
  	// }
  	//int randPivot = (int)(Math.random()*(end+1));
  	int pivot = end/2;
  	//System.out.println("index "+pivot+": "+data[pivot]);

  	//pointers for current low and high
  	int low = start;
  	int high = end;
  	while (low != high) {
  		if (low == pivot) {
  			int oldP = data[low];
  			data[low] = data[high];
  			data[high] = oldP;
  			pivot = high;
  		}
  		if (data[low] > data[pivot]) {
  			int oldL = data[low];
  			data[low] = data[high];
  			data[high] = oldL;
  			if (pivot == high) pivot = low;
  			high--;
  		}
  		else {
  			low++;
  		}
  	}
  	// for (int i = start; i < end+1; i++) {
  	// 	System.out.println(data[i]);
  	// }
  	// System.out.println("index "+pivot+": "+data[pivot]);
  	return pivot;
  }

  /*return the value that is the kth smallest value of the array. k=0 is the smallest
  */
  public static int quickselect(int[] data, int k) {

  }

  /*Modify the array to be in increasing order.
  */
  public static void quicksort(int[] data) {

  }


  public static void main(String[] args) {
  	int[] test1 = new int[]{17,61,67,93,47,12,20,4,44,68};
  	int[] test2 = new int[]{27,29,6,13,45};
  	int[] test3 = new int[]{8,6,7,5,3,0,9};
  	System.out.println(partition(test1, 0, 9)+"\n\n");
  	System.out.println(partition(test2, 0, 4)+"\n\n");
  	System.out.println(partition(test3, 0, 6)+"\n\n");
  }
}
