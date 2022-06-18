package com.weapon.lipatnikova;

public class WaterGun extends Weapon {

    public WaterGun(String typeOfWeapon) {
        super(typeOfWeapon);
    }

    @Override
    public void shot() {
        System.out.println("watershot-watershot!");
    }
}
