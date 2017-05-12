package service;

import dao.ContaDAO;
import model.*;


public class ContaServices {

	
	ContaDAO dao;

	public void Conta(Conta c) {
		dao= new ContaDAO();}

	public void criar(Conta c) {
		dao.incluir();}

	public void atualizar(Conta c) {
		dao.atualizar();}

	public void excluir(Conta c) { 
		dao.deletar();}

	
	
}

