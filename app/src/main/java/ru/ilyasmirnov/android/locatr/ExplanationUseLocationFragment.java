package ru.ilyasmirnov.android.locatr;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

public class ExplanationUseLocationFragment extends DialogFragment {

    Callbacks mCallbacks;

    /**
     * Необходимый интерфейс для активности-хоста.
     */

    public interface Callbacks {
        void requestLocationPermissions();
    }

    public static ExplanationUseLocationFragment newInstance() {
        return new ExplanationUseLocationFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallbacks = (Callbacks) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = null;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_use_location, null);

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle(R.string.use_location_explanation_title)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                    public void onClick(DialogInterface dialog, int which) {
                            mCallbacks.requestLocationPermissions();
                    }
                })
                .create();
    }
}
