package LessonA;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 7, 5, 16, 21, 4, 19, 2};
        int smallest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Smallest number: " + smallest);
    }
}