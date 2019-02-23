package com.notixia.whh.mytestapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notixia.whh.mytestapplication.R;
import com.notixia.whh.mytestapplication.retrofit2.GetNoticeDataServiceAPI;
import com.notixia.whh.mytestapplication.retrofit2.OperationQtyAdapter;
import com.notixia.whh.mytestapplication.retrofit2.QuantityMapPOJO;
import com.notixia.whh.mytestapplication.retrofit2.RetrofitInstance;
import com.notixia.whh.mytestapplication.utils.RestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit2Activity extends AppCompatActivity {

    @BindView(R.id.tv_jo_adoid) TextView tvJOADOID;

    private OperationQtyAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit2);
        ButterKnife.bind(this);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RestUtil.URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        /** Create handle for the RetrofitInstance interface*/
//        GetNoticeDataServiceAPI service = RetrofitInstance.getRetrofitInstance().create(GetNoticeDataServiceAPI.class);
        GetNoticeDataServiceAPI service = retrofit.create(GetNoticeDataServiceAPI.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<QuantityMapPOJO> call = service.getNoticeData( "OPL_1-0-0-103D6E|JO_1-0-0-23E4B0", "368d28e1-00bd-43f9-a455-3e99642fa390" );

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<QuantityMapPOJO>() {
            @Override
            public void onResponse(Call<QuantityMapPOJO> call, Response<QuantityMapPOJO> response) {
                if(response.isSuccessful()) {

                    tvJOADOID.setText( response.body().getQuantityMap().getOperationPCLinkID()  + "\n" +
                            response.body().getQuantityMap().getJobOrderName());
                    Log.wtf("LOG_RESPONSE", response + "");
                }
                else {
                    System.out.println(response.errorBody());
                }

            }

            @Override
            public void onFailure(Call<QuantityMapPOJO> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(Retrofit2Activity.this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /** Method to generate List of notice using RecyclerView with custom adapter*/
    private void generateNoticeList(QuantityMapPOJO noticeArrayList) {
        recyclerView = findViewById(R.id.recycler_view_notice_list);
        adapter = new OperationQtyAdapter(noticeArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Retrofit2Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}