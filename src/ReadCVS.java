import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadCVS {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadCVS obj = new ReadCVS();
		obj.run();
	}

	public void run() {
		//Comentario 
		String csvFile = "src/TERRASSA.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
	 
		try {
	 
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] agenda = line.split(cvsSplitBy);
	 
				System.out.println("Agenda [id= " + agenda[0] 
	                                 + " , acte=" + agenda[1] + "]");
	 
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
	  }
	
}
