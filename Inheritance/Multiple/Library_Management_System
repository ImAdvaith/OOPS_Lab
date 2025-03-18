class Library {
    String libraryName;
    String address;

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
    }

    public void openLibrary() {
        System.out.println(libraryName + " is now open!");
    }

    public void displayInfo() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Library Address: " + address);
    }
}

class Book extends Library {
    String title;
    String author;

    public Book(String libraryName, String address, String title, String author) {
        super(libraryName, address);
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }

    public void borrowBook() {
        System.out.println("You have borrowed the book: " + title);
    }
}

class Ebook extends Book {
    String fileSize;
    String fileFormat;

    public Ebook(String libraryName, String address, String title, String author, String fileSize, String fileFormat) {
        super(libraryName, address, title, author);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ebook File Size: " + fileSize);
        System.out.println("Ebook File Format: " + fileFormat);
    }

    public void downloadEbook() {
        System.out.println("Downloading ebook: " + title + " in " + fileFormat + " format.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Central Library", "123 Main St", "Intro to Java Programming and Data Structures", "O'reily", "5MB", "PDF");
        ebook.openLibrary();
        ebook.displayInfo();
        ebook.downloadEbook();
    }
}
