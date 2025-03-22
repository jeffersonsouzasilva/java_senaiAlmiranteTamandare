package Abstracao;

//INTERFACE CORRESPONDE A UM CONTRATO QUE A CLASSE QUE FIZER USO DELA TERA A OBRIGAÇÃO QUE EXECUTAR O QUE ESTÁ DEFINIDO DENTRO DELA
public interface Pessoa {
    String getNome();
    void setNome(String nome);
    String getDocumento();
    void setDocumento(String documento);
}
