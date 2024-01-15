import Models.Library;
import Models.OverallDetails;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryData {
    private ArrayList<Library> totalLibraries = new ArrayList<>();

    private HashMap<Integer, String> totalPossibleBooks = new HashMap<>();

    private HashMap<Integer, String> tempBookObjects = new HashMap<Integer, String>();
    private OverallDetails overallDetails = new OverallDetails();


    public ArrayList<Library> getTotalLibraries() {
        return totalLibraries;
    }

    public void setTotalLibraries(ArrayList<Library> totalLibraries) {
        this.totalLibraries = totalLibraries;
    }

    public HashMap<Integer, String> getTotalPossibleBooks() {
        return totalPossibleBooks;
    }

    public void setTotalPossibleBooks(HashMap<Integer, String> totalPossibleBooks) {
        this.totalPossibleBooks = totalPossibleBooks;
    }

    public HashMap<Integer, String> getTempBookObjects() {
        return tempBookObjects;
    }

    public void setTempBookObjects(HashMap<Integer, String> tempBookObjects) {
        this.tempBookObjects = tempBookObjects;
    }

    public OverallDetails getOverallDetails() {
        return overallDetails;
    }

    public void setOverallDetails(OverallDetails overallDetails) {
        this.overallDetails = overallDetails;
    }
}
