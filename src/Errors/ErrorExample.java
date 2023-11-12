package Errors;

public class ErrorExample {
    private ABC abc;
    public void foo(){
        try {
            int i = 10/0;
        }catch (ArithmeticException e){
            System.err.println("На ноль делить незя!!!");
        }

        try{
            int[] numbers = {1,2,3};
            int value = numbers[5];
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Ты чо: "+e.getMessage());
        }finally {
            System.out.println("Хз, чо писать");
        }
    }
}
