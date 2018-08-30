package pucrs;


public class App {

	public static void main(String[] args) {

	}
	public static String Soma (int cor){
	    if (cor == 1){
            return "RED";
        }else if(cor == 2){
            return"Yellow";
        }else if(cor ==3 ){
            return "Blue";
        }else if(cor ==4){
            return "Violet";
        }else{
            return "Cor nao encontrada. Tente novamente mais tarde.";
        }

    }

    public static String situacao(double media,boolean temg2){

	    if (media >= 0 && media <= 10.0) {
            if (temg2) {
                if (media >= 7.0) {
                    return "Aprovado";
                } else if (media >= 4.0 && media < 7.0) {
                    return "G2";
                } else {
                    return"Reprovado";
                }
            } else if (media >= 5.0) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }else {
             return "Erro, média inexistente.";
        }

    }

}
