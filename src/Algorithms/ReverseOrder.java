package Algorithms;

public class ReverseOrder {
    // переврни слово в обратном порядке
    public static void main(String[] args) {
        String idk = "12345";
        String idk2 = "";
        System.out.println(idk.length());
        for (int i = idk.length()-1; i>=0; i--){
            idk2 += idk.charAt(i);
        }
        System.out.println(idk2);
    }
}
