package LessonA;

public class LargestNumber {
  public static void main(String[] args){
    int numbers[] = {3,8,12,7,5,16,21,4,19,2};
    int largest = numbers[0];
  
    for (int i=1; i<numbers.length; i++){
      if(numbers[i]> largest){
        largest = numbers[i];
      }
    }
    System.out.println("The largest number is: " + largest);
  }
}
