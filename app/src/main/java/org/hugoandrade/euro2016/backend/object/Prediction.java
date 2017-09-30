package org.hugoandrade.euro2016.backend.object;

import android.net.Uri;

import java.util.HashMap;

import org.hugoandrade.euro2016.backend.cloudsim.CloudDatabaseSimProvider;

public class Prediction {


    public static class Entry {

        public static final String TABLE_NAME = "Prediction";

        public static final String COLUMN__ID = "_id";
        public static final String COLUMN_MATCH_NO = "MatchNo";
        public static final String COLUMN_HOME_TEAM_GOALS = "HomeTeamGoals";
        public static final String COLUMN_AWAY_TEAM_GOALS = "AwayTeamGoals";
        public static final String COLUMN_SCORE = "Score";
        public static final String COLUMN_USER_ID = "UserID";

        // SQLite table mName
        // PATH & TOKEN for entire table
        public static final String PATH = TABLE_NAME;
        public static final int PATH_TOKEN = 130;

        // PATH & TOKEN for single row of table
        public static final String PATH_FOR_ID = PATH + "/#";
        public static final int PATH_FOR_ID_TOKEN = 140;

        // URI for this content.
        public static final Uri CONTENT_URI = CloudDatabaseSimProvider.BASE_URI.buildUpon()
                .appendPath(PATH).build();

        // CONTENT/MIME TYPE for this content
        private final static String MIME_TYPE_END = PATH;
        public static final String CONTENT_TYPE_DIR = CloudDatabaseSimProvider.ORGANIZATIONAL_NAME
                + ".cursor.dir/" + CloudDatabaseSimProvider.ORGANIZATIONAL_NAME + "." + MIME_TYPE_END;
        public static final String CONTENT_ITEM_TYPE = CloudDatabaseSimProvider.ORGANIZATIONAL_NAME
                + ".cursor.item/" + CloudDatabaseSimProvider.ORGANIZATIONAL_NAME + "." + MIME_TYPE_END;
    }

    private int mID;
    private String mUserID;
    private int mMatchNo;
    private int mHomeTeamGoals;
    private int mAwayTeamGoals;
    private int mScore;

    public Prediction(int id, String userID, int matchNo, int homeTeamGoals, int awayTeamGoals, int score) {
        mID = id;
        mUserID = userID;
        mMatchNo = matchNo;
        mHomeTeamGoals = homeTeamGoals;
        mAwayTeamGoals = awayTeamGoals;
        mScore = score;
    }

    public int getID() {
        return mID;
    }

    public String getUserID() {
        return mUserID;
    }

    public int getMatchNumber() {
        return mMatchNo;
    }

    public int getHomeTeamGoals() {
        return mHomeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return mAwayTeamGoals;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }
}