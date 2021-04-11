package OrientacaoObjetos;

public class Carro {

    Motor motor = new Motor();
    Portas portas = new Portas();
    
    void acelerar() {
        if(!this.portas.aberta) {
            motor.fatorInjecao += 0.5;
        }

    }

    void frear() {
        motor.fatorInjecao -= 0.5;

    }
    
    void ligar() {
        motor.ligado = true;

    }
    
    void desligar() {
        motor.ligado = false;

    }

}
