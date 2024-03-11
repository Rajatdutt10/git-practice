public class Searching {

    //java implimentation of Liner Search.
    public int LinerSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            } 
        }
        return -1;
    }


     // java implimentation of sentinel Search Search.
        public int sentinelSearch(int arr[], int size, int key){
  
         // Last element of the array
         int last = arr[size - 1];
  
         // Element to be searched is
         // placed at the last index
         arr[size - 1] = key;
         int i = 0;
  
         while (arr[i] != key)
             i++;
  
         // Put the last element back
         arr[size - 1] = last;
  
         if ((i < size - 1) || (arr[size - 1] == key)){
             return i;
        }
        return -1;
    }


}
