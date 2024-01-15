import java.io.IOException;

public class LibraryMain {
    final static String a_example_in = "data\\a_example.txt";
    final static String a_example_out = "output\\a_exampleOut.txt";

    static LibraryData _libraryData;
    static LibraryInput libraryInput;
    static LibrarySort librarySort;
    public static void main(String[] args) throws IOException {
        libraryInput = new LibraryInput();
        librarySort = new LibrarySort();


        _libraryData = libraryInput.parseInput(a_example_in);

    }
}
