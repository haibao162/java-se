package javaio;
import java.io.*;
public class CopyFile {
public static void main(String[] args) throws IOException{
	FileInputStream fis=new FileInputStream("D:/JQuery/test.txt");
	File file=new File("D:/JQuery/test.txt");
	System.out.print(file.length());//4
	byte[] len=new byte[10000];
	int temp;
	FileOutputStream fos=new FileOutputStream("D:/test.txt");
    if((temp=fis.read(len))!=-1){
    	fos.write(len,0,temp);
    }   
    fos.flush();
    fos.close();
    fis.close();
}
}
//¸´ÖÆÎÄ¼þ¡£¡£