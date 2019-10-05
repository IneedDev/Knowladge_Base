package java.main.com.patterns.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Reader fileReader = new FileReader("C:/text");
        fileReader.read();

        System.out.println("-------------------");
        Reader fileReader2 = new CompressedFileReader(fileReader);
        fileReader2.read();

        System.out.println("-------------------");
        Reader fileReader3 = new EncryptedFileReader(fileReader2);
        fileReader3.read();


        System.out.println("-------------------" + "\n");
        System.out.println("Object Wrapping");
        Reader encryptedFileReader =
                new EncryptedFileReader(
                        new CompressedFileReader(
                                new FileReader("C://test/filepath")
                        )
                );

        encryptedFileReader.read();
    }
}
