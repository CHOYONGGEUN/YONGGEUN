package javastandard.Exception;

public class Finally {
    public void shouldBeRun(){
        System.out.println("ok thanks");
    }

    public static void main(String[] args) {
        Finally aFinally = new Finally();
        int c;
        try{
            c = 4/0;
            aFinally.shouldBeRun(); //이 코드는 실행되지 않는다.
        }catch(ArithmeticException e){
            c = -1;
        }finally{
            aFinally.shouldBeRun(); //예외에 상관없이 무조건 수행
        }
    }
}
