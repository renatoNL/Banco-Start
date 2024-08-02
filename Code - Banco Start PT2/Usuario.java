public class Usuario {
    
    public String nome;
    public int codigoConta; // colocar private dps //
    public long CPF;
    public long phone;
    public int nascimento;
    public double saldo;
    

    public Usuario(String nome, long CPF, long phone, int nascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.phone = phone;
        this.nascimento = nascimento;
        
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigoConta() {
        return codigoConta;
    }
    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }
    public long getCPF() {
        return CPF;
    }
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public int getNascimento() {
        return nascimento;
    }
    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }
    public Usuario(){

    }


}
