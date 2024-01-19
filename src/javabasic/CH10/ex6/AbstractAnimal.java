package javabasic.CH10.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상을 목적으로 사용
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}//상속을 목적으로 사용
