package com.example.tarea6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class canciones extends Fragment {
    @Nullable
    private ListView lv1;
    String canciones[] = {" viajo sin ver ", " stop it ", " distraido ", " palabras ", " lucerito "};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v =
                inflater.inflate(R.layout.canciones, container, false);
        lv1 = v.findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, canciones);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int Position, long l) {
                switch (Position) {
                    case 0:
                        Uri uri1 =
                                Uri.parse("https://www.youtube.com/watch?v=alvqiUvkopc");
                        Intent intent1 = new
                                Intent(Intent.ACTION_VIEW, uri1);
                        startActivity(intent1);
                        break;
                    case 1:
                        Uri uri2 =
                                Uri.parse("https://www.youtube.com/watch?v=LB8-bIhl_d8");
                        Intent intent2 = new
                                Intent(Intent.ACTION_VIEW, uri2);
                        startActivity(intent2);
                        break;
                    case 2:
                        Uri uri3 =
                                Uri.parse("https://www.youtube.com/watch?v=bWkQjYH6vmM");
                        Intent intent3 = new
                                Intent(Intent.ACTION_VIEW, uri3);
                        startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 =
                                Uri.parse("https://www.youtube.com/watch?v=ieBvA3kMJB4");
                        Intent intent4 =
                                new Intent(Intent.ACTION_VIEW, uri4);
                        startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 =
                                Uri.parse("https://www.youtube.com/watch?v=nja_0BaQcNg");
                        Intent
                                intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                        startActivity(intent5);
                        break;
                }
            }
        });
        return v;
    }
}