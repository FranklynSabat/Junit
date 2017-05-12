package TO;

public class ContaTO {
	
	
	 private int idConta;
	    private int agencia;
	    private int senha;
	    private int codigo_Acesso;
	    private double saldo;
	    private int Cliente_idCliente;
	 
	   

	    public void setIdConta(int id) {
	        this.idConta = id;
	    }

	    public void setAgencia(int a) {
	        this.agencia = a;
	    }

	    public void setSenha(int s) {
	        this.senha = s;
	    }

	   public void setIdCliente(int s) {
	        this.Cliente_idCliente = s;
	    }
	    public void setCodigo(int cod) {
	        this.codigo_Acesso = cod;
	    }

	    public void setSaldo(double s) {
	        this.saldo = s;
	    }

	    public int getIdConta() {
	        return this.idConta;
	    }

	    public int getAgencia() {
	        return this.agencia;
	    }

	    public int getSenha() {
	        return this.senha;
	    }

	    public int getIdCliente(){
	      return Cliente_idCliente;
	    }
	    public int getCodigo() {
	        return this.codigo_Acesso;
	    }

	    public double getSaldo() {
	        return this.saldo;
	    }
	

}
