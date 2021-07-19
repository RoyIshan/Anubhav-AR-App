package com.example.ar_app;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import androidx.appcompat.app.AppCompatActivity;
import com.google.ar.sceneform.Camera;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.Scene;
import com.google.ar.sceneform.rendering.ModelRenderable;



public class Fourth_act extends AppCompatActivity {

    private Scene scene;
    Camera camera;
     Point point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();
        point = new Point();
        display.getRealSize(point);



        setContentView(R.layout.fourth);

        CustomArFragment arFragment =
                (CustomArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);


        scene = arFragment.getArSceneView().getScene();
        camera = scene.getCamera();

        addObjectToScene();


    }

    private void addObjectToScene() {

        ModelRenderable
                .builder()
                .setSource(this, Uri.parse("tocotoucan.sfb"))
                .build()
                .thenAccept(renderable -> {

                    for (int i = 0;i < 1;i++) {

                        Node node = new Node();
                        node.setRenderable(renderable);
                        scene.addChild(node);

                    }

                });

    }
}