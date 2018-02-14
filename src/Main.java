import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {

		String ligne;
		BufferedReader ficLecture;
		Path chemin = Paths.get("commandesAPasser.txt");

		String cheminAbsolu = chemin.toAbsolutePath().toString();

		System.out.println(cheminAbsolu);

		ArrayList<String> clients = new ArrayList<String>();
		Hashtable<String, Plats> plats = new Hashtable<String, Plats>();
		ArrayList<Commandes> commandes = new ArrayList<Commandes>();

		try {

			ficLecture = new BufferedReader(new FileReader(cheminAbsolu));

			ligne = ficLecture.readLine();
			while (!(ligne = ficLecture.readLine()).equals("Plats :")) {

				clients.add(ligne);
				System.out.println(ligne);

			}

			while (!(ligne = ficLecture.readLine()).equals("Commandes :")) {

				String[] ligneDiviser = ligne.split(" ");
				plats.put(ligneDiviser[0], new Plats(ligneDiviser[0], Double.parseDouble(ligneDiviser[1])));

				System.out.println(ligne);

			}
			while (!(ligne = ficLecture.readLine()).equals("Fin")) {

				String[] ligneDiviser = ligne.split(" ");

				if (ligneDiviser.length == 3) {

					try {
						
						if (!clients.contains(ligneDiviser[0])) {
							throw new Exception("Client non existant.");
						}
						
						commandes.add(new Commandes(ligneDiviser[0], plats.get(ligneDiviser[1]),
								Integer.parseInt(ligneDiviser[2])));
						
					} catch (Exception e) {
						
						ficLecture.close();
						throw new Exception("Le fichier ne respecte pas le format demandé !");
						
					}

				} else {
					
					ficLecture.close();
					throw new Exception("Le fichier ne respecte pas le format demandé !");

				}

				System.out.println(ligne);
			}

			ficLecture.close();

		} catch (Exception err) {

			System.out.println(err);

		}

	}

}