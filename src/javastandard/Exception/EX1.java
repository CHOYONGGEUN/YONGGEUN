package javastandard.Exception;
import java.io.*;
public class EX1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
            br.readLine();
            br.close();
        }
    }
    //존재하지 않는 파일을 열려고 시도했기 떄문에 원하는 파일을 찾을 수 없다는 FileNotFoundException 발생



