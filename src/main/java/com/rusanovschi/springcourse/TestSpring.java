/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rusanovschi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author IT-0
 */
public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      
        
        ClassicalMusic firstClassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(firstClassicalMusic.getSong());
        //musicPlayer.playMusic();
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
