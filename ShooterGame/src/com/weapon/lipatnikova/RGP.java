package com.weapon.lipatnikova;

public class RGP extends Weapon {

    public RGP(String typeOfWeapon) {
        super(typeOfWeapon);
    }

    @Override
    public void shot() {
        System.out.println("rgpshot-rgpshot!");
    }
}
