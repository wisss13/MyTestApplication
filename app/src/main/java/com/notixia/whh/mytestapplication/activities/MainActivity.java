package com.notixia.whh.mytestapplication.activities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.cameraview.CameraView;
import com.notixia.whh.mytestapplication.R;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CameraView mCameraView;
    private Button btPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCameraView = findViewById(R.id.cvCameraView);
        btPicture = findViewById(R.id.btPicture);
        btPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mCameraView.takePicture();

                File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
                File file = new File(path, "/" + "Classeur.xlsx");
                openFile(file, getApplicationContext());
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        //mCameraView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //mCameraView.stop();
    }

    public void openFile(File newFile, Context context) {
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        String ext = newFile.getName().substring(newFile.getName().lastIndexOf(".") + 1);
        String type = mime.getMimeTypeFromExtension(ext);
        try {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
                Uri contentUri = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".file.provider", newFile);
                intent.setDataAndType(contentUri, type);
            } else {
                intent.setDataAndType(Uri.fromFile(newFile), type);
            }
            startActivity(intent);
        } catch (ActivityNotFoundException anfe) {
            Toast.makeText(context, "No activity found to open this attachment.", Toast.LENGTH_LONG).show();
        }
    }

    public static String getFileDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + "/Notixia" ;
    }

    public static Uri getUriFromFile(File file, Context context) {
        Uri contentUri = FileProvider.getUriForFile(context, context.getPackageName() , file);
        return contentUri;

    }

}
