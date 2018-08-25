package com.example.system.miwok;

/**
 * This represents a vocabulary word that a user wants to learn.
 * It contains a default translation and a mmiwok translation for that word
 */

public class Word {
    /**Default translation for the word*/
    private String mDefaultTranslation;
    /**Miwok translation for the word*/
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     * @return
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get miwok translation.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
