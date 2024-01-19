package javastandard.Exception;

public class Throws {
    //예외를 메서드에 선언하는 키워드
    //method에서 일일히 try-catch를 하면, 메인 메소드에 있는 메서드 실행 코드 부분은 3개 모두 실행 자체는 된다.

    public static void main(String[] args) {
        method1();
        method2();
        method3();

    }
    public static void method1(){
        try{
            throw new ClassNotFoundException("에러이지롱");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
            //예외 객체의 메시지를 반환한다.
        }
    }
    public static void method2(){
        try{
            throw new ArithmeticException("에러이지롱");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            //예외 객체의 메시지를 반환한다.
        }
    }
    public static void method3(){
        try{
            throw new NullPointerException("에러이지롱");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            //예외 객체의 메시지를 반환한다.
        }
    }

}
