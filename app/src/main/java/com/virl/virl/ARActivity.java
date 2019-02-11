package com.virl.virl;

import android.content.Context;
import android.support.v4.util.Consumer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.rendering.ViewRenderable;
import com.google.ar.sceneform.ux.ArFragment;

public class ARActivity extends AppCompatActivity {

    private ArFragment arFragment;
    ViewRenderable poster;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);
        context = getApplicationContext();

        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.ux_fragment);
        ViewRenderable.builder().setView(context, R.layout.poster).build()
                .thenAccept(new java.util.function.Consumer<ViewRenderable>() {
                    @Override
                    public void accept(ViewRenderable viewRenderable) {
                        poster = viewRenderable;
                    }
                });

        arFragment.setOnTapArPlaneListener((HitResult hitResult, Plane plane, ) -> {

        });

    }
}
