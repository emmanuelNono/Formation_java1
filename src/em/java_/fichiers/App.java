package em.java_.fichiers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("------------------   create folder    -------------------------- ");
		File folder = new File("C://Users/ME/Desktop/folder1/");
		folder.mkdir();
		
		System.out.println("------------------  write into file  -------------------------- ");
		File file = new File("C://Users/ME/Desktop/index.html");		//declaration file
		
		if(!file.exists()) {			//we make sure that file not exit
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			List<String> htmlLines = Arrays.asList("<html>","<head>","<title>Mon titre</title>","</head>","<body>","<p>Halo it me</p>","</body>","</html>");
			
			try {
				FileWriter writer = new FileWriter(file);		//create FileWriter with arg file;
				BufferedWriter bw = new BufferedWriter(writer);	//create BufferedWriter to read, to write in file
				
				for (String line : htmlLines) {
					bw.write(line);
					bw.newLine();
				}
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("------------------  read into file  -------------------------- ");
		
		if (!file.exists()) {			// create file if it not exist
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			
			try {
				BufferedReader breader =new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
				String line = breader.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = breader.readLine();
				}
				breader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		System.out.println("------------------  Copy and paste file -------------------------- ");
		
		File fileSource = new File("C://Users/ME/Desktop/index.html");
		File fileDest = new File("C://Users/ME/Desktop/folder1/" + fileSource.getName());
		
		try {
			Files.copy(fileSource.toPath(), fileDest.toPath(), StandardCopyOption.REPLACE_EXISTING);//replace file existing
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fileSource.delete();			// erase source file;	
	}

}
