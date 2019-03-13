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

  	int low = start;
  	int high = end;
  	while (low < end && high > -1) {
 			if (low < pivot && data[low] > data[pivot]) {
 				int oldL = data[low];
 				data[low] = data[high];
 				data[high] = oldL;
 				high--;
 			}
 			else {
 				if (low > pivot && data[low] < data[pivot]) {
 					int small = data[low];
 					data[low] = data[pivot];
 					data[pivot] = small;
 					pivot = low;
 				}
 				low++;
 			}
  	}


  	for (int i = start; i < end+1; i++) {
  		System.out.println(data[i]);
  	}
  	System.out.println("index "+pivot+": "+data[pivot]);
  	return pivot;
  }

  public static void main(String[] args) {
  	int[] test = new int[]{17,61,67,93,47,12,20,4,44,68};
  	System.out.println(partition(test, 0, 9));
  }
}
