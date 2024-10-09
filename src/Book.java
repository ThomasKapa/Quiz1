public class Book {


    private int numberOfPages;
    private String summary;

    public Book(String summary, int numberOfPages) {
        this.numberOfPages = numberOfPages;
        this.summary = summary;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public static boolean isRepeatingSummary(String summary, int numberOfPages){
        int sumLength = summary.length();
        for (int i = 0; i < summary.length(); i++) {
            char ch1 = summary.charAt(i);
            for (int j = i + 1; j < summary.length(); j++) {
                char ch2 = summary.charAt(j);
                if (ch1 == ch2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void showPagesToRead() {
        int middlePage = numberOfPages / 2;
        Utilities.goDownToOne(middlePage);
        System.out.println(middlePage);
    }
}






