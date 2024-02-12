import java.util.Scanner;

public class Pokemon {
    // свойства и методы родительского класса
    private int maxHP;
    private static final double additionalHP;

    static {
        // запрос значения additionalHP от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for additionalHP:");
        additionalHP = scanner.nextDouble();
    }

    private String name;
    private String type1;
    private String type2;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public Pokemon(String name, int maxHP) {
        this.name = name;
        this.maxHP = maxHP;
    }

    public Pokemon(String name, String type1, String type2,
                   int hp, int attack, int defense,
                   int specialAttack, int specialDefense, int speed) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public void someMethod() {
        double actualMaxHP = maxHP + additionalHP;
        // остальной код
    }

    public void fight() {
        System.out.println(name + " is fighting.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Добавила модификаторы доступа для остальных методов и полей
    // Например, если какие-то методы или поля должны быть доступны только внутри пакета, использовать default (package-private) модификатор доступа:
    void somePackagePrivateMethod() {
        // код
    }

    // Если метод или поле должны быть доступны только внутри текущего класса, используйте private:
    private void somePrivateMethod() {
        // код
    }

    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();

        Pokemon[] team1 = {charmander};
        Pokemon[] team2 = {bulbasaur};

        for (Pokemon pokemon : team1) {
            pokemon.fight();
            pokemon.sleep();
        }

        for (Pokemon pokemon : team2) {
            pokemon.fight();
            pokemon.sleep();
        }
    }
}

class Charmander extends Pokemon {
    // свойства и методы подкласса Charmander
    public Charmander() {
        super("Charmander", "Fire", null, 39, 52, 43, 60, 50, 65);
    }
}

class Bulbasaur extends Pokemon {
    // свойства и методы подкласса Bulbasaur
    public Bulbasaur() {
        super("Bulbasaur", "Grass", "Poison", 45, 49, 49, 65, 65, 45);
    }
}