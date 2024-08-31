import java.util.Random;

public class SerieLimitada {
    private static final int maxInstances= 3;
    private static int count = 0;
    private int numSerie;

    private SerieLimitada(int numeroSerie) {
        this.numSerie = numeroSerie;
    }

    public static SerieLimitada criarInstancia() {
        if (count < maxInstances) {
            Random random = new Random();
            int numSerie = random.nextInt(100000);
            count++;
            return new SerieLimitada(numSerie);
        } else {
            System.out.println("Número máximos de instâncias!!!");
            return null;
        }
    }

    public int getNumeroSerie() {
        return numSerie;
    }
}
