package com.example.dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import me.dm7.barcodescanner.zbar.Result
import me.dm7.barcodescanner.zbar.ZBarScannerView

class QrScanner : AppCompatActivity(),ZBarScannerView.ResultHandler{
    private lateinit var zbView: ZBarScannerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zbView = ZBarScannerView(this)
        setContentView(zbView)
    }
    override fun onResume() {
        super.onResume()
        zbView.setResultHandler(this)
        zbView.startCamera()
    }
    override fun onPause() {
        super.onPause()
        zbView.stopCamera()
    }
    override fun handleResult(result: Result?) {
        TODO("Not yet implemented")
        Log.d("MyLog","Result:${result?.contents}")
        finish()
    }

}
