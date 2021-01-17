package exception2_4;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class Main {

	public static String readFile(File file, String encoding) {
		try {
			return new String(Files.readAllBytes(file.toPath()), encoding);
		}catch(NoSuchFileException | UnsupportedEncodingException e){
			System.out.println("ファイルが見つからないかエンコーディングが不正です");
			return "";
		}catch(IOException e) {
			System.out.println("ファイルの読み込みに失敗しました" + file);
			return "";
		}
	}

	public static void main(String[] args) {
		System.out.println("テスト1:" + readFile(new File("file1.txt"),"utf -8"));
		System.out.println("テスト2:" + readFile(new File("file2.txt"),"utf -8"));
		System.out.println("テスト3:" + readFile(new File("file1.txt"),"unknown"));
	}

}

//参考URL　https://codeprep.jp/books/98/chapters/2/sections/4
