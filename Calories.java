public class Calories {
    public static void main(String[] args) {
        String dayName;
        int calory = 1500;

        for (int i=1; i<=7; i++){

            switch(i){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Value";
                break;
        }   
        if (i >= 2){
                calory = calory + 100;
            }

        System.out.println(dayName + " : " + calory);

        }        

    }
}
