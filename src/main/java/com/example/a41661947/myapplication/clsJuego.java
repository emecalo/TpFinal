package com.example.a41661947.myapplication;

import android.util.Log;

import org.cocos2d.layers.Layer;
import org.cocos2d.nodes.Director;
import org.cocos2d.nodes.Scene;
import org.cocos2d.opengl.CCGLSurfaceView;
import org.cocos2d.types.CCSize;

/**
 * Created by 41661947 on 20/9/2016.
 */
public class clsJuego {
    CCGLSurfaceView _VistaDelJuego;
    CCSize PantallaDelDispositivo;

    public clsJuego(CCGLSurfaceView VistaDelJuego) {
        Log.d("Bob", "Comienza el constructor de la clase");
        _VistaDelJuego=VistaDelJuego;

    }

    public void ComenzarJuego(){
        Log.d("Comenzar", "Comienza el juego");

        Director.sharedDirector().attachInView(_VistaDelJuego);

        PantallaDelDispositivo=Director.sharedDirector().displaySize();
        Log.d("Comenzar", "Pantalla del dispositivo - Ancho:"+PantallaDelDispositivo.width+" -Alto:"+PantallaDelDispositivo.height);

        Log.d("Comenzar", "Le digo al director que ejecute la escena");
        Director.sharedDirector().runWithScene(EscenaDelJuego());

    }

    private Scene EscenaDelJuego() {
        Log.d("EscenaDelJuego", "Comienza el armado de la escena del juego");

        Log.d("EscenaDelJuego", "Declaro e instancio la escena en si");
        Scene EscenADevolver;
        EscenADevolver=Scene.node();

        Log.d("EscenaDelJuego", "Declaro e inbstancio la capa que va a contener la imagen de fondo");
        CapaDeFondo MiCapaFondo;
        MiCapaFondo=new CapaDeFondo();

        Log.d("EscenaDelJuego", "Declaro e instancio la capa que va a contener el jugador y los enemigos");
        CapaDelFrente MiCapaFrente;
        MiCapaFrente=new CapaDelFrente();

        Log.d("EscenaDelJuego", "Agrego a la escena la capa del fondo mas atras, y la del frente mas adelante");
        EscenADevolver.addChild(MiCapaFondo, -10);
        EscenADevolver.addChild(MiCapaFrente, 10);

        Log.d("EscenaDelJuego", "Devuelvo la escena ya armada");
        return EscenADevolver;

    }


    class CapaDeFondo extends Layer {

    }

    class CapaDelFrente extends Layer {

    }


}
