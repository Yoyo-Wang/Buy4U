/*
 * Created by Osman Balci on 2016.04.23  * 
 * Copyright © 2016 Osman Balci. All rights reserved. * 
 */
package com.mycompany.managers;

/**
 *
 * @author Balci
 */
public final class Constants {

    /*
    --------------------------------------------------------------------
    Change /Users/Balci/PizzaHutStorageLocation/ below to
    /home/CloudSD/Balci/PizzaHutStorageLocation/
    for deployment to the server by replacing Balci with your last name.
    --------------------------------------------------------------------
     */
    public static final String ROOT_DIRECTORY = "/Users/Balci/PizzaHutStorageLocation/";

    public static final String STORAGE_DIRECTORY = "PizzaHutStorageLocation/";

    public static final String TEMP_FILE = "tmp_file";

    public static final Integer THUMBNAIL_SIZE = 200;

    public static final Integer MAX_CAPTION_SIZE = 140;

    public static final String[] STATES = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT",
        "DC", "DE", "FL", "GA", "GU", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA",
        "MD", "ME", "MH", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM",
        "NV", "NY", "OH", "OK", "OR", "PA", "PR", "PW", "RI", "SC", "SD", "TN", "TX", "UT",
        "VA", "VI", "VT", "WA", "WI", "WV", "WY"};

    public static final String[] QUESTIONS = {"In what city were you born?",
        "What elementary school did you attend?",
        "What is the last name of your most favorite teacher?",
        "What is your father's middle name?",
        "What is your most favorite pet's name?"};

}
