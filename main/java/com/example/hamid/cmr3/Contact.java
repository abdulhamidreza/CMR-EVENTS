package com.example.hamid.cmr3;

/**
 * Created by hamid on 17/12/17.
 */

public class Contact {

    private String nName;

    private String pPossiton;

    private String nNumber;

    /** Image resource ID for the Contact */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this Contact */
    private static final int NO_IMAGE_PROVIDED = -1;



    public Contact(String name, String possiton, String number, int imageResourceId) {
        nName = name;
        pPossiton = possiton;
        nNumber=number;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return nName;
    }


    public String getWho() {
        return pPossiton;
    }

    public String getNum(){ return  nNumber;}

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}