public class Printer {
    private String queue = "";
    private int pagesInQueue;
    private int printedPages;

    public void append(String text, String name,
                       int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void append(String text) {
        queue = queue + "\nДокумент без имени - " + text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void append(String text, String name) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void append(String text, int pagesCount) {
        queue = queue + "\nДокумент без имени - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void clear() {
        pagesInQueue = 0;
        queue = "";
    }

    public void print() {
        printedPages = printedPages + pagesInQueue;
        System.out.println(queue);
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return printedPages;
    }


}


