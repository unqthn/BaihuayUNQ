package com.example.you.baihuayunq;

import java.util.Random;

/**
 * Created by You on 22/10/2559.
 */
public class Huay {
    private int num2;
    private int num3;
    Random n = new Random();
    public  String getRandomTwoDigits(){
        num2 = n.nextInt(100);

        if(num2 < 10){
            return "0"+num2;
        }
        return ""+num2;
    }
    public  String getRandomThreeDigits(){
        num3 = n.nextInt(1000);

        if(num3 < 10){
            return "00"+num3;
        }
        else if(num3 < 100){
            return "0"+num3;
        }
        return ""+num3;
    }

}
