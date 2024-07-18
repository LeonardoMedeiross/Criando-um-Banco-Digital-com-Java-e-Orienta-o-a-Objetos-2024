public class Cliente {
    private String Nome ;
    private String Cpf ;

    public Cliente(String nome, String cpf) {
        Nome = nome;
        Cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", Cpf='" + Cpf + '\'' +
                '}';
    }
}
