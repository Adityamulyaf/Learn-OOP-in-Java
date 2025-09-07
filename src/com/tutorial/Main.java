package com.tutorial;

class Player{
    String nama;
    int level;
    double hp;

    // object member
    Weapon weapon;
    Armor armor;

    Player(String nama, int level, double hp) {
        this.nama = nama;
        this.level = level;
        this.hp = hp;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nNama\t\t: " + this.nama);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("HP\t\t: " + this.hp);
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    String nama;
    double attackPower;

    Weapon(String nama, double attackPower) {
        this.nama = nama;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon\t\t: " + this.nama);
        System.out.println("Attack power\t: " + this.attackPower);
    }
}

class Armor{
    String nama;
    double defensePower;

    Armor(String nama, double defensePower) {
        this.nama = nama;
        this.defensePower = defensePower;
    }

    void display() {
    System.out.println("Armor\t\t: " + this.nama);
    System.out.println("Defense power\t: " + this.defensePower);
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Konan", 3, 99);
        Player player2 = new Player("Naruto", 5, 100);

        Weapon dagger = new Weapon("Steel Dagger", 10);
        Weapon kunai = new Weapon("Orichi", 21);

        Armor baju = new Armor("Steel Armor", 7);
        Armor chakra = new Armor("Chakra", 40);

        // player1
        player1.equipWeapon(dagger);
        player1.equipArmor(baju);
        player1.display();

        // player2
        player2.equipWeapon(kunai);
        player2.equipArmor(chakra);
        player2.display();
    }
}

