
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;  
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader; 
import java.io.BufferedReader;  
import java.net.URL;


public class IOstream {
	private String inStream;
	
	public String Readstream(){
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(ir);
		try{
			inStream = in.readLine();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		return inStream;
		
	}
	
	public void Writetofile(String pageContent){
		
		try{
			File file = new File("test.xml");
			if(!file.exists())
				file.createNewFile();
			FileWriter filewriter = new FileWriter(file.getName(),true);
			BufferedWriter bufferwriter = new BufferedWriter(filewriter);
			bufferwriter.write(pageContent);
			bufferwriter.close();
			System.out.println("Done!");
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
