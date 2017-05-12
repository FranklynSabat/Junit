package factory;

	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	public class ConexaoFactory {
		
		private static String USUARIO ="root";
		private static String SENHA = "aluno";
		private static String URL = "jdbc:mysql://localhost:3306/Banco";
		
		
		
		public static Connection conectar()throws SQLException, ClassNotFoundException{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/Banco?user=root&password=aluno");
			return conexao;
		}
		
		public static void main(String[]args) throws ClassNotFoundException{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexao = ConexaoFactory.conectar();
				System.out.println("conexao ok");
			} catch (SQLException ex) {
				// TODO: handle exception
				System.out.println("nao conectou");
			}
			
		
		}

		public Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}
		
		}
