package com.ekosp.satlantas.multiplelayerprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.Guideline;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends Activity {


    @BindView(R.id.guideline1)
    Guideline gline1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

       // gline1.setGuidelinePercent(0.7f);


    }

}