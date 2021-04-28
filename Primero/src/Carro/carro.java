/**
 * 
 */
package Carro;

import javax.swing.JOptionPane;

/**
 * @author diogo
 *
 */
public class carro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String carros = JOptionPane.showInputDialog("informe a quantidade de carros");
		 String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas");
		 
		 double carroNumero = Double.parseDouble(carros);
		 double pessoasNumero = Double.parseDouble(pessoas);
		 
		 int divisao = (int) (carroNumero / pessoasNumero);
		 
		 double resto = carroNumero % pessoasNumero;
		 
		 JOptionPane.showMessageDialog(null, "divisao para pessoas deu " + divisao + "carros e soboru " + resto + " carros");
	}

}


