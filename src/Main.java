public class Main {
    public static void main(String[] args) {
        int birthMonth = 14;
        int invalidMonth = 13;
        if (birthMonth < invalidMonth){
            System.out.println("Your birth month is: " + birthMonth);
        }
        else{
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}