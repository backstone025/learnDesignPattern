package org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInpput();

        // 대문자도 소문자로 처리, y로 시작하는지 확인
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else return false;
    }

    public String getUserInpput() {
        String answer = null;

        System.out.println("차에 레몬을 넣을까요? (y/n)? ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
