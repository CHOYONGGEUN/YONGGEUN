package javastandard.Exception;

public class FoolExceptionThorws {
    public static void main(String[] args) {

        int a = 2;
        int b = 0;
        try{
        divide(a,b);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

    }

    private static int divide(int a, int b) throws ArithmeticException{
        if(b ==0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }


}