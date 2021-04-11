package OrientacaoObjetos;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.motor.ligado = true;
        c1.motor.fatorInjecao = 2;

        System.out.println(c1.motor.giros());

        c1.acelerar();
        System.out.println(c1.motor.giros());

    }
    
}
