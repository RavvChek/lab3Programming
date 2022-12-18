package me.ravvcheck.lab3;

public class Feeling {
    private final FeelingEnum name;
    private boolean activity;
    Feeling(FeelingEnum name, boolean activity){
        this.name = name;
        this.activity = activity;
    }
    Feeling(FeelingEnum name){
        this.name = name;
        activity = false;
    }
    public boolean getActivityF(){
        return this.activity;
    }
    @Override
    public String toString(){
        return name.toString();
    }
}
