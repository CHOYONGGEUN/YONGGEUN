package javabasic.CH9.access.child;

import javabasic.CH9.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue =1;
        protectedValue =1; //상속 관계 or 같은 패키지, 상속 관계이기 때문에 불러 쓸 수 있는 것임
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //다른 패키지인데, 상 관계이기 때문에 가능

        printParent();

    }
}
