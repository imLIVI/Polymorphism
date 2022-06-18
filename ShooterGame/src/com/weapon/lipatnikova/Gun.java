package com.weapon.lipatnikova;

public class Gun extends Weapon {

    public Gun(String typeOfWeapon) {
        super(typeOfWeapon);
    }

    @Override
    public void shot() {
        System.out.println("gunshot-gunshot!");
    }
}
