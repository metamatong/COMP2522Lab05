package code.ca.bcit.comp2522.bookstore;

/**
 * Represents a novel with a title, an author, and a publication year.
 *
 * @author Clinton Nguyen
 * @author Kyle Cheon
 * @version 1.0
 */
class Novel
{
    private final String title;
    private final String author;
    private final int yearPublished;

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
        this.title = validateTitle(title);
        this.author = validateAuthor(author);
        this.yearPublished = validateYearPublished(yearPublished);
    }

    /*
     * Validates the title of the novel.
     *
     * @param title the title to validate
     * @return the validated title
     * @throws IllegalArgumentException if the title is {@code null} or empty
     */
    private static String validateTitle(final String title)
    {
        if (title == null || title.trim().isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        return title;
    }

    /*
     * Validates the author of the novel.
     *
     * @param author the author to validate
     * @return the validated author
     * @throws IllegalArgumentException if the author is {@code null} or empty
     */
    private static String validateAuthor(final String author)
    {
        if (author == null || author.trim().isEmpty())
        {
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
        return author;
    }

    /*
     * Validates the publication year of the novel.
     *
     * @param yearPublished the publication year to validate
     * @return the validated publication year
     * @throws IllegalArgumentException if the year published is less than or equal to 0
     */
    private static int validateYearPublished(final int yearPublished)
    {
        if (yearPublished <= 0)
        {
            throw new IllegalArgumentException("Year published must be greater than 0.");
        }
        return yearPublished;
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