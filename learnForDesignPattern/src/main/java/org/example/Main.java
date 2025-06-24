package org.example;

import org.example.ExampleOfDecoratorPattern.JavaIODecorator.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args){
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            // 실행 시 file 경로는 따로 찾아서 넣을 것
                            new FileInputStream("/...<file directory>.../src/main/java/org/example/ExampleOfDecoratorPattern/JavaIODecorator/test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char) c);
            }
            System.out.println();
            in.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}