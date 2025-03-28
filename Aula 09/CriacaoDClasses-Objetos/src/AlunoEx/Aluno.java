package AlunoEx;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: O nome não pode estar vazio.");
        } else {
            this.nome = nome;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if ("0".equals(matricula)) {
            System.out.println("Erro: Matrícula inválida.");
        } else {
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}


