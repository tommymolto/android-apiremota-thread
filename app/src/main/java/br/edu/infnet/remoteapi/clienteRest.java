package br.edu.infnet.remoteapi;

import retrofit2.Retrofit;

/**
 * Created by live.prof on 23/10/2017.
 */

public class clienteRest {
    private static final String urlGrade = "http://redeglobo.globo.com/programacao";
    private static GradeInterface gi;

    public static GradeInterface getInstance(){
        if(gi == null){
            Retrofit adaptador = new Retrofit
                    .Builder()
                    .baseUrl(urlGrade).build();
            gi = adaptador.create(GradeInterface.class);
        }
        return gi;
    }
}
