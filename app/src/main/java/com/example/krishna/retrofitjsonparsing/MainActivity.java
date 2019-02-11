package com.example.krishna.retrofitjsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RJApiInterface apiInterface;
    List<RJDataModel> dataModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = RJApiClent.getApiClient().create(RJApiInterface.class);
        Call<List<RJDataModel>> call = apiInterface.getData("51028988dcd22b619f5d5e952ecbe3c9e6379ae7d8988467fad1523c9f75d22b");
        call.enqueue(new Callback<List<RJDataModel>>() {
            @Override
            public void onResponse(Call<List<RJDataModel>> call, Response<List<RJDataModel>> response) {
                dataModels = response.body();
                Toast.makeText(MainActivity.this, "" + dataModels.get(0).getId() + dataModels.get(0).getSponsored(), Toast.LENGTH_SHORT).show();
                Log.d("TAG", "onResponse: " + dataModels.get(0).getSponsoredBy().getFirst_name());
            }

            @Override
            public void onFailure(Call<List<RJDataModel>> call, Throwable t) {

            }
        });
    }
}
