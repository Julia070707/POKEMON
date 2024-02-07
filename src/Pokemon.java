public class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

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

    public void fight() {
        System.out.println(name + " is fighting.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
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
    public Charmander() {
        super("Charmander", "Fire", null, 39, 52, 43, 60, 50, 65);
    }
}

class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("Bulbasaur", "Grass", "Poison", 45, 49, 49, 65, 65, 45);
        System.out.println("Текущая директория: " + System.getProperty("user.dir"));

    }
}
