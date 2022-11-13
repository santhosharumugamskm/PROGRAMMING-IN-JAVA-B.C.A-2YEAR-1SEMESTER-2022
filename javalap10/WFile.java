package javalap10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class WFile
{
public static void main(String[] args)
{
BufferedWriter bufferedWriter = null;
try
{
final String strContent = "This example shows how to write string content to a file. Hi! Welcome to II B.C.A";
File myFile = new File("File.txt");
if (!myFile.exists())
{
myFile.createNewFile();
}Writer writer = new FileWriter(myFile);
bufferedWriter = new BufferedWriter(writer);
bufferedWriter.write(strContent);
System.out.println("Contents Written to the File Successfully");
}
catch (IOException e)
{
e.printStackTrace();
}
finally
{
try
{
if(bufferedWriter != null) bufferedWriter.close();
}
catch(Exception ex)
{
}
}
}
}