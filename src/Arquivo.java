import java.io.IOException;
import java.io.RandomAccessFile;

public class Arquivo {
    RandomAccessFile arquivo;

    public Arquivo(String nomeArquivo) {
        try {
            this.arquivo = new RandomAccessFile(nomeArquivo,"rw");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void rewind (){
        try {
            arquivo.seek(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getLine(){
        try {
            return arquivo.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeLine(String line){
        try {
           arquivo.writeBytes(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean eof (){
        try {
            return arquivo.getFilePointer()==arquivo.length();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
