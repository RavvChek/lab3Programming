package me.ravvcheck.lab3.person;

import me.ravvcheck.lab3.dop.State;
import me.ravvcheck.lab3.dop.FeelingEnum;
import me.ravvcheck.lab3.dop.PersonInt;
import me.ravvcheck.lab3.dop.TakeClothes;

import java.util.Objects;

public abstract class Person extends Object implements PersonInt, TakeClothes {
    private final String name;
    private Feeling senseOfSmell;
    private Feeling senseOfSight;
    private Feeling senseOfTouch;
    private Feeling senseOfTaste;
    private Feeling vestibularSensation;
    private Feeling senseOfHearing;
    Person(String name){
        this.name = name;
        senseOfSmell = new Feeling(FeelingEnum.SMELL);
        senseOfHearing = new Feeling(FeelingEnum.HEARING);
        senseOfSight = new Feeling(FeelingEnum.VESTUBULAR_APPARATUS);
        senseOfTaste = new Feeling(FeelingEnum.TASTE);
        vestibularSensation = new Feeling(FeelingEnum.VISION);
        senseOfTouch = new Feeling(FeelingEnum.TACTILITY);
    }
    Person(){
        this.name = "Незнайка";
        senseOfSmell = new Feeling(FeelingEnum.SMELL, true);
        senseOfHearing = new Feeling(FeelingEnum.HEARING);
        senseOfSight = new Feeling(FeelingEnum.VESTUBULAR_APPARATUS);
        senseOfTaste = new Feeling(FeelingEnum.TASTE);
        vestibularSensation = new Feeling(FeelingEnum.VISION);
        senseOfTouch = new Feeling(FeelingEnum.TACTILITY, true);
    }
    public void stretchOnSomething(Thing obj){
        System.out.println(this.toString() + " растянулся на" + obj.toString());
    }
    @Override
    public void feel(){
        System.out.print(this.name + " почувствовал что ");
    }
    public void followTheAdvice(Person obj) {
        System.out.println(this.toString() + " решает последовать совету " + obj.toString());
    }
    @Override
    public void smell(Thing obj) {
        System.out.println(obj.toString() + " уже не так тревожил " + this.senseOfSmell.toString() + " " + name);
        Environment env = new Environment(State.STUFFY, State.UNBEARABLY);
        System.out.print("но ");
        env.influence();
    }

    @Override
    public void takeOff(Thing obj){
        if(obj instanceof Clothes){
            System.out.println(this.toString() + " принялся стаскивать с себя " + obj.toString());
        }
        else{
            notTakeOff();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) && Objects.equals(senseOfSmell, person.senseOfSmell) && Objects.equals(senseOfSight, person.senseOfSight) && Objects.equals(senseOfTouch, person.senseOfTouch) && Objects.equals(senseOfTaste, person.senseOfTaste) && Objects.equals(vestibularSensation, person.vestibularSensation) && Objects.equals(senseOfHearing, person.senseOfHearing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, senseOfSmell, senseOfSight, senseOfTouch, senseOfTaste, vestibularSensation, senseOfHearing);
    }

    @Override
    public String toString(){
        return name;
    }
}

