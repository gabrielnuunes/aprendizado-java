package academy.roadjava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    
    public static void main(String[] args) {
        
        // Minha resolução
        String nome = "Gabriel";
        String endereco = "Qualquer";
        double salario = 1000.00;
        String data = "18/09/2023";

        System.out.println(
                "Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>");
        System.out.printf(
                "Eu %s, morando no endereço %s, confirmo que recebi o salário de %.2f, na data %s.",
                nome, endereco, salario, data);
        
        // Resolução do professor

        String name = "Kirito";
        String adress = "Av Joao das galileias";
        double salary = 5431.12;
        String dataRecebimentoSalario = "20/12/2021";
        String relatorio = "Eu "+name+" morando no endereço "+adress+" confirmo que recebi o salário de "+salary+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }

}
