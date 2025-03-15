package CalculeIMC;

public class Pessoa {
    private String nome;
    private String idade;
    private double peso;
    private double altura;
    private double imc;


    public Pessoa(String nome, String idade, double peso, double altura, double imc) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }


    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


//    public void calcularIMC(){
//        imc = peso/(altura*altura);
//        System.out.println("Nome: " + nome + ", " + "Idade: " + idade +", " + "IMC: " + imc);
//    }

    public static double calcularIMC (double peso, double altura){
        return  peso/(altura*altura);
    }




}
