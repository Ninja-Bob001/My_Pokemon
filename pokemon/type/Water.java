package pokemon.type;

public class Water implements Type {
    public String getName() {
        return "Water";
    }
    public double getTypeEffectiveness(Type otherType){
        return otherType.getWeaknessFromFire();
    }
    public double getWeaknessFromFire(){
        return 0.5;
    }
    public double getWeaknessFromWater(){
        return 0.5;
    }
    public double getWeaknessFromGrass(){
        return 2;
    }
    public double getWeaknessFromElectric(){
        return 2;
    }
    public double getWeaknessFromGround(){
        return 1;
    }
    public double getWeaknessFromFlying(){
        return 1;
    }
    public double getWeaknessFromPsychic(){
        return 1;
    }
    public double getWeaknessFromBug(){
        return 1;
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
        return 0.5;
    }
    public double getWeaknessFromSteel(){
        return 0.5;
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
    public double getWeaknessFromPoison(){
        return 1;
    }
}

