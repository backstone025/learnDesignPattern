package org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInpput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else return false;
    }

    public String getUserInpput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }
        if (answer == null)
            answer = "no";
        return answer;

    }
}
