package Homework8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

class File extends Exception {
    public File() {}
    public File(String fileName) {
        super(fileName);
    }
}

class ArithmeticException extends RuntimeException {
    public ArithmeticException(){}
    public ArithmeticException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        ArithmeticException arithmeticException = new ArithmeticException();
        try {
            throw new ArithmeticException("예외 발생");
        }catch (ArithmeticException e) {
            System.out.println("사용자 정의 일반 예외 처리: "+ e.getMessage());
        }

        try {
            File file = new File("non_existent_file.txt");
            FileReader fileReader = new FileReader(String.valueOf(file));
        } catch (FileNotFoundException e){
            System.out.println("파일 찾을 수 없음: "+e.getMessage());
        }

    }
}

