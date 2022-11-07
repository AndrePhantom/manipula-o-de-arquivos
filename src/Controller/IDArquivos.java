package Controller;

import java.io.IOException;

public interface IDArquivos {
	public void readDir(String path) throws IOException;
	public void createFile(String path, String name, String typeFile) throws IOException;
	public void readFile(String path, String name, String typeFile) throws IOException;
	public void openFile(String path, String name, String typeFile) throws IOException;


}