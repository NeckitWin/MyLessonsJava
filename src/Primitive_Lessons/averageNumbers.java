package Primitive_Lessons;

class averageNumbers{
    public static void main(String[] args) {
        int[] numbers = {23,64,14,84,12};
        int sum = 0;
        int average = 0;

        for (int num:numbers){
            sum += num;
        }
        average=sum/numbers.length;

        System.out.println(average);
    }
}