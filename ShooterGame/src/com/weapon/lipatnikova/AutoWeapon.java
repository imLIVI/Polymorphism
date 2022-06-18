package com.weapon.lipatnikova;

public class AutoWeapon extends Weapon {

    public AutoWeapon(String typeOfWeapon) {
        super(typeOfWeapon);
    }

    @Override
    public void shot() {
        System.out.println("autoshot-autoshot!");
    }
}
