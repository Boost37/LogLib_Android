package com.example.toast_lib;

import android.content.Context;
import android.widget.Toast;

public class ToastDisplay {
    public void showToast(Context context, String message) {
        Toast.makeText(context, "" + message, Toast.LENGTH_SHORT).show();
    }
}
