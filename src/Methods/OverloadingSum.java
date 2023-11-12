package Methods;

public class OverloadingSum {
    int sum(){
        int result = 0;
        System.out.println(result);
        return result;
    }
    int sum(int a1){
        int result = a1;
        System.out.println(result);
        return result;
    }
    int sum(int a1,int b1){
        int result = a1+b1;
        System.out.println(result);
        return result;
    }
    int sum(int a1,int b1,int c1){
        int result = a1+b1+c1;
        System.out.println(result);
        return result;
    }
    int sum(int a1,int b1, int c1,int d1){
        int result = a1+b1+c1+d1;
        System.out.println(result);
        return result;
    }
}

class OverloadingSumTest{
    public static void main(String[] args) {
        OverloadingSum Sum = new OverloadingSum();
        Sum.sum(5);
    }
}