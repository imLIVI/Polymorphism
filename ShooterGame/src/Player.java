import com.weapon.lipatnikova.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new Gun("Gun"),
                new WaterGun("WaterGun"),
                new AutoWeapon("AutoWeapon"),
                new RGP("RGP"),
                new Slingshot("Slingshot")
        };
    }

    public void getListOfWeapons() {
        for (int i = 0; i < weaponSlots.length; i++) {
            System.out.println(i + " - " + weaponSlots[i].getName());
        }
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot < 0 || slot > weaponSlots.length - 1) {
            System.out.println("ERROR! Введено некорректное значение слота!");
        } else {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }
    }
}
