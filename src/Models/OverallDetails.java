package Models;

import java.util.ArrayList;
import java.util.HashMap;

public class OverallDetails {
    private int totalNumOfBooks = 0;
    private int totalNumOfLibs = 0;
    private int totalNumOfDays = 0;

    private ArrayList<Library> libraryRankings = new ArrayList<>();
    private HashMap<Integer, String> totalPossibleBooks = new HashMap<>();

    public int getTotalNumOfBooks() {
        return totalNumOfBooks;
    }

    public void setTotalNumOfBooks(int totalNumOfBooks) {
        this.totalNumOfBooks = totalNumOfBooks;
    }

    public int getTotalNumOfLibs() {
        return totalNumOfLibs;
    }

    public void setTotalNumOfLibs(int totalNumOfLibs) {
        this.totalNumOfLibs = totalNumOfLibs;
    }

    public int getTotalNumOfDays() {
        return totalNumOfDays;
    }

    public void setTotalNumOfDays(int totalNumOfDays) {
        this.totalNumOfDays = totalNumOfDays;
    }

    public ArrayList<Library> getLibraryRankings() {
        return libraryRankings;
    }

    public void setLibraryRankings(ArrayList<Library> libraryRankings) {
        this.libraryRankings = libraryRankings;
    }

    public HashMap<Integer, String> getTotalPossibleBooks() {
        return totalPossibleBooks;
    }

    public void setTotalPossibleBooks(HashMap<Integer, String> totalPossibleBooks) {
        this.totalPossibleBooks = totalPossibleBooks;
    }
}
