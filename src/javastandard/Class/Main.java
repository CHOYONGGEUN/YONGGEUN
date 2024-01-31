package javastandard.Class;

// 부모 클래스
class Animal {
    public String bark() {
        return "동물이 웁니다";
    }
}

public class Main {
    public static void main(String[] args) {
        // 익명 클래스 : 클래스 정의와 객체화를 동시에. 일회성으로 사용
        Animal dog = new Animal() {
            //@Override
            public String bark() {
                return "개가 짖습니다";
            }
        }; // 단 익명 클래스는 끝에 세미콜론을 반드시 붙여 주어야 한다.

        // 익명 클래스 객체 사용
        System.out.println(dog.bark());
    }
}