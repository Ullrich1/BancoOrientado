public class Banco {
    private int numero;
    private int agenciaNumero;
    private String agenciaNome;
    private int tipo;
    private Double saldo;

    public Banco(int numero, int agenciaNumero, String agenciaNome, int tipo, Double saldo){
        this.numero = numero;
        this.agenciaNumero = agenciaNumero;
        this.agenciaNome = agenciaNome;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    public Banco(int numero, int agenciaNumero, String agenciaNome, int tipo){
        this.numero = numero;
        this.agenciaNumero = agenciaNumero;
        this.agenciaNome = agenciaNome;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    public  int getNumero(){
        return numero;
    }
    public int getAgenciaNumero(){
        return agenciaNumero;
    }
    public String getAgenciaNome(){
        return agenciaNome;
    }
    public void setAgenciaNome(String agenciaNome){
        this.agenciaNome = agenciaNome;
    }
    public int getTipo() {
        return tipo;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void creditar(float saldo){
        this.saldo += saldo;
    }
    public void debitar(float saldo){
        this.saldo -=saldo;
    }
    public String consultarSaldo(int numero){
        this.numero = numero;
        return "Conta "+numero+" com saldo de R$ "+saldo;
    }
    public int encerrarConta(){
        this.tipo = 4;
        return tipo;
    }
    public String textoEncerrar(){
        return "Conta "+numero+" do tipo "+tipo+" com saldo de R$ "+saldo+" foi encerrada com sucesso!";
    }
}
