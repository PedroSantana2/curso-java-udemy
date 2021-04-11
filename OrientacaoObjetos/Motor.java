package OrientacaoObjetos;

public class Motor {
    
    boolean ligado;
    double fatorInjecao = 1;

    int giros() {
        if(ligado) {
            return (int) Math.round(fatorInjecao * 3000);

        } else {
            return 0;

        }

    }
    
}
