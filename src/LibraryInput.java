import Constants.Constants;
import Models.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import static Constants.Constants.ADD_ONE;

public class LibraryInput {

    private LibraryData libraryData;
    private LibrarySort librarySort = new LibrarySort();
    private final static int OVER_DETAILS_LINE = 0;
    private final static int BOOK_LINE = 1;

    public LibraryData parseInput(String fileName) throws FileNotFoundException {
        if(fileName == null){
            throw new FileNotFoundException("Missing a file");
        }

        libraryData = new LibraryData();

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int fileLineIndex = 0;

        Library newlibrary= new Library();


        int libraryIDRemember =0;
        int isLibraryLineInt = 0;
        int[] importantParameters = {libraryIDRemember, isLibraryLineInt};

        while (scanner.hasNextLine()){
            String fileLine = scanner.nextLine();
            String[] numbersSplinted = fileLine.split(" ");
            //TODO: newlibrary = new Library();
            if(fileLineIndex == OVER_DETAILS_LINE){
                handleOverDetails(fileLineIndex, numbersSplinted);
            }else if (fileLineIndex == BOOK_LINE){
                handleBookScores(fileLineIndex, numbersSplinted);
            }else if (fileLineIndex > BOOK_LINE){
                handleSpecificLibraryData(numbersSplinted, newlibrary,
                        importantParameters);
            }
            fileLineIndex ++;
        }
        return libraryData;
    }
    private void handleOverDetails(int dataIndex, String[] numbersData){
        for(int lineIndex=0; lineIndex < numbersData.length; lineIndex++){
            Integer temp = Integer.parseInt(numbersData[lineIndex]);
            if(lineIndex == 0){
                libraryData.getOverallDetails().
                        setTotalNumOfBooks(temp);
            }else if(lineIndex == 1){
                libraryData.getOverallDetails().
                        setTotalNumOfLibs(temp);
            }else if(lineIndex > 1){
                libraryData.getOverallDetails().
                        setTotalNumOfDays(temp);
            }
        }
    }
    private void handleBookScores(int index, String[] numbersData) {
        for (int bookElement = 0; bookElement < numbersData.length; bookElement++) {
            libraryData.getTotalPossibleBooks().put(bookElement,
                    numbersData[bookElement]);
        }
    }

    private void handleSpecificLibraryData(String[] numbersData, Library anotherLibrary,
                                             int[] importantParameters){
        boolean isLibraryLine = false;
        if(importantParameters[Constants.IS_LIBRARY_INFO_POS] == 0){
            isLibraryLine = true;
        }
        System.out.println("hi");
        if(isLibraryLine){
            anotherLibrary.setLibraryId(importantParameters[Constants.LIBRARY_ID_POS]);
            System.out.println("hello");
            for(int lineIndex =0; lineIndex < numbersData.length; lineIndex++){
                Integer temp = Integer.parseInt(numbersData[lineIndex]);
                if(lineIndex == 0){
                    anotherLibrary.setCountOfBooks(temp);
                }else if(lineIndex == 1){
                    anotherLibrary.setSignUpDays(temp);
                }else if(lineIndex == 2){
                    anotherLibrary.setBooksPerDays(temp);
                }
            }
            importantParameters[Constants.IS_LIBRARY_INFO_POS] = 1;
        } else if(!isLibraryLine){
            libraryData.setTempBookObjects(new HashMap<Integer, String>());
            for (String number : numbersData) {
                libraryData.getTempBookObjects().put(Integer.parseInt(number), "hiithere");//TODO:CHECK
            }
            anotherLibrary.setBookObjects(libraryData.getTempBookObjects());
            libraryData.getTotalLibraries().add(anotherLibrary);
            anotherLibrary = new Library();
            importantParameters[Constants.LIBRARY_ID_POS]++;
            importantParameters[Constants.IS_LIBRARY_INFO_POS] = 0;
        }
    }
}
