import java.util.Random;

public class ArrayShuffler {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
      int j = random.nextInt(array.length);
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }

    for (int i : array) {
      System.out.println(i);
    }
  }
}


Approach:-

Start from the last element of the array.
For each element, pick a random index between the current position and the end of the array.
Swap the current element with the one at the randomly chosen index.
Continue this process for all elements.