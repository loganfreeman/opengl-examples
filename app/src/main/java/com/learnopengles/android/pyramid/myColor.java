package com.learnopengles.android.pyramid;

import android.graphics.Color;

/**
 * Created by shanhong on 5/17/17.
 */

public class myColor {
    static float[] red() {
        return new float[]{
                Color.red(Color.RED) / 255f,
                Color.green(Color.RED) / 255f,
                Color.blue(Color.RED) / 255f,
                1.0f
        };
    }

    static float[] green() {
        return new float[]{
                Color.red(Color.GREEN) / 255f,
                Color.green(Color.GREEN) / 255f,
                Color.blue(Color.GREEN) / 255f,
                1.0f
        };
    }

    static float[] blue() {
        return new float[]{
                Color.red(Color.BLUE) / 255f,
                Color.green(Color.BLUE) / 255f,
                Color.blue(Color.BLUE) / 255f,
                1.0f
        };
    }

    static float[] yellow() {
        return new float[]{
                Color.red(Color.YELLOW) / 255f,
                Color.green(Color.YELLOW) / 255f,
                Color.blue(Color.YELLOW) / 255f,
                1.0f
        };
    }

    static float[] cyan() {
        return new float[]{
                Color.red(Color.CYAN) / 255f,
                Color.green(Color.CYAN) / 255f,
                Color.blue(Color.CYAN) / 255f,
                1.0f
        };
    }

    static float[] gray() {
        return new float[]{
                Color.red(Color.GRAY) / 255f,
                Color.green(Color.GRAY) / 255f,
                Color.blue(Color.GRAY) / 255f,
                1.0f
        };
    }




}