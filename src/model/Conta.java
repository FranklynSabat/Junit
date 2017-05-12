package model;



import java.sql.Connection;
import java.sql.PreparedStatement;

import factory.ConexaoFactory;

public class Conta {

    private int idConta;
    private int agencia;
    private int senha;
    private int codigo_Acesso;
    private double saldo;
    private int Cliente_idCliente;
    private PreparedStatement st;
    Connection conn;
    ConexaoFactory db;

    public Conta() {
        db = new ConexaoFactory ();
        conn = db.getConnection();

        setIdConta(0);
        setAgencia(0);
        setSenha(0);
        setCodigo(0);
        setSaldo(0.00);
    }

    public Conta(int id, int agencia, int senha, int codigo, double saldo) {
        setIdConta(id);
        setAgencia(agencia);
        setSenha(senha);
        setCodigo(codigo);
        setSaldo(saldo);
        db = new ConexaoFactory ();
        conn = db.getConnection();
    }

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

	public boolean deletar() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean incluir() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object consultarPorCodigo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public long depositar(int valor ){
		
		this.saldo = saldo + valor;
		return valor;
	
	}
	}