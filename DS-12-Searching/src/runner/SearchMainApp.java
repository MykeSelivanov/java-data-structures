package runner;

import searchingalgorithms.MyLinearSearch;

public class SearchMainApp {
    public static void main(String[] args) {

        int[] myArray = new int[]{1,2,3,4,5,6,89,100,113,109,112};

        // Linear Search
        var myLinearSearch = new MyLinearSearch();
        System.out.println("Linear Search : " + myLinearSearch.linearSearch(myArray,112));

        //

    }

}
