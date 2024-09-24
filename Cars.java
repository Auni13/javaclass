public class Cars {
    
    private String carType;
    private double petrolUse;

    public String getCarType(){
        return carType;
    }

    public void setCarType(String carType){
        this.carType = carType;
    }

    public double getPetrolUse(){
        return petrolUse;
    }

    public void setPetrolUse(double petrolUse){
        this.petrolUse = petrolUse;
    }

    public static void main(String[] args) {
        Cars type = new Cars();

        String[][] carType = new String[3][3];
        double[][] petrolUse = new double[3][3];

        carType[0][0] = "Axia"; carType[0][1] = "Myvi"; carType[0][2] = "Bezza";
        carType[1][0] = "X50"; carType[1][1] = "X90"; carType[1][2] = "Iriz";
        carType[2][0] = "Camry"; carType[2][1] = "Almera"; carType[2][2] = "City";

        petrolUse[0][0] = 10; petrolUse[0][1] = 11.5; petrolUse[0][2] = 12;
        petrolUse[1][0] = 15; petrolUse[1][1] = 14; petrolUse[1][2] = 12.5;
        petrolUse[2][0] = 15; petrolUse[2][1] = 15; petrolUse[2][2] = 16;

        for (int row=0; row<carType.length; row++){
            for(int col=0; col<petrolUse[row].length; col++){
                
                type.setCarType(carType[row][col]);
                type.setPetrolUse(petrolUse[row][col]);

                System.out.println(type.getCarType() + " has used " + type.getPetrolUse() + " litres per 100km");
            }
        }

    }
}
