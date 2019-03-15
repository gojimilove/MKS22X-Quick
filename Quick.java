public class Quick {
  /*
  *@return the index of the final position of the pivot element.
  */
  public static int partition (int [] data, int start, int end){
  	// for (int i = start; i < end+1; i++) {
  	// 	System.out.println(data[i]);
  	// }
  	int pivot = 0;

  	if (data[start] <= data[end/2] && data[start] >= data[end] ||
  			data[start] >= data[end/2] && data[start] <= data[end]) pivot = start+1;
  	else if (data[end/2] <= data[end] && data[end/2] >= data[start] ||
  					data[end/2] >= data[end] && data[end/2] <= data[start]) pivot = (end/2);
  	else pivot = end-1;
  	// System.out.println(start+": "+data[start]+", "+(end/2)+": "+data[end/2]+", "+end+": "+data[end]);
  	// System.out.println(data[pivot]);

	  int randPivot = (int)(Math.random()*(end+1-start));
	  //pivot = randPivot;
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
    //default includes entire array
    int start = 0;
    int end = data.length - 1;
    int pivot = partition(data, start, end);
    // System.out.println("pivot: "+pivot);
    // System.out.println("k: "+k+"\n\n");

    //stops when the resulting pivot and the k value are the same, that one is in the right spot
    while (pivot != k) {
    	//"cut out" desired section of the array based on where the pivot ends up
    	if (pivot > k) end = pivot-1;
    	else start = pivot;
    	pivot = partition(data, start, end);
    	// for (int i = start; i < end+1; i++) {
  		// 	System.out.println(data[i]);
  		// }
  		// System.out.println("\n\npivot: "+pivot);
    	// System.out.println("k: "+k);
    }
    return data[k];
  }

  /*Modify the array to be in increasing order.
  */
  public static void quicksort(int[] data) {
  	quicksortH(data, 0, data.length-1);
  }

  public static void quicksortH(int[] data, int low, int high) {
  	if (low >= high) {
  		return;
  	}
  	int pivot = partition(data, low, high);
  	quicksortH(data, low, pivot-1);
  	quicksortH(data, pivot+1, high);
  }


  public static void main(String[] args) {
  	int[] ary = new int[]{17,61,67,93,47,12,20,4,44,68};
  	int[] ary3 = new int[]{27,29,6,13,45};
  	int[] ary4 = new int[]{8,6,5,7,3,0,9};
  	// System.out.println(partition(test1, 0, 9)+"\n\n");
  	// System.out.println(partition(test2, 0, 4)+"\n\n");
  	// System.out.println(partition(test3, 0, 6)+"\n\n");
    int[]ary1 = new int[]{2,10,15,23,0,5};
    //System.out.println(partition(ary, 0, 5)+"\n\n");
    // System.out.println(quickselect(ary, 0));
    // System.out.println(quickselect(ary, 1));
    // System.out.println(quickselect(ary, 2));
    // System.out.println(quickselect(ary, 3));
    // System.out.println(quickselect(ary, 4));
    // System.out.println(quickselect(ary, 5));
    System.out.print("BEFORE SORTING: [");
    for (int i = 0; i < ary.length; i++) {
  		System.out.print(ary[i]);
  		if (i < ary.length-1) System.out.print(", ");
  	}
  	System.out.print("]");
    quicksort(ary);
    System.out.print("\n\nAFTER SORTING: [");
    for (int i = 0; i < ary.length; i++) {
  		System.out.print(ary[i]);
  		if (i < ary.length-1) System.out.print(", ");
  	}
  	System.out.print("]\n");
  }
}
