
package com.example.amitrai.demoradar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * @author Amit Rai
 *
 */
public class MainActivity extends Activity {

    RadarView mRadarView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        mRadarView = (RadarView) findViewById(R.id.radarView);
        if (mRadarView != null) mRadarView.startAnimation();

        mRadarView.setShowCircles(true);
    }


    public void stopAnimation(View view) {
        if (mRadarView != null) mRadarView.stopAnimation();
    }

    public void startAniamtion(View view) {
        if (mRadarView != null) mRadarView.startAnimation();
    }
}
