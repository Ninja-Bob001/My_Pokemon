package pokemon.type;

public interface Type {
    String getName();
    double getTypeEffectiveness(Type otherType);
    double getWeaknessFromFire();
    double getWeaknessFromWater();
    double getWeaknessFromGrass();
    double getWeaknessFromElectric();
    double getWeaknessFromGround();
    double getWeaknessFromFlying();
    double getWeaknessFromPsychic();
    double getWeaknessFromBug();
    double getWeaknessFromRock();
    double getWeaknessFromGhost();
    double getWeaknessFromDark();
    double getWeaknessFromFairy();
    double getWeaknessFromIce();
    double getWeaknessFromSteel();
    double getWeaknessFromDragon();
    double getWeaknessFromNormal();
    double getWeaknessFromFighting();
    double getWeaknessFromPoison();
}