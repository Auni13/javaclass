public class StringManupilation {
    public static void main(String[] args) {
        String str = "Hello";
        String newStr = str.concat("World");
        String lowerStr = newStr.toLowerCase();
        String spaceStr = newStr.substring(0, 5);
        String replaceString = newStr.replace("World", "Java");

        System.out.println(newStr);
        System.out.println(lowerStr);
        System.out.println(spaceStr);
        System.out.println(replaceString); 
    }
}
