package com.founq.sdk.styledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button);
        mProgressBar = findViewById(R.id.progressbar);
        mProgressBar.setMax(100);
        mProgressBar.setProgress(50);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, mButton);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return true;
                    }
                });
                popupMenu.show();
                break;
            default:
                break;
        }
    }
}
