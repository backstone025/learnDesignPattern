package org.example.ExampleOfStatePattern;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuaterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0)
            state = noQuarterState;
        else state = soldState;
    }

    public void insertQuater(){
        state.insertQuater();
    }

    public void ejectQuater(){
        state.ejectQuater();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n주식회사 왕뽑기\n");
        sb.append("자바로 돌아가는 최신형 뽑기 기회\n");
        sb.append("남은 개수: ");
        sb.append(count);
        sb.append("개\n");
        if(state.equals(soldOutState))
            sb.append("매진\n");
        else sb.append("동전 투입 대기중\n");
        return sb.toString();
    }

    void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0){
            count = count - 1;
        }
    }

    void setState(State state) {
        this.state = state;
    }

    void setCount(int count){
        this.count = count;
    }

    public State getHasQuaterState(){
        return hasQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public int getCount() {
        return count;
    }
}
