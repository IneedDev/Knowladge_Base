package java.main.com.patterns.decorator;

public class EncryptedFileReader extends ReadDecorator {

    public EncryptedFileReader(Reader reader) {
        super(reader);
    }

    public void read(){
        System.out.println("Encrypting file ");
        this.reader.read();
    }
}
