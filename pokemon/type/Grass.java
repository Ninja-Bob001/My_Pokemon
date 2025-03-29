package pokemon.type;

public class Grass implements Type {
    public String getName() {
        return "Grass";
    }
    public double getTypeEffectiveness(Type otherType){
        return otherType.getWeaknessFromGrass();
    }
    public double getWeaknessFromFire(){
        return 2;
    }
    public double getWeaknessFromWater(){
        return 0.5;
    }
    public double getWeaknessFromGrass(){
        return 0.5;
    }
    public double getWeaknessFromElectric(){
        return 0.5;
    }
    public double getWeaknessFromGround(){
        return 0.5;
    }
    public double getWeaknessFromFlying(){
        return 2;
    }
    public double getWeaknessFromPsychic(){
        return 1;
    }
    public double getWeaknessFromBug(){
        return 2;
    }
    public double getWeaknessFromRock(){
        return 1;
    }
    public double getWeaknessFromGhost(){
        return 1;
    }
    public double getWeaknessFromDark(){
        return 1;
    }
    public double getWeaknessFromFairy(){
        return 1;
    }
    public double getWeaknessFromIce(){
        return 2;
    }
    public double getWeaknessFromSteel(){
        return 1;
    }
    public double getWeaknessFromDragon(){
        return 1;
    }
    public double getWeaknessFromNormal(){
        return 1;
    }
    public double getWeaknessFromFighting(){
        return 1;
    }
    public double getWeaknessFromPoison() {
        return 2;
    }
    
}
