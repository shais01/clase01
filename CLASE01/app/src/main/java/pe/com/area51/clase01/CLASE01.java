package pe.com.area51.clase01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CLASE01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase01);
        Log.d(  "clase01",  "onScreen");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(  "clase01",  "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(  "clase01",  "onResume");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(  "clase01",  "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(  "clase01",  "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(  "clase01",  "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(  "clase01",  "onDestroy");

    }

}
