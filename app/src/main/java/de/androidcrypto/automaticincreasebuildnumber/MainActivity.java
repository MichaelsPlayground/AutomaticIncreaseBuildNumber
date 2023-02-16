package de.androidcrypto.automaticincreasebuildnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import de.androidcrypto.automaticincreasebuildnumber.BuildConfig;

public class MainActivity extends AppCompatActivity {

    Button getVersion;
    TextView buildType, minorVersion, patchVersion, versionCode, versionName, buildNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getVersion = findViewById(R.id.btnGetVersion);
        buildType = findViewById(R.id.tvBuildType);
        minorVersion = findViewById(R.id.tvMinorVersion);
        versionCode = findViewById(R.id.tvVersionCode);
        versionName = findViewById(R.id.tvVersionName);

        getVersion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buildTypeString = BuildConfig.BUILD_TYPE;
                buildType.setText("Build type: " + buildTypeString);
                int versionCodeInt = BuildConfig.VERSION_CODE;
                String versionNameString = BuildConfig.VERSION_NAME;
                versionCode.setText("Version code: " + String.valueOf(versionCodeInt));
                versionName.setText("Version name: " + versionNameString);
            }
        });


    }
}