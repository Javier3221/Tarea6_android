package com.example.tarea6;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class inicio extends Fragment implements
        View.OnClickListener {
    @Nullable
    private VideoView videoView;
    private Button btn1;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.inicio, container, false);
        videoView =
                view.findViewById(R.id.videoView);
        btn1 = view.findViewById(R.id.btn1);
        videoView.setMediaController((new MediaController(getContext()))); Uri path =
            Uri.parse("android.resource://com.example.tarea6/" + R.raw.inicio);
        videoView.setVideoURI(path);
        videoView.requestFocus();
        videoView.start();
        btn1.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        String path =
            "android.resource://com.example.tarea_tabs/" + R.raw.inicio;
        Uri uri = Uri.parse(path);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}
