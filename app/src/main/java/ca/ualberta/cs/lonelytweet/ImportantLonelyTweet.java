package ca.ualberta.cs.lonelytweet;

import java.util.Date;

/**
 * Created by almacken on 11/1/17.
 */

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(String text, Date date) {
        super(text, date);
    }

    public String getTweetBody() {
        return this.tweetBody.toUpperCase();
    }

    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20); //Simplified if statement

    }
}
