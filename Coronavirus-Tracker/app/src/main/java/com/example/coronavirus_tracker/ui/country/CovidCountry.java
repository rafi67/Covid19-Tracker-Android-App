package com.example.coronavirus_tracker.ui.country;

public class CovidCountry {
    String mCovidCountry, mCases, mTodayCases, mDeaths, mTodayDeaths, mRecovered, mCritical, mFlags;

    public CovidCountry(String mCovidCountry, String mCases, String mFlags) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mFlags = mFlags;
        this.mTodayCases = mTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mCritical = mCritical;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }

    public String getmFlags() {
        return mFlags;
    }
}
