package javastandard.Exception;

public class Exception extends Throwable {
    //try-catch문 사용하기
    public static void main(String[] args) {
        int a, b, c;
        try{
            a = 10;
            b = 0;
            c = a/ b; // 10 나누기 0 -> 산술오류 ArithmeticException

        }catch(ArithmeticException e){
            c = -1; //예외가 발생하여 이 문장이 수행된다.
        }
    }


    }




