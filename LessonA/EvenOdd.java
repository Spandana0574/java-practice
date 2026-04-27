package LessonA;

public class EvenOdd {
  public static void main(String[] args) {
    int[] inputNumbers = {3,8,12,7,5,16,21,4,19,2};
    int evenCount =0;
    int oddCount =0;
     for (int i=0; i<inputNumbers.length; i++) {
        if(inputNumbers[i] % 2 == 0){
          evenCount++;
        }
        else {
          oddCount++;
     }
     }
     System.out.println("Even count: "+evenCount);
     System.out.println("Odd count: "+oddCount);
  }
}