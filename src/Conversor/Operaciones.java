package Conversor;

import javax.swing.JOptionPane;

public class Operaciones {

	public static void main(String[] args) {
		byte opcion = 0;

		do {
			opcion = Byte.parseByte(JOptionPane.showInputDialog("M E N U   P R I N C I P A L"
					+ "\nEl tipo de cambio usuado de las diferentes monedas se calculo en promedio..."
					+ "\n1. Peso Mexicano --> Dolar:" + "\n2. Peso Mexicano --> Euro:"
					+ "\n3. Peso Mexicano --> Libras Esterlinas:" + "\n4. Peso Mexicano --> Yen Japones:"
					+ "\n5. Peso Mexicano --> Won Sur Coreano:" + "\n0. Salir:" + "\nSelecciona una Opcion..."));
			float importe=0;
			double dolar = 18.50;
			double euro = 19.30;
			double libraEsterlina = 22.50;
			double yenJapones = 0.50;
			double wonSurCoreano = 0.20;
			
			switch (opcion) {
			case 1:
				//dolar();
				importe = Float.parseFloat(JOptionPane.showInputDialog("Digite el Importe a cambiar"));
				double tc = importe / dolar;
				JOptionPane.showMessageDialog(null, "El Importe es:  "+ tc);
				break;
			case 2:
				// euro();
				importe = Float.parseFloat(JOptionPane.showInputDialog("Digite el Importe a cambiar"));
				double tce = (double)importe / euro;
				JOptionPane.showMessageDialog(null, "El Importe es:  "+ tce);
			case 3:
				// libraEsterlina();
				importe = Float.parseFloat(JOptionPane.showInputDialog("Digite el Importe a cambiar"));
				double tcl = (double)importe / libraEsterlina;
				JOptionPane.showMessageDialog(null, "El Importe es:  "+ tcl);
				break;
			case 4:
				// yenJapones();
				importe = Float.parseFloat(JOptionPane.showInputDialog("Digite el Importe a cambiar"));
				double tcy = (double)importe / yenJapones;
				JOptionPane.showMessageDialog(null, "El Importe es:  "+ tcy);
				break;
			case 5:
				// wonSurCoreano();
				importe = Float.parseFloat(JOptionPane.showInputDialog("Digite el Importe a cambiar"));
				double tcw = (double)importe / wonSurCoreano;
				JOptionPane.showMessageDialog(null, "El Importe es:  "+ tcw);
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Elije la opcion correcta...");
				System.out.println();

			}
		} while (opcion != 0);
		System.exit(0);

	}

}
