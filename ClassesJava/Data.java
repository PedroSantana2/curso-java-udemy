public class Data {

    long dia;
    long mes;
    long ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;

    }

    Data(long diaRecebido, long mesRecebido, long anoRecebido) {
        dia = diaRecebido;
        mes = mesRecebido;
        ano = anoRecebido;

    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);

    }
    
}
