package javastandard.Exception;

public class Exception2 {

    public static void main(String[] args) {
        int c;
        try{
            c = 4/ 0;
        }catch(ArithmeticException e){
            c = -1; //예외가 발생하여 이 문장이 수행된다.
        }
    }
}
/*ArithmeticException이 발생하면 c에 -1을 대입하도록 예외를 처리한 것
* ArithmeticException에서 e는 ArithmeticException의 예외객체에 해당된다.*/