package javastandard.Exception;

public class FoolException {
    public static void main(String[] args) {

        int a = 2;
        int b = 0;
        divide(a,b);
    }

    private static int divide(int a, int b) {
        if(b ==0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }


}
