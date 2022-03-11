import java.util.Arrays;

public class Circulo {
    private float raio;
    private float x;
    private float y;

    Circulo(float raio, float x, float y) throws Exception{
        if(raio > 0){
            this.raio = raio;
        }else{
            throw new Exception("O valor do raio deve ser positivo.\n");
        }
        this.x = x;
        this.y = y;
    }

    public void aumentarRaio(float percentual){
        this.raio = (raio * percentual/100) + raio;
    }

    public void definirCentro(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void mostrarAreaCirculo(){
        System.out.format("A área do círculo é: %.2f\n",getArea());
    }

    public String getXY(){
        float [] vetor = new float[2];
        vetor[0] = this.x;
        vetor[1] = this.y;
        return Arrays.toString(vetor);
    }

    private double getArea(){
        double area = Math.PI * raio * raio;
        return area;
    }

    private double getComprimento(){
        double comprimento = 2 * Math.PI * raio;

        return comprimento;
    }

    public void mostrarComprimentoCircunferencia(){
        System.out.format("O comprimento da circunferência é: %.2f\n", getComprimento());
    }

    public float getRaio(){
        return raio;
    }
    public void getCentro(){
        System.out.format("O centro da circunferência é: %s\n", getXY());
    }

    public void setRaio(float raio) throws Exception{
        if(raio > 0){
            this.raio = raio;
        }else{
            throw new Exception("O valor do raio deve ser positivo.\n");
        }
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    
}
