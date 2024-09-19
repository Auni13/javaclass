public class Statement {
    public static void main(String[] args){

        int num = 5;
        
        if(num>0){
            System.out.println("Number is Positive");
        }

        if (num<7){
            System.out.println("Number is less than seven");
        }

        if (num % 2 == 0){ //%2 even number 
            System.out.println("Number is Even");
        } else{
            System.out.println("The Number is Odd");
        }
    }
}
