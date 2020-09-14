package ru.mirea.INBO0219.Ira1ex2;

public class Book {
    private String Label;
    private int CountOfBooks;

    public Book(String label, int countOfBooks) {
        this.Label = label;
        this.CountOfBooks = countOfBooks;
    }

    public String getLabel() {
        return this.Label;
    }

    public int getCountOfBooks() {
        return this.CountOfBooks;
    }

    public void setLabel(String label) {
        this.Label = label;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.CountOfBooks = countOfBooks;
    }

    public String toString() {
        return this.Label + " выпускается в " + this.CountOfBooks + " книгах.";
    }

    public void intoPriceForAllCollection() {
        System.out.println(this.Label + "будет стоить " + this.CountOfBooks * 968 + " рублей.");
    }
}
