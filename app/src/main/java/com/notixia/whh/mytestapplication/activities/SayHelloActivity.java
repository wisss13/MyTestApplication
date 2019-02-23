package com.notixia.whh.mytestapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.notixia.whh.mytestapplication.R;
import com.notixia.whh.mytestapplication.mvp_injection.DaggerSayHelloComponent;
import com.notixia.whh.mytestapplication.mvp_injection.Person;
import com.notixia.whh.mytestapplication.mvp_injection.SayHelloContract;
import com.notixia.whh.mytestapplication.mvp_injection.SayHelloPresenterImpl;
import com.notixia.whh.mytestapplication.mvp_injection.SayHelloPresenterModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SayHelloActivity extends AppCompatActivity
        implements SayHelloContract.View {

    // UI properties
    @BindView(R.id.message) TextView messageView;
    @BindView(R.id.firstName) EditText firstNameView;
    @BindView(R.id.lastName) EditText lastNameView;

    @Inject
    SayHelloPresenterImpl presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_screen);

        // initViews
        ButterKnife.bind(this);

        // Creates presenter
        DaggerSayHelloComponent.builder()
                .sayHelloPresenterModule(new SayHelloPresenterModule(this, new Person()))
                .build()
                .inject(this);
    }

    @Override
    public void showMessage(String message) {
        messageView.setText(message);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }

    /**
     * The View only receives user's action and leaves all remaining tasks for the Presenter
     */

    @OnClick(R.id.update)
    public void saveName(View view){
        presenter.saveName(firstNameView.getText().toString(), lastNameView.getText().toString());
    }

    @OnClick(R.id.showMessage)
    public void showMessage(View view){
        presenter.loadMessage();
    }
}