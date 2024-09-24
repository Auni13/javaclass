public class FInally {
    public static void main(String[] args) {
        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caugh bad " + e.getMessage());
        }finally{
            System.out.println("It will executed anyway");
        }

        System.out.println("Program is continuing");
    }
}
