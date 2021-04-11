package EstruturasDeControle;

public class BugIf {
    public static void main(String[] args) {
        double nota = 1.3;

        if(nota >= 9.0) { // O bug encontrado era o ponto e virgula localizado depois do valor booleano
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!"); 

        }

    }
    
}
 