import java.util.Random;


/**
 *
 */
public class CoinFlip {


    /**
     * @param argResult
     * @return
     */
    public static String coinSide(int argResult){
        return (argResult == 0) ? "Depan" : "Belakang";
    }
    public static void main(String[] args) {
        Random random = new Random();

        // Menghasilkan bilangan acak 0 atau 1 untuk merepresantiskan depan / belakang
        int result = random.nextInt(2);

        // Menampilkan hasil pelemparan koin
        System.out.println("Hasil : " + coinSide(result));
    }
}