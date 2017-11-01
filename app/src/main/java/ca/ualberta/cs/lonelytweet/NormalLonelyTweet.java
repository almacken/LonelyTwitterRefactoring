package ca.ualberta.cs.lonelytweet;

import java.util.Date;

/**
 * Created by almacken on 11/1/17.
 */

public class NormalLonelyTweet extends LonelyTweet {


    public NormalLonelyTweet(String text, Date date) {
        super(text, date);
    }
    public String getTweetBody() {
        return this.tweetBody;
    }

    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10); //Simplified if statement

    }
}
