package com.weapon.lipatnikova;

public class Weapon {
    private String typeOfWeapon;

    public String getName() {
        return this.typeOfWeapon;
    }

    public void setName(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public Weapon(String typeOfWeapon) {
        setName(typeOfWeapon);
    }

    public void shot() {
        System.out.println("weap-weap!");
    }
}
