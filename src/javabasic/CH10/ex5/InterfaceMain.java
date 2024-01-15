package javabasic.CH10.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스(완전 추상) 생성 불가
        //InterfaceAniaml interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
