package javabasic.CH4;

public class MemberInit{
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade){
        this.name = name; //자기 자신의 인스턴스를 가리킴
        this.age = age;
        this.grade = grade;
    }
}

