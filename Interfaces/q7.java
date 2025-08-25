// Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order. Create a classes BubbleSort  that implement the Sortable interface and provide their own implementations of the sort() method.

interface Sortable{
  void sort(int[] arraylist);
}

class BubbleSort implements Sortable{
  public void sort(int[] arraylist)
  {
      int n = arraylist.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arraylist[j] > arraylist[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = arraylist[j];
                    arraylist[j] = arraylist[j + 1];
                    arraylist[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is sorted
            if (!swapped) break;
        }
  }
}

class main{
  public static void main(String st[])
  {
      // Declare and initialize an array
        int[] arraylist = {1, 2, 3, 6, 5};

        BubbleSort sorting=new BubbleSort();
        sorting.sort(arraylist);

        System.out.println("sorted array:");

        for(int i=0; i<arraylist.length; i++)
        {
            System.out.print(arraylist[i] + " ");
        }
  }
}