package com.aminbahrami.abpsweetalertlib;

import android.app.Activity;
import android.os.Bundle;

import com.aminbahrami.abpsweetalert.SweetAlertDialog;

public class ActivityMain extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		SweetAlertDialog alert=new SweetAlertDialog(this);
		
		alert.setTitleText("خطا");
		alert.setContentText("این متن برای تست می باشد");
		alert.changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
		alert.show();
	}
}
