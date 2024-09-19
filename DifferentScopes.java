public class DifferentScopes {

    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instanveVariableString = " This is a String";

    static int instanceVariableStatic = 20;

    public void showLocalVariable() {
        String localStringVariable = "Finish!";
        int localvariable = 30;
        System.out.println("My local Variable is: " + localvariable + " " + localStringVariable);
    }

    public static void main(String[] args){
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local Variable is: " + example.instanceVariable +  " " + example.instanveVariableString);
    }
    
}
