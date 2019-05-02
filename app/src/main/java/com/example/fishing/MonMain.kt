package com.example.fishing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_ma_layout.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.email
import org.jetbrains.anko.share
import org.jetbrains.anko.startActivity


class MonMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ma_layout)


        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        //§§§§§§§§§  ENVOYER UN MAIL                §§§§§§§§§§§
        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§



        gridEmailView.setOnClickListener({ email("chpaqou@gmail.com", "coucou, je suis un test", "je suis le corps du mail, Amen.") })


        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        //§§§§§§§§§  OUVRIR UNE PAGE WEB             §§§§§§§§§§
        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§



        val url = "http://www.lequipe.fr"

        gridUrl.setOnClickListener({browse(url,true)})


        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        //§PARTAGER UNE IMAGE AFICHÉE DANS MA VIEW ACTUELLE  §§
        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§

        GridPartage.setOnClickListener({share("PARTAGE DE MA PREMIER IMAGE","test partage d'image")})



        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        //§§    RECUPÉRER UNE IMAGE DEPUIS L'API DE BIBI     §§
        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§


        //Quelle fonction utiliser ???

        //                          Besoin d'initialiser le serveur MICROSOFT de ****** et réaliser un GET ???



        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        //§§           OUVRIR UNE NOUVELLE ACTIVITY          §§
        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§

/*
        ouverture de l'activity Contraint Layout perso,
        une nouvelle fenêtre en quelque sorte'
*/


        GridImage.setOnClickListener({startActivity<com.example.fishing.Contraint_Activity>()})









    }


}
