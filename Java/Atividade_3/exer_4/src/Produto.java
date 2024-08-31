import java.util.Scanner;

public class Produto {
    Scanner ler = new Scanner(System.in);

    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto(String nome){
        lerNome(nome);
        lerPrecoCusto();
        lerPrecoVenda();
        calcularMargemLucro();
        lerMargemLucroPorcentagem();
    }

    public void lerNome(String nome){
        this.nome = nome;
    }

    public void lerPrecoCusto(){
        System.out.println("Qual o preço de custo do produto? ");
        double precoCusto = ler.nextDouble();
        this.precoCusto = precoCusto;
    }

    public void lerPrecoVenda(){
        System.out.println("Qual o preço de venda? ");
        double precoVenda = ler.nextDouble();
        if(precoVenda < precoCusto){
            System.out.println("Alerta! o preço de venda está inferior ao preço de custo");
        }
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto(){
        return this.precoCusto;
    }

    public double getPrecoVenda(){
        return this.precoVenda;
    }

    private void calcularMargemLucro(){
        double calculo = precoVenda - precoCusto;
        System.out.println("Margem de lucro R$: " + calculo);
    }

    private void lerMargemLucroPorcentagem(){
        double calculo = ((precoVenda - precoCusto)*100)/precoCusto;
        System.out.println("Percentual de lucro: " + calculo + "%");
    }
}
