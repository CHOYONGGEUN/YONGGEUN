package javabasic.CH2;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        int a = 10;
        System.out.println("메서드 호출 전: " + dataA.value);
        changePrimitive(dataA);
        System.out.println("메서드 호출 후: " + dataA.value);
    }

    static void changePrimitive(Data dataX){
        dataX.value = 20;
    }
}
