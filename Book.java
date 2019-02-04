/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Corey Doremus)
 * @version (2/4/19)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String ref;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        ref = refNumber;
    }

    // Add the methods here ...
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void printAuthor(){
        System.out.println("Name of Author " + author);
        }
    
    
    public void printTitle(){
        System.out.println("Title of the book " + title);
    }
    
    public void printPages(){
        System.out.println("This book has " + pages + " pages");
    }
    
    public void printDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
    
    public void setRefNumber(String ref){
        System.out.println("Reference number: " + ref);
    }
}
