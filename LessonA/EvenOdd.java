package LessonA;

public class EvenOdd {
  public static void main(String[] args) {
    int[] numbers = {3,8,12,7,5,16,21,4,19,2};
    int evenCount =0;
    int oddCount =0;
     for (int i=0; i<numbers.length; i++) {
        if(numbers[i] % 2 == 0){
          evenCount++;
        }
        else {
          oddCount++;
     }
     }
     System.out.print("Even count: "+evenCount);
     System.out.print("Odd count: "+oddCount);
  }
}