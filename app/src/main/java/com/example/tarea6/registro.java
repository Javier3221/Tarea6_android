package com.example.tarea6;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class registro extends Fragment {
    @Nullable
    EditText etUsuariio;
    EditText etContra;
    EditText etNombr;
    Button btnI;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.registro, container, false);
        etUsuariio = v.findViewById(R.id.et1Usuario);
        etContra = v.findViewById(R.id.etContra);
        etNombr = v.findViewById(R.id.etNombre);
        btnI = v.findViewById(R.id.btnRegistro);
        String usu = etUsuariio.getText().toString();
        String cont = etContra.getText().toString();
        String nomb = etNombr.getText().toString();
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usu = etUsuariio.getText().toString();
                String cont =
                        etContra.getText().toString();
                String nomb =
                        etNombr.getText().toString();
                if (nomb.equals("") || usu.equals("") || cont.equals("")) {
                    final AlertDialog.Builder builder = new
                            AlertDialog.Builder(getActivity());
                    builder.setMessage("No puede dejar campos vacios.")
                            .setTitle("Información")
                            .setPositiveButton("OK", new
                                    DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });
                    builder.setIcon(R.drawable.ic_launcher_foreground);
                    builder.create();
                    builder.show();
                    etNombr.requestFocus();
                } else {
                    Intent i = new
                            Intent("com.example.tarea6.logged");
                    Bundle var = new Bundle();
                    var.putString("texto", etNombr.getText().toString());
                    i.putExtras(var);
                    startActivity(i);
                }
            }
        });
        return v;
    }
}
