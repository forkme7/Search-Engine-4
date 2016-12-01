package searchengine;

import java.util.ArrayList;
import java.util.List;

/**
 * SimpleIndex stores all websites in a List object.
 */
public class SimpleIndex implements Index
{
    private List<Website> websites;

    /**
     * Creates a list of websites in the form of a List object.
     *
     * @param websites Website list provided by FileHelper.
     */
    public void build(List<Website> websites)
    {
        this.websites = websites;
    }

    /**
     * Searches for a specific string in the built list of websites.
     *
     * @param query Phrase/word to look-up.
     * @return A list of websites containing the query.
     */
    public List<Website> lookup(String query)
    {
        //Initialize the list that will hold all results
        List<Website> results = new ArrayList<>();

        //Go though all websites
        for (Website w : websites)
        {
            //If the specific website contains the query, add the website to the list of results
            if (w.getKeywords().contains(query))
            {
                results.add(w);
            }
        }

        //Return all websites that were found
        return results;
    }

    /**
     * Calculates the number of websites in the list.
     *
     * @return Integer representing the number of websites in the list.
     */
    public int getSize()
    {
        return this.websites.size();
    }

    /**
     * Returns the name of the used index (SimpleIndex).
     *
     * @return name index.
     */
    public String toString() {
        return this.getClass().toString();
    }
}