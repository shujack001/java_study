    public class Deck {
       public static int[][] averagearray(int[][] array, int element){
           int size1 = array.length;
           int[] size2 = new int[size1];
           for(int i = 0; i < size1; i++){
               size2[i] = get_size2(array[i]);
           }
           int minelement = get_min(size2);
           array[minelement] = pluselement(array[minelement], element);
           return array;
       }

       public static int get_size2(int[] array){
           return array.length;
       }

       public static int get_min(int[] size2){
           int min = size2[0];
           int index = 0;
           for(int i = 0; i < size2.length; i++){
               if(size2[i] < min){
                   min = size2[i];
                   index = i;
               }
           }
           return index;
       }

       public static int[] pluselement(int[] array, int element){
           int[] new_array = new int[array.length + 1];
           System.arraycopy(array, 0, new_array, 0, array.length);
           new_array[array.length] = element;
           return new_array;
       }
    }
