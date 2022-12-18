package me.ravvcheck.lab3;

public class Story {
    public static void main(String[] args) {
        Creatures shorties = new Creatures("Коротышки");
        shorties.quietDown();
        Dunno dunno = new Dunno();
        Thing smell = new Thing("запах", "отвратительный");
        dunno.worry(smell);
        dunno.decideToGoToBed();
        Obstinate obstinate = new Obstinate("Строптивый");
        Clothes shirt = new Clothes("рубашка");
        dunno.takeOff(shirt);
        obstinate.said(dunno);
        Thing shelf = new Thing("полка");
        dunno.stretchOnSomething(shelf);
        Creatures animals = new Creatures("зверушки", "мелкие");
        animals.attack(dunno);
        Thing body = new Thing("тело");
        dunno.itch();
        dunno.rend(body);
    }
}

