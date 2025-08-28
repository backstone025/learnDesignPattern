package org.example.ExampleOfProxyPattern.DatingService;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, Person> datingDB = new HashMap<String, Person>();
    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public static void main(String[] args){
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public void drive(){
        Person joe = getPersonFromDatabase("joe");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("이름: "+ownerProxy.getName());
        ownerProxy.setInterests("볼링, 바둑");
        System.out.println("본인 proxy에 과심 사항을 등록합니다.");
        try{
            ownerProxy.setGeekRating(10);
        }catch (Exception e){
            System.out.println("본인의 proxy에는 괴짜 지수를 매길 수 없습니다.");
        }
        System.out.println("괴짜 지수: "+ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: "+ nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("낚시, 요리");
        }catch (Exception e){
            System.out.println("타인 proxy에 관심 사항을 등록할 수 없습니다.");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("타인 proxy에서 괴짜 지수를 매깁니다.");
        System.out.println("괴짜 지수: "+nonOwnerProxy.getGeekRating());
    }

    private Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    private Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

    private Person getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    void initializeDatabase() {
        Person joe = new PersonImpl();
        joe.setName("joe");
        joe.setInterests("차, 컴퓨터, 음악");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("kelly");
        kelly.setInterests("인터넷 쇼핑, 영화, 게임");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
