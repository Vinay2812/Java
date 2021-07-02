package vinay;
//import javax.swing.*;
import java.io.*;
//JFileChooser(File currentDirectory.path)
/*
 getFile
 
 File Reader/Writer 
 
 1.File reader ->to read data and returns data in byte
 Constructors -
     FileReader(String file) //if not exists...exception not exists
     FileReader(File file)
     
Methods - 
     int read() : return character in ascii form and -1 for end of file
     void close() : close file reader class
     
2.File writer

	Methods - 
	void write(String text) : write string in file writer
	void write(char c) : write char in file
	void write (char[] c) : writes char array in file
	void flush() : use to flush data to filewriter
	void close() : to close file
 */
public class JFileChooserExample {

	public static void main(String[] args) throws IOException {
		//file reader
		/*
		FileReader fr = new FileReader("example.txt"); 
		int c;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		fr.close();*/
		
		//file writer
		FileWriter fw = new FileWriter("example1.txt",true);
		String s="Hello World";
		fw.write(s);
		
		fw.close();
	}

}
