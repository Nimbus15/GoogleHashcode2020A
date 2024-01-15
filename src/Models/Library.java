package Models;

import java.util.HashMap;

public class Library {
    private int libraryId;
    private int signUpDays=0;
    private int booksPerDays =0;
    private int countOfBooks =0;
    private int bookIDsScanned =0;
    private int totalScannedScore =0; // For the maximum score we can get
    HashMap<Integer, String> bookObjects = new HashMap<>();


    public Library() {

    }

    public Library(int libraryId, int bookIDsScanned, int countOfBooks, int signUpDays, int booksPerDays, int totalScannedScore, HashMap<Integer, String> bookObjects) {
        this.libraryId = libraryId;
        this.bookIDsScanned = bookIDsScanned;
        this.countOfBooks = countOfBooks;
        this.signUpDays = signUpDays;
        this.booksPerDays = booksPerDays;
        this.totalScannedScore = totalScannedScore;
        this.bookObjects = bookObjects;
    }

    public int getTotalScannedScore() {
        return totalScannedScore;
    }

    public void setTotalScannedScore(int totalScannedScore) {
        this.totalScannedScore = totalScannedScore;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }

    public int getSignUpDays() {
        return signUpDays;
    }

    public void setSignUpDays(int signUpDays) {
        this.signUpDays = signUpDays;
    }

    public int getBooksPerDays() {
        return booksPerDays;
    }

    public void setBooksPerDays(int booksPerDays) {
        this.booksPerDays = booksPerDays;
    }

    public HashMap<Integer, String> getBookObjects() {
        return bookObjects;
    }


    public void setBookObjects(HashMap<Integer, String> bookObjects) {//TODO: I think we need to track the book and its score
        this.bookObjects = bookObjects;
    }

    public int getTotalPossibleScannedScore() {
        return totalScannedScore;
    }

    public void setTotalPossibleScannedScore(int totalPossibleScannedScore) {
        this.totalScannedScore = totalPossibleScannedScore;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public int getBookIDsScanned() {
        return bookIDsScanned;
    }

    public void setBookIDsScanned(int bookIDsScanned) {
        this.bookIDsScanned = bookIDsScanned;
    }
}