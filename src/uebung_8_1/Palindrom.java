package uebung_8_1;

import javax.swing.JOptionPane;

public class Palindrom {

	public static void main(String[] args) {

		String eingabe = JOptionPane
				.showInputDialog("Bitte geben Sie ein Wort ein, um zu prüfen ob es sich um ein Palindrom handelt.");
		
		String eingabe1 = eingabe.toLowerCase();
		int laenge = eingabe1.length();
		boolean check = true;

		for (int x = 0; x < laenge; x++) {

			String a = eingabe1.substring(x, x + 1);
			String b = eingabe1.substring((laenge - 1 - x), (laenge - x));

			if (!a.equals(b)) {
				check = false;
				break;
			}
		}

		if (check) {
			JOptionPane.showMessageDialog(null, "Das eingegebene Wort " + eingabe + " ist ein Palindrom!");
		} else {
			JOptionPane.showMessageDialog(null, "Das eingegebene Wort " + eingabe + " ist kein Palindrom!");
		}

	}

}
