package javastandard.Exception;
import java.io.FileInputStream; //파일에서 데이터를 읽어오기 위함
import java.io.FileNotFoundException;//파일에서 데이터를 잃ㄱ어오기 위한 스트림을 생성하는데 사용
import java.io.IOException; //입출력 작업 중 발생할 수 있는 일반적인 예외를 처리하기 위해 사용
public class CreateFile {
    public static void main(String[] args) {
        FileInputStream file = null; //객체를 선언하고 초기화한다. 이 객체는 파일에서 데이터를 읽어오는 데 사용됨

        try{
            file = new FileInputStream("doas"); //존재하지 않는 파일인 doas 파일
        }catch(FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다 : " + e.getMessage());
            //만약 파일이 존재하지 않으면 'FileNotFoundException'이 발생하고, 해당 예외를 처리하기 위해 catch 블록에서 메시지를 출력하고 프로그램을 종료
            return;
        } finally{ //예외 발생 여부에 관계없이 항상 실행되는 블록
            if(file != null){
                try{
                    file.close();//파일을 닫아야 리소스 누수를 방지할 수 있다.
                }catch(IOException e){
                    System.out.println("" + e.getMessage());
                    //e.getMessage = 해당 예외 메시지를 출력할 때 사용
                }
            }
        }
    }
}
