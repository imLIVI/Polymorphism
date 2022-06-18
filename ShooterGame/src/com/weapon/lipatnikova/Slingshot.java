package com.weapon.lipatnikova;

public class Slingshot extends Weapon {

    public Slingshot(String typeOfWeapon) {
        super(typeOfWeapon);
    }

    @Override
    public void shot() {
        System.out.println("slingshot-slingshot!");
    }
}
