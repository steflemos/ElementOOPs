public class BattleMenu {
    public static void displayMenuOptions() {
        System.out.println("--------------------------------------");
        System.out.println("|          Escolha uma ação:         |");
        System.out.println("--------------------------------------");
        System.out.println("|        1. Ataque Físico            |");
        System.out.println("|        2. Ataque Elemental         |");
        System.out.println("|        3. Sair do programa         |");
        System.out.print("--------------------------------------\n");
    }


    public static void displayScore(Creatures playerSelectedCreature, Creatures computerSelectedCreature) {
        System.out.println(playerSelectedCreature.getName() + " \nPontos de vida: " + playerSelectedCreature.getLifePoints() + "\n" +
                           computerSelectedCreature.getName() + " \nPontos de vida: " + computerSelectedCreature.getLifePoints() + "\n");
    }
}
