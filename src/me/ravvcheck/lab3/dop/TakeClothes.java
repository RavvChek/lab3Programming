package me.ravvcheck.lab3.dop;

import me.ravvcheck.lab3.person.Thing;

public interface TakeClothes {
    default void notTakeOff(){
        System.out.println("он не снимал одежду");
    }

    void takeOff(Thing obj);
}
