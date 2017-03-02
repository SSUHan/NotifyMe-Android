package com.notifyme.myzzung.notifyme;

import android.annotation.SuppressLint;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



/**
 * Created by myZZUNG on 2017. 3. 2..
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private String TAG = "MyFirebaseInstanceIdService";

    @SuppressLint("LongLogTag")
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
        sendRegistrationToServer(refreshedToken);
    }

    @SuppressLint("LongLogTag")
    private void sendRegistrationToServer(String refreshedToken){
        // Send Refreshed FCM Token To Server
        Log.d(TAG, "Send Token : "+ refreshedToken);
    }
}
