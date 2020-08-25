public class Book {
    private String title, author, publisher;
    private int copyRight;

    public Book(String header, String name, String company, int date){
        title = header;
        author = name;
        publisher = company;
        copyRight = date;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }

    public void setCopyRight(int copyRight) {
        this.copyRight = copyRight;
    }
    public int getCopyRight(){
        return copyRight;
    }
    public String toString() {
        return "On our shelves, you will find " + title + " by " + author + " published by " + publisher + " in " + copyRight + ".";
    }
}
