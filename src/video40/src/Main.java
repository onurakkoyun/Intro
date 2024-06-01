public class Main {
    public static void main(String[] args) throws Exception {
        WomanCalculator womanGameCalculator = new WomanCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        // Ugly way to create an object of an abstract class
        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void calculate() {
                System.out.println("Your score: 200");
            }
        };

        GameCalculator gameCalculator2 = new WomanCalculator();
    }
    
}
