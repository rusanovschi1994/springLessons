/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rusanovschi.springcourse;

/**
 *
 * @author IT-0
 */
public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }

    //factory-method
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doInitMethod() {
        System.out.println("Doing my initialization");
    }

    public void doDestroyMethod() {
        System.out.println("Doing my distaction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
