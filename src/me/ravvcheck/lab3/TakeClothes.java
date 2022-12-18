package me.ravvcheck.lab3;

public interface TakeClothes {
    default void notTakeOff(){
        System.out.println("он не снимал одежду");
    }

    void takeOff(Thing obj);
}
