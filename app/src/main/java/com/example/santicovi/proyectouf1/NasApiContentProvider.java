package com.example.santicovi.proyectouf1;

import nl.littlerobots.cupboard.tools.provider.CupboardContentProvider;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;



public class NasApiContentProvider extends CupboardContentProvider {

    public NasApiContentProvider() {
        super(AUTHORITY, 1);
    }

    public static final String AUTHORITY = BuildConfig.APPLICATION_ID + ".provider";

    static {
        cupboard().register(Photo.class);
    }


}
