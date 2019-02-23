package com.notixia.whh.mytestapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.notixia.whh.mytestapplication.R;
import com.notixia.whh.mytestapplication.injection.DaggerApplication;
import com.notixia.whh.mytestapplication.injection.HelloService;
import com.notixia.whh.mytestapplication.injection.MVPContract;
import com.notixia.whh.mytestapplication.injection.PresenterImpl;
import com.notixia.whh.mytestapplication.injection2.Main;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by whh on 18-06-28.
 */

public class DependencyInjectionTestActivity extends AppCompatActivity implements MVPContract.ContractView{

        @Inject
        HelloService helloService;

        @BindView(R.id.userNameText) EditText userNameText;

        @BindView(R.id.toolbar) Toolbar mToolbar;

        PresenterImpl presenter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dependency_injection_test);
            ButterKnife.bind(this);

            DaggerApplication.component().inject(this);

            //Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(mToolbar);

            presenter = new PresenterImpl( this );

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                startActivity( new Intent( this, Retrofit2Activity.class ));
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @OnClick(R.id.greet)
        public void onButtonClick(View view) {
           /* Toast.makeText(getApplicationContext(), "You have entered: " + userNameText.getText(),
                    Toast.LENGTH_SHORT).show();*/
           presenter.greetMessage( userNameText.getText().toString() );
        }


    @Override
    public void showMessage(String message) {
        Toast.makeText(this, "You have entered: " + message, Toast.LENGTH_SHORT).show();
    }
}