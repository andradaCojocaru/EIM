package lab03.eim.systems.cs.pub.contactmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class PhoneBroadcastReceiver extends BroadcastReceiver {

    private EditText phoneEditText;

    public PhoneBroadcastReceiver(EditText phoneEditText) {
        this.phoneEditText = phoneEditText;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String phone = intent.getStringExtra("lab03.eim.systems.cs.pub.contactmanager.PHONE_NUMBER_KEY");
            if (phone != null) {
                phoneEditText.setText(phone);
            } else {
                Toast.makeText(context, context.getResources().getString(R.string.phone_error), Toast.LENGTH_LONG).show();
            }
        }
    }
}