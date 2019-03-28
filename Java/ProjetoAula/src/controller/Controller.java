package controller;
import javax.swing.JOptionPane;

import model.Produtos;

public class Controller {
	Produtos prod1 = new Produtos("XIAOMI", "Importado");
	
	Produtos prod2 = new Produtos("XIAOMI", "Nacional", "REDMI 4x", "Celular");
	public void cadastrar() {
				
		
		prod1.setModelo(JOptionPane.showInputDialog("Cadastro de Importados\n"
				+ "Digite o modelo"));
		prod1.setDataFabricacao(JOptionPane.showInputDialog("Cadastro de Importados\n"
				+ "Data de fabricação?"));
		prod1.setQtdTotal(Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Importados\n"
				+ "Quantidade")));
		prod1.setTipo(JOptionPane.showInputDialog("Cadastro de Importados\n"
				+ "Tipo?"));
		prod1.setValor(Float.parseFloat(JOptionPane.showInputDialog("Cadastro de Importados\n"
				+ "Valor?")));
		
		
		prod2.setDataFabricacao(JOptionPane.showInputDialog("Cadastro de Nacionais\n"
				+ "Data de fabricação?"));
		prod2.setQtdTotal(Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Nacionais\n"
				+ "Quantidade")));
		prod2.setValor(Float.parseFloat(JOptionPane.showInputDialog("Cadastro de Nacionais\n"
				+ "Valor?")));		
		
	}//fecha cadastrar	
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "Marca: " + prod1.marca +""
				+ "\nModelo: " + prod1.getModelo() + ""
						+ "\nData de Fabricação: " + prod1.getDataFabricacao() + ""
								+ "\nTipo: " + prod1.getTipo() + ""
										+ "\nOrigem: " + prod1.getOrigem() + ""
												+ "\nValor: " + prod1.getValor() + ""
														+ "\nQuantidade: " + prod1.getQtdTotal() + ""
																+ "\nQuantidade disponível: " + prod1.getQtdDisponivel(), "Importado", JOptionPane.INFORMATION_MESSAGE);
	}
}//fecha Controller
