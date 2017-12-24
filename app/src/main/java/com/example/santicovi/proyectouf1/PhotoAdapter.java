package com.example.santicovi.proyectouf1;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.bumptech.glide.Glide;
import java.util.List;

import mysupercompany.nasapi.databinding.LvPhotosRowBinding;



public class PhotoAdapter extends ArrayAdapter<Photo>{

    public PhotoAdapter(Context context, int resource, List<Photo> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Photo photo = getItem(position);

        LvPhotosRowBinding binding = null;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            //convertView = inflater.inflate(R.layout.lv_photos_row, parent, false);
            binding = DataBindingUtil.inflate(inflater, R.layout.lv_photos_row, parent, false);
        }
        else binding = DataBindingUtil.getBinding(convertView);

        binding.roverName.setText(photo.getRoverName());
        binding.roverId.setText(photo.getRoverId());
        binding.sol.setText(photo.getSol());
        binding.camera.setText(photo.getRoverCam());
        binding.status.setText(photo.getStatus());
        binding.launchDate.setText(photo.getLaunchDate());
        binding.landingDate.setText(photo.getLandingDate());
        binding.maxDate.setText(photo.getMaxDate());
        binding.maxSol.setText(photo.getMaxSol());
        binding.totalPhotos.setText(photo.getTotalPhotos());
        Glide.with(getContext()).load(photo.getImageUrl()).into(binding.imageView);

        Log.w("CARD ", photo.toString());

        return binding.getRoot();
    }

}
