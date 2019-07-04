package ru.ilyasmirnov.android.locatr;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class LocatrActivity extends SingleFragmentActivity
implements ExplanationUseLocationFragment.Callbacks {

    private static final int REQUEST_ERROR = 0;

    @Override
    public void requestLocationPermissions() {
        LocatrFragment locatrFragment = (LocatrFragment)
                getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container);
        locatrFragment.requestLocationPermissions();
    }

    @Override
    protected Fragment createFragment() {
        return LocatrFragment.newInstance();
    }

    @Override
    protected void onResume() {
        super.onResume();

        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int errorCode = apiAvailability.isGooglePlayServicesAvailable(this);

        if (errorCode != ConnectionResult.SUCCESS) {

            Dialog errorDialog = apiAvailability
                    .getErrorDialog(this, errorCode, REQUEST_ERROR,
                            new DialogInterface.OnCancelListener() {
                                @Override
                                public void onCancel(DialogInterface dialog) {
                                    // Выйти, если сервис недоступен.
                                    finish();
                                }
                            });

            errorDialog.show();
        }
    }
}
