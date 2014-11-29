package ThinkInJavaExample.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompress
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis=new FileInputStream("E:\\_textInputMap.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream("E:\\test.gz"))));
		System.out.println("writing file");
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			bw.write(str);
		}
		
		br.close();
		bw.close();
		
		System.out.println("Reading file");
		
		BufferedReader brTwo=new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("E:\\test.gz"))));
		
		String s;
		
		while((s=brTwo.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}

}
