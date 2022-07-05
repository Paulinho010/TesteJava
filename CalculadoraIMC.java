package teste.aula_junit;

public class CalculadoraIMC {

    private double imc;

    public String calcularImc (double peso, double altura, int idade, String sexo) {

        String retorno "";
        imc = peso / (altura*altura);

        //caso seja criança
        if (idade <= 20)
        {
            retorno = "";
            if (sexo.equals("masculino"))
            {
                if (imc < 5.0) {
                    retorno = "Baixo peso";
                }
                else if (imc > 5.1 && imc < 85.0){
                    retorno = "Peso normal";
                }
                else if (imc > 85.1 && imc < 95.0){
                    retorno = "Sobrepeso";
                }
                else if (imc > 95.0){
                    retorno = "Obesidade";
                }

            }
            if (sexo.equals("feminino"))
            {
                if (imc < 5.0) {
                    retorno = "Baixo peso";
                }
                else if (imc > 5.1 && imc < 85.0){
                    retorno = "Peso normal";
                }
                else if (imc > 85.1 && imc < 95.0){
                    retorno = "Peso normal";
                }
                else if (imc > 95.0){
                    retorno = "Peso normal";
                }
        }
        //Caso seja adulto
        else if (idade > 20 && idade <= 65)
        {
            if (imc < 15.9){
                retorno = "Baixo peso muito grave";
            }
            if (imc > 16.00 && imc < 16.9){
                retorno = "Baixo peso grave";
            }
            if (imc > 17.00 && imc < 18.4){
                retorno = "Baixo peso";
            }
            if (imc > 18.50 && imc < 24.9){
                retorno = "Peso normal";
            }
            if (imc > 25 && imc < 29.9){
                retorno = "Sobrepeso";
            }
            if (imc > 30 && imc < 34.9){
                retorno = "Obesidade grau 1";
            }
            if (imc > 35 && imc < 39.9){
                retorno = "Obesidade grau 1";
            }
            if (imc > 40 ){
                retorno = "Obesidade grau 3 (Obesidade Mórbida)";
            }
        }

        //Caso seja idoso
        if (idade > 65)
        {
            if (sexo.equals("masculino"))
            {
                if (imc < 21.9) {
                    retorno = "Baixo peso";
                }
                else if (imc > 22 && imc < 27 ){
                    retorno = "Peso normal";
                }
                else if (imc > 27.1 && imc < 32 ){
                    retorno = "Sobrepeso";
                }
                if (imc > 32.1 && imc < 37 ){
                retorno = "Obesidade grau 1";
                }
                if (imc > 37.1 && imc < 41.9){
                    retorno = "Obesidade grau 2";
                }
                if (imc > 42 ){
                    retorno = "Obesidade grau 3 (Obesidade Mórbida)";
                }
            }

            if (sexo.equals("feminino"))
            {
                if (imc < 21.9) {
                    retorno = "Baixo peso";
                }
                else if (imc > 22 && imc < 27 ){
                    retorno = "Peso normal";
                }
                else if (imc > 27.1 && imc < 30 ){
                    retorno = "Sobrepeso";
                }
                if (imc > 30.1 && imc < 35 ){
                retorno = "Obesidade grau 1";
                }
                if (imc > 35.1 && imc < 39.9){
                    retorno = "Obesidade grau 2";
                }
                if (imc > 40 ){
                    retorno = "Obesidade grau 3 (Obesidade Mórbida)";
                }
            }
        }else{
            retorno = "valor invalido";
        }
        return retorno;
    }
}
