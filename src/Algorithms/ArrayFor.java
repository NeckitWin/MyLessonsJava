package Algorithms;

public class ArrayFor {
    public static void main(String[] args) {
        int[] abs = new int[51];
        for(int i = 0; i<=50; i++){
            abs[i] = i+1;
        }
        for(int i:abs){
            System.out.println(i);
        }
    }
}
