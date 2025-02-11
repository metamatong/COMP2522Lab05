package ca.bcit.comp2522.bookstore;

/**
 * Represents a novel with a title, an author, and a publication year.
 * @author Clinton Nguyen
 * @author Kyle Cheon
 * @version 1.0
 *
 */
class Novel
{
    private String title;
    private String author;
    private int yearPublished;

    /**
     * Constructs a new {@code Novel} with the specified title, author, and publication year.
     *
     * @param title         the title of the novel
     * @param author        the author of the novel
     * @param yearPublished the year the novel was published
     */
    Novel(final String title,
          final String author,
          final int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the novel.
     *
     * @return the title of the novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the name of the author of the novel.
     *
     * @return the author's name
     */
    public String getAuthorName()
    {
        return author;
    }

    /**
     * Returns the year the novel was published.
     *
     * @return the publication year
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}