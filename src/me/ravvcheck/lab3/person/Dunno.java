package me.ravvcheck.lab3.person;

public class Dunno extends Person {
    Dunno(){

    }
    public void decideToGoToBed(){
        System.out.print(super.toString() + " решает лечь спать ");
    }
    public void itch(){
        System.out.println(super.toString() + " чесался ");
    }
    public void rend(Thing obj){
        if (obj != null){
            Thing blood = new Thing("кровь");
            System.out.println(super.toString() + " раздирал " + obj.toString() + " до " + blood.toString() + ", но это не помогало");
        }
    }
}
