import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        //Выводим список оружия игрока
        player.getListOfWeapons();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot = 0;

        while (slot != -1) {
            slot = scanner.nextInt();
            player.shotWithWeapon(slot);
        }

        System.out.println("Game over!");
    }
}
