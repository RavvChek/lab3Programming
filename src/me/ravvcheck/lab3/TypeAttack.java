package me.ravvcheck.lab3;

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