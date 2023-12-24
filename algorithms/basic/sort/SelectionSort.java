package algorithms.basic.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64,25,12,22,12,11};
        // sorting
        for(int i =0;i<arr.length;i++){

            int min_index = i;

            for(int j=i+1 ; j<arr.length ; j++){

                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }

        for(int k =0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

}
