/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resttest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author nahlik2
 */
public class UserDemo {
    
    public static void main(String[] args){
        
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://private-7fa33-reqres1.apiary-mock.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

        UserService service = retrofit.create(UserService.class);
        
        //zoznam userov
        try{
            Response<List<Data>> execute = service.getAllUsers().execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"LIST ALL USERS " +  execute.body().toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //vytvorenie nove usera
        User user = new User();
        user.setAvatar("avatar");
        user.setFirstName("firstName");
        user.setId(2);
        user.setLastName("lastName");       
        service.createNewUser(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> rspns) {
               Logger.getGlobal().log(Level.INFO,"CREATE NEW USER " + rspns.body().toString());
            }

            @Override
            public void onFailure(Call<User> call, Throwable thrwbl) {
                Logger.getGlobal().log(Level.SEVERE, thrwbl.toString());
            }
        });
        
        //ziskanie jedneho usera
        try{
            Response<User> execute = service.getSingleUser(2).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"GET SINGLE USER " +  execute.body().toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //pokus o ziskanie neexistujuceho usera
        try{
            Response<User> execute = service.getSingleUser(23).execute();
            Logger.getGlobal().log(Level.INFO,"SINGLE USER NOT FOUND " +  execute.toString());
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //update usera
        user = new User();
        user.setAvatar("avatar");
        user.setFirstName("firstName");
        user.setLastName("lastName");  
        try{
            Response<User> execute = service.updateUser(2,user).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"UPDATE USER " +  execute.body().toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //patch usera
        try{
            Response<User> execute = service.patchUser(2,user).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"PATCH USER " +  execute.body().toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //vymazanie usera
        try{
        Response<User> execute = service.deleteUser(2).execute();
        if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"DELETE USER " + execute.toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //ziskanie vsetkych resource
        try{
            Response<List<Resources>> execute = service.getAllResources().execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"LIST ALL RESOURCES " +  execute.body().toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //ziskanie jedneho resource
        try{
            Response<SingleResource> execute = service.getSingleResource(2).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,"GET SINGLE RESOURCE " +  execute.body().toString());
            }
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
        //pokus o ziskanie neexistujuceho resource
        try{
            Response<SingleResource> execute = service.getSingleResource(23).execute();
            Logger.getGlobal().log(Level.INFO,"RESOURCE NOT FOUND " +  execute.toString());
        }catch(IOException e){
            Logger.getGlobal().log(Level.SEVERE, e.toString());
        }
        
    }
    
}

