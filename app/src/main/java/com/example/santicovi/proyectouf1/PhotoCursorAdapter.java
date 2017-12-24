package com.example.santicovi.proyectouf1;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import mysupercompany.nasapi.databinding.LvPhotosRowBinding;



public class PhotoCursorAdapter extends CupboardCursorAdapter<Photo> {

    public PhotoCursorAdapter(Context context, Class<Photo> entityClass) {
        super(context, entityClass);
    }

    @Override
    public View newView(Context context, Photo model, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LvPhotosRowBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.lv_photos_row, parent, false);

        return binding.getRoot();
    }

    @Override
    public void bindView(View view, Context context, Photo photo) {
        LvPhotosRowBinding binding = DataBindingUtil.getBinding(view);

        binding.roverName.setText("Rover Name: " + photo.getRoverName());
        binding.roverId.setText("Photo ID: " + photo.getRoverId().toString());
        binding.sol.setText("Mars Day: " + photo.getSol().toString());
        binding.camera.setText("Camera: " + photo.getRoverCam());
        binding.status.setText("Mission Status: " + photo.getStatus());
        binding.launchDate.setText("Launch Date: " + photo.getLaunchDate());
        binding.landingDate.setText("Landing Date: " + photo.getLandingDate());
        binding.maxDate.setText("Max Date: " + photo.getMaxDate());
        binding.maxSol.setText("Last Day on Mars: " + photo.getMaxSol().toString());
        binding.totalPhotos.setText("Total Photos: " + photo.getTotalPhotos().toString());

        Glide.with(context).load(photo.getImageUrl()).into(binding.imageView);

    }

}
