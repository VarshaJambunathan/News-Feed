package com.example.varsha.newsfeed;

/**
 * Created by Varsha on 03-12-2016.
 */

public class Guardian {
    public String mSectionName;
    public String mWebPublicationDate;
    public String mWebTitle;
    public String mWebUrl;

    public Guardian(String mSectionName,String mWebPublicationDate, String mWebTitle, String mWebUrl) {
        this.mSectionName = mSectionName;
        this.mWebPublicationDate = mWebPublicationDate;
        this.mWebTitle = mWebTitle;
        this.mWebUrl = mWebUrl;
    }

    public void setmSectionName(String mSectionName) { this.mSectionName = mSectionName;  }

    public void setmWebUrl(String mWebUrl) { this.mWebUrl = mWebUrl; }

    public void setmWebTitle(String mWebTitle) { this.mWebTitle = mWebTitle;  }

    public void setmWebPublicationDate(String mWebPublicationDate) { this.mWebPublicationDate = mWebPublicationDate;  }

    public String getmSectionName() { return mSectionName; }

    public String getmWebPublicationDate() { return mWebPublicationDate; }

    public String getmWebTitle() { return mWebTitle; }

    public String getmWebUrl() { return mWebUrl; }
}
