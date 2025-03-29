package pokemon.species;

public abstract class Specie {
    private String name;
    private int pokedex_number;
    private int base_hp;
    private int base_attack;
    private int base_sp_attack;
    private int base_defense;
    private int base_sp_defense;
    private int base_speed;

    public Specie(String name, int num, int hp, int atk, int spatk, int def, int spdef, int spd){
        this.name = name;
        this.pokedex_number = num;
        this.base_hp = hp;
        this.base_attack = atk;
        this.base_sp_attack = spatk;
        this.base_defense = def;
        this.base_sp_defense = spdef;
        this.base_speed = spd;
    }

    public String getName() {
        return name;
    }

    public int getPokedexNumber() {
        return pokedex_number;
    }

    public int getBaseHP() {
        return base_hp;
    }

    public int getBaseAttack() {
        return base_attack;
    }

    public int getBaseSpAttack() {
        return base_sp_attack;
    }

    public int getBaseDefense() {
        return base_defense;
    }

    public int getBaseSpDefense() {
        return base_sp_defense;
    }

    public int getBaseSpeed() {
        return base_speed;
    }
}