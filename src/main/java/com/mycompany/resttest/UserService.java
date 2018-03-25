/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resttest;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 *
 * @author nahlik2
 */
public interface UserService {
    
    @GET("/users?page=2")
    Call<List<Data>> getAllUsers();
    
    @POST("/users")
    Call<User> createNewUser(@Body User user);
    
    @GET("/users/{id}")
    Call<User> getSingleUser(@Path("id") int id);
    
    @PUT("/users/{id}")
    Call<User> updateUser(@Path("id") int id,@Body User user);
    
    @PATCH("/users/{id}")
    Call<User> patchUser(@Path("id") int id,@Body User user);
    
    @DELETE("/users/{id}")
    Call<User> deleteUser(@Path("id") int id);
    
    @GET("/api/unknown")
    Call<List<Resources>> getAllResources();
    
    @GET("/api/unknown/{id}")
    Call<SingleResource> getSingleResource(@Path("id") int id);
    
    
}
