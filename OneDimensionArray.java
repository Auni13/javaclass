public class OneDimensionArray {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int[] values = {10, 20, 30, 40, 50};

        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int value: values){
            System.out.println(value);
        }
    }
}
