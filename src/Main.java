import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class Main {
	
	public static void main( String[] args ) {

		String ligne;
		BufferedReader ficLecture;
		Path chemin = Paths.get("commandesAPasser.txt");
		
		String cheminAbsolu = chemin.toAbsolutePath().toString();
		
		System.out.println(cheminAbsolu);
		
		try { 
			
			ficLecture = new BufferedReader(new FileReader(cheminAbsolu));
			
			ligne = ficLecture.readLine();
					while ( !( ligne = ficLecture.readLine() ).equals("Plats :")) {
						System.out.println(ligne);
						
					}
					
					while ( !( ligne = ficLecture.readLine() ).equals("Commandes :")) {
						System.out.println(ligne);
					}
					while ( !( ligne = ficLecture.readLine() ).equals("Fin")) {
						System.out.println(ligne);
					}
			
		} 
		catch ( IOException err) {
			
			System.out.println(err);
		}
		

		
		
	}
	
	
}