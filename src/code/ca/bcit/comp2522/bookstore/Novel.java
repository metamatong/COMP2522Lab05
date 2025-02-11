package ca.bcit.comp2522.bookstore;

class Novel
{
    private String title;
    private String author;
    private int yearPublished;

    Novel(final String title,
          final String author,
          final int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthorName()
    {
        return author;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }
}
