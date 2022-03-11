import java.io.IOException;

public class App {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {
        limparTela();
        Circulo circulo = new Circulo(1,2,3);
        circulo.aumentarRaio(50);
        circulo.definirCentro(0, 0);
        circulo.getCentro();
        circulo.mostrarAreaCirculo();
        circulo.mostrarComprimentoCircunferencia();
        circulo.setXY(1, 2);
        System.out.println(circulo.getXY());
    }
}
