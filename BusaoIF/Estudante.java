public class Estudante {
    private String nome;
    private String cpf;
    private String matricula;
    private String curso;
    private String endereco;
    private String turno;

    public Estudante(String nome, String cpf, String matricula, String curso, String endereco, String turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        this.endereco = endereco;
        this.turno = turno;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ", Matrícula: " + matricula + ", Curso: " + curso + ", Turno: " + turno + ")";
    }
}