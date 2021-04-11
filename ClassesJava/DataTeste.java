package ClassesJava;

public class DataTeste {

    public static void main(String[] args) {
        
        Data data1 = new Data();
        data1.dia = 28;
        data1.mes = 1;
        data1.ano = 2021;

        Data data2 = new Data();
        data2.dia = 1;
        data2.mes = 1;
        data2.ano = 2021;

        System.out.println(data2.obterDataFormatada());
    
    }

}
