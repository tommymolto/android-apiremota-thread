package br.edu.infnet.remoteapi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    public ImageView iv;
    public Bitmap bm;
    public String carretafuracao = "https://img.ibxk.com.br/2016/04/11/11175001772413.jpg?w=1040";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       this.iv = (ImageView) findViewById(R.id.imgV);
    }

    public void desceImagem(View v){
        new DownloadTask().execute();
    }
    public class DownloadTask extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            iv.setImageBitmap(bitmap);
        }

        @Override
        protected Bitmap doInBackground(String... URL) {

            try{
                InputStream is = new java.net.URL(carretafuracao).openStream();
                bm = BitmapFactory.decodeStream(is);
            }catch (Exception e){
                Log.e("Erro", e.toString());
            }
            return bm;
        }
    }
}
