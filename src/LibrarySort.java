import Models.Library;

import java.util.Map;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class LibrarySort {

    LibraryData libraryData;
    public void sortData(LibraryData _libraryData) {
        libraryData = _libraryData;
        fillInLibraryInventory(libraryData);
        //sortBooksInEachLibrary(libraryData);
    }

    private void fillInLibraryInventory(LibraryData _libraryData){
        for(Library libraryRecord: _libraryData.getTotalLibraries()){
            for(Map.Entry<Integer, String> possibleBook : _libraryData.getTotalPossibleBooks().entrySet()){
                for(Map.Entry<Integer, String> bookRecord: libraryRecord.getBookObjects().entrySet()){
                    if(bookRecord.getKey().equals(possibleBook.getKey())){
                        libraryRecord.getBookObjects().put(bookRecord.getKey(), possibleBook.getValue());
                    }
                }
            }
        }
    }

//    private void sortBooksInEachLibrary(LibraryData _libraryData){
//        ArrayList<String> tempList = new ArrayList<>();
//        LinkedHashMap<Integer, String> sortedLibraryBooks = new LinkedHashMap<>();
//        for(Map.Entry<Integer, String> tempBookObjectsEntry : _libraryData.tempBookObjects.entrySet()){
//            tempList.add(tempBookObjectsEntry.getValue());
//        }
//        sort(tempList, reverseOrder());
//        for(String score: tempList){
//
//        }
//    }
}
