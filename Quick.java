public class Quick {
  /*
  *@return the index of the final position of the pivot element.
  */
  public static int partition (int [] data, int start, int end){
  	for (int i = start; i < end+1; i++) {
  		System.out.println(data[i]);
  	}
  	int randPivot = (int)(Math.random()*(end+1));
  	int pivot = randPivot;
  	System.out.println("index "+pivot+": "+data[pivot]);

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
