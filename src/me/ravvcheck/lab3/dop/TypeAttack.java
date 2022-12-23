package me.ravvcheck.lab3.dop;

public enum TypeAttack {
    MERCILESSLY("немилосердно");
    private String value;
    private TypeAttack(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}