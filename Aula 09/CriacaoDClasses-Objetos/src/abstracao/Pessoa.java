package abstracao;

/*
1.
Abrir o IntelliJ.
Clicar com o botão direito em src, New, Package
Nome do Package: abstração
Depois de criar o package, vamos começar com os códigos.
O primeiro código que vamos criar é uma Interface.
Clicar com o botão direito no package abstracao, New, Class, e escolher Interface, e o nome da Interface é Pessoa

 */


public interface Pessoa {
    String getNome();
    void setNome(String nome);
    String getDocumento();
    void setDocumento(String documento);
}
