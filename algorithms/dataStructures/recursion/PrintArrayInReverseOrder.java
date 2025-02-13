package algorithms.dataStructures.recursion;

public class PrintArrayInReverseOrder {
    public static void main(String[] args) {
        int[] array = {69 , 87, 45, 21, 47};

        printInReverseOrder(0,array);
    }

    private static void printInReverseOrder(int index, int[] array) {
      if(index > array.length-1){
          return;
      }
      else {
          printInReverseOrder( index+1 , array);

          System.out.println(array[index]);

      }

    }
}
