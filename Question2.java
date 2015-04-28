import java.io.*;

public class Tet{
	public static void main(String[] args) throws IOException{
		FileReader Sour = new FileReader("Source.txt");
		BufferedReader bSour = new BufferedReader(Sour);
		FileWriter  fr_fw = new FileWriter("Dest.txt",true);
		BufferedWriter br_fw = new BufferedWriter(fr_fw);
		txtCopy(bSour, br_fw);
		editFile("Dest.txt");
		updateFile("Dest.txt");
		bSour.close();
		br_fw.close();
		
	}

	public static  void txtCopy(BufferedReader bSour,BufferedWriter br_fw)throws IOException{
		int i;
		while ((i = bSour.read()) != -1){
			br_fw.write(i);
	          
	}

	}
}

	


