package notas;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
	
		
		float nota;
		
		nota = Float.parseFloat(JOptionPane.showInputDialog("Digita la nota"));
		
		if(nota>=0 && nota<4) {
			JOptionPane.showConfirmDialog(null, "La nota es insuficiente");
		}
		else if(nota>=4 && nota<6) {
			JOptionPane.showConfirmDialog(null, "La nota es suficiente");
		}
		else if(nota>=6 && nota<8) {
			JOptionPane.showConfirmDialog(null, "La nota es bien");
		}
		else if(nota>=8 && nota<9) {
			JOptionPane.showConfirmDialog(null, "La nota es notable");
		}
		else if(nota>=9 && nota<=10) {
			JOptionPane.showConfirmDialog(null, "La nota es sobresaliente");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Digita una nota válida");
		}
	}

}
