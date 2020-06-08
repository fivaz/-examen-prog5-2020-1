package ch.hesge.algo.model;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Classe qui simule le lancer aléatoire d'une pièce.
 */
public class Coin {

    private static final Random random = new SecureRandom();

    public enum Flip {
        /** Face. */
        HEAD,
        /** Pile. */
        TAIL
    }

    /**
     * Lance la pièce.
     *
     * @return 50% du temps Flip.HEAD, 50% du temps Flip.TAIL
     */
    public Flip flip() {
        boolean bool = random.nextBoolean();
        if (bool) {
            return Flip.HEAD;
        }
        return Flip.TAIL;
    }
}
