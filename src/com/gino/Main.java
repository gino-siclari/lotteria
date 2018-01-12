package com.gino;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] results = new int[8];
	    for(int i = 0; i < 8;){
            results[i] = 1 + new Random().nextInt(89);
            for(int u = 0; u <= i; u++){
                if(u == i){
                    i++;
                    break;
                } else if (results[u] == results[i]) {
                    break;
                }
            }
        }

        for(int i = 0; i < 8; i++) {
            System.out.println(results[i]);
        }
    }
}
