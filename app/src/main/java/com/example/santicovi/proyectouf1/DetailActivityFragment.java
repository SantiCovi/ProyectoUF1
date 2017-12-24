package com.example.santicovi.proyectouf1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import mysupercompany.nasapi.databinding.FragmentDetailBinding;


public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentDetailBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_detail, container, false);

        View view = binding.getRoot();

        Intent i = getActivity().getIntent();

        if (i != null) {
            Photo photo = (Photo) i.getSerializableExtra("photo");

            if (photo != null) {
                Log.d("PHOTO", photo.toString());

                Glide.with(getContext()).load(photo.getImageUrl()).into(binding.photoDetail);
            }
        }

        return view;
    }


}
