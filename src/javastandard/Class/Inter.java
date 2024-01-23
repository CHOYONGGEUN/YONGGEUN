package javastandard.Class;

public class Inter {
    interface IAnimal {
    }

    interface ICreature {
    }

    abstract class myClass {
    }

        public static void main(String[] args) {

            // 인터페이스 두개를 구현한 일회용 클래스 (일회용 이라도 어쩔수 없이 따로 선언)
            class useClass1 implements IAnimal, ICreature {
            }

            // 클래스와 인터페이스를 상속, 구현한 일회용 클래스 (일회용 이라도 어쩔수 없이 따로 선언)
            class useClass2 extends myClass implements IAnimal {
            }

            useClass1 u1 = new useClass1() {
            };

            useClass2 u2 = new useClass2() {
            };
        }

}
