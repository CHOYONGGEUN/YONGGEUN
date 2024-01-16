package javastandard.Exception;

public class RuntimeException {

        public void sayNick(String nick) {
            if("바보".equals(nick)) {
                return;
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }

        public static void main(String[] args) {
            RuntimeException sample = new RuntimeException();
            sample.sayNick("바보");
            sample.sayNick("야호");
        }
    }
/*sayNick 메서드는 '바보'라는 문자열이 입력되면 return으로 메서드를 종료해
* 별명이 출력되지 못하도록 한다.*/


