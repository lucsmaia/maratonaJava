package academy.devdojo.maratonajava.introducao;
/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagemn:

Eu <nome>, morando no endereco <endereco>, confirmo que recebi o salario de  <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args){
        String nome = "Lucas";
        String endereco = "Rua do Silva";
        String dataRecebimentoSalario = "01/01/2020";
        double salario = 5000.00;
        String relatorio = ("Eu "+nome+" morando no endereco "+endereco+ " confirmo que recebi o salario de "+salario+" na data "+ dataRecebimentoSalario);

        System.out.println (relatorio);

    }
}

