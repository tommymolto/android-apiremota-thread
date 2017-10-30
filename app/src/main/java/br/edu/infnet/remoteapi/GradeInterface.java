package br.edu.infnet.remoteapi;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by live.prof on 23/10/2017.
 */

public interface GradeInterface {

    @GET("/grade/{data}/grade.json")
    void retornaGrades(@Path("data") String data, Callback<Grade> retorno);
}
