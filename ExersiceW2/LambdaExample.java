
import java.util.function.Predicate;

public class LambdaExample {        //want to put limit on something
    public static void main(String[] args) {
        Predicate<Integer>isGreaterThanThen = (num) -> num > 10;     //integer is in predicate library
        int number = 15; 
        int newNum = 9;

        if (isGreaterThanThen.test(number)){
            System.out.println(number + " is greater than 10");
        }else{
            System.out.println(number +  " is less than 10");
        }

        if (isGreaterThanThen.test(newNum)){
            System.out.println(newNum + " is greater than 10");
        }else{
            System.out.println(newNum +  " is less than 10");
        }
    }
}
