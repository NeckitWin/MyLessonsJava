package homeworks.dz1;

public class minmax {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25,30};
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num:numbers){
            if (num>max){
                max = num;
            }else if(num<min){
                min=num;
            }
        }
        for (int num:numbers){
            sum+=num;
        }
        int avg = sum/numbers.length;
        System.out.println("Минимальное число: "+min);
        System.out.println("Максимальное число: "+max);
        System.out.println("Среднее число: "+avg);
    }
}
