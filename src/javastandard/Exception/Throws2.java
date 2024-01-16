package javastandard.Exception;

public class Throws2 {
    //예외를 메서드에 선언하는 키워드
    //예외처리를 상위 메서드에서 모아 처리하면, 코드 어느 한곳에서 예외가 발생하면 그 뒤의 나머지 코드들은 당연히 실행되지 않게 된다.
    //왜냐하면 바로 catch로 점프하기 때문에

    public static void main(String[] args) {
        try{
            method1();
            method2();
            method3();

        }catch(ClassNotFoundException |ArithmeticException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException("에러이지롱");
    }  public static void method2() throws ArithmeticException{
        throw new ArithmeticException("에러이지롱");
    }  public static void method3() throws NullPointerException{
        throw new NullPointerException("에러이지롱");
    }

}
