public class Bizzbuzz {
    private int number = 1;

    public static void main(String[] args) {
        Bizzbuzz bizzbuzz = new Bizzbuzz();
        bizzbuzz.playBizzbuzz();
    }

    public void playBizzbuzz() {

        while (true) {
            if (ehDivisivelPorTres(number) && ehDivisivelPorCinco(number )) {
                System.out.println("bizzbuzz");
            }else if (ehDivisivelPorTres(number)) {
                System.out.println("bizz");
            } else if (ehDivisivelPorCinco(number)) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }

            number++;
        }
    }

    public boolean ehDivisivelPorTres(int number) {
        return number % 3 == 0;
    }

    public boolean ehDivisivelPorCinco(int number) {
        return number % 5 == 0;
    }
}
