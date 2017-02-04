package com.csci448.npohl.criminalintent;

import java.util.UUID;

/**
 * Created by Nate on 2/3/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
