package my.example.testprogressdialog;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ProgressDialog mProgressDialog;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setTitle("Wait...");
        mProgressDialog.setMessage("Please wait...");
        mProgressDialog.setIndeterminate(true);

        mHandler.postDelayed(() -> mProgressDialog.show(), 500);

        mHandler.postDelayed(() -> mProgressDialog.dismiss(), 5000);
    }
}
