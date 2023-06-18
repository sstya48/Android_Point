package com.androidalians.androidpoint.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.androidalians.androidpoint.Activity.MainActivity;
import com.androidalians.androidpoint.CustomProgressDialog;


public class BaseFragment extends Fragment {


    protected CustomProgressDialog progressDialog;


    private static final String TAG = BaseFragment.class.getSimpleName();

    public MainActivity mContext;

    @Override
    public void onAttach(
            @NonNull Context context) {
        if (context instanceof MainActivity)
            this.mContext = (MainActivity) context;
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        initialize();
        super.onCreate(savedInstanceState);
      /*  Lang=prefManagerFragment.getValue(Lang,"en");
        setLocale(Lang);*/
    }



    private void initialize(){
       progressDialog = new CustomProgressDialog(mContext);
    }

    protected void showProgressDialog() {
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    protected void dismissProgressDialog() {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        } catch (Exception ex) {
            Log.e(TAG, ex.getMessage(), ex);
        }
    }
}