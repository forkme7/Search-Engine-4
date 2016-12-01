package searchengine;

import java.util.List;

/**
 * Holds all websites read from a .txt file and provides search logic.
 */
public interface Index
{
    /**
     * Creates the data structure that will index all websites.
     *
     * @param websites Website list provided by FileHelper
     */
    void build(List<Website> websites);

    /**
     * Searches for websites containing a query provided by the user.
     *
     * @param query Phrase/word to look-up.
     */
    List<Website> lookup(String query);

    /**
     * Calculates the total number of websites in the index.
     *
     * @return The total number of websites.
     */
    int getSize();
}