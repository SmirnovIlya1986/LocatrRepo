package ru.ilyasmirnov.android.locatr;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;


public class ProgressBarFragment extends DialogFragment {

    public static ProgressBarFragment newInstance() {
        return new ProgressBarFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.progress, null);

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle(R.string.progress_title)
                .create();
    }
}
