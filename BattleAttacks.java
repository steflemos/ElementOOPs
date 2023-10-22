public class BattleAttacks {
    private int dano;

    public BattleAttacks() {
    }

    // metodo de ataque fisico
    public void playerAttackFisical(Creatures playerSelectedCreature, Creatures computerSelectedCreature) {
        dano = (int) (playerSelectedCreature.getPower() * playerSelectedCreature.getAttack()
                / computerSelectedCreature.getDefense());
        System.out.println(
                playerSelectedCreature.getName() + " lança um ataque físico e diminui "
                        + dano + " pontos de vida de " + computerSelectedCreature.getName() + "\n");
        computerSelectedCreature.setLifePoints(computerSelectedCreature.getLifePoints() - dano);
    }

    // metodo de ataque elemental
    public void playerAttackElemental(Creatures playerSelectedCreature, Creatures computerSelectedCreature) {
        dano = (int) (playerSelectedCreature.getPower() * playerSelectedCreature.getAttack()
                / computerSelectedCreature.getDefense()
                * getFactor(playerSelectedCreature, computerSelectedCreature));
        System.out.println("\n" + playerSelectedCreature.elementAttackPhrase() + "\n"
                + playerSelectedCreature.getName() + " ataca elementalmente com fogo e causa "
                + dano + " de dano em " + computerSelectedCreature.getName() + "\n");
        computerSelectedCreature.setLifePoints(computerSelectedCreature.getLifePoints() - dano);
    }

    // metodo usado para o computador atacar aleatoriamente entre ataque elemental
    // ou ataque fisico
    public void computerAttack(Creatures playerSelectedCreature, Creatures computerSelectedCreature) {
        int escolhaComputador = (int) (Math.random() * 2) + 1;
        if (escolhaComputador == 1) {
            int dano = (int) (computerSelectedCreature.getPower() * computerSelectedCreature.getAttack()
                    / playerSelectedCreature.getDefense());
            System.out.println(computerSelectedCreature.getName() + " lança um ataque físico e diminui " + dano
                    + " pontos de vida de " + playerSelectedCreature.getName() + "\n");
            playerSelectedCreature.setLifePoints(playerSelectedCreature.getLifePoints() - dano);
        } else {
            int dano = (int) (computerSelectedCreature.getPower() * computerSelectedCreature.getAttack()
                    / playerSelectedCreature.getDefense()
                    * getFactor(computerSelectedCreature, playerSelectedCreature));
            System.out.println("\n" + computerSelectedCreature.elementAttackPhrase() + "\n"
                    + computerSelectedCreature.getName() + " ataca elementalmente e causa " + dano
                    + " de dano em " + playerSelectedCreature.getName() + "\n");
            playerSelectedCreature.setLifePoints(playerSelectedCreature.getLifePoints() - dano);
        }
    }

    // matriz de cruzamento
    private float getFactor(Creatures player, Creatures eneemy) {

        // se o jogador escolher terra
        if (player.getCode() == 14 && eneemy.getCode() == 87) {
            return 2.0F;

        } else if (player.getCode() == 14 && eneemy.getCode() == 65) {
            return 1.0F;

        } else if (player.getCode() == 14 && eneemy.getCode() == 19) {
            return 1.0F;

        }

        // se o jogador escolher agua
        if (player.getCode() == 87 && eneemy.getCode() == 14) {
            return 1.0F;

        } else if (player.getCode() == 87 && eneemy.getCode() == 65) {
            return 2.0F;

        } else if (player.getCode() == 87 && eneemy.getCode() == 19) {
            return 1.0F;

        }

        // se o jogador escolher fogo
        if (player.getCode() == 65 && eneemy.getCode() == 14) {
            return 1.0F;

        } else if (player.getCode() == 65 && eneemy.getCode() == 87) {
            return 1.0F;

        } else if (player.getCode() == 65 && eneemy.getCode() == 19) {
            return 2.0F;
        }

        // se o jogador escolher ar
        if (player.getCode() == 19 && eneemy.getCode() == 14) {
            return 2.0F;

        } else if (player.getCode() == 19 && eneemy.getCode() == 87) {
            return 1.0F;

        } else if (player.getCode() == 19 && eneemy.getCode() == 65) {
            return 1.0F;

        } else {
            return 0.0F;
        }
    }

} // fim da classe battleattacks
