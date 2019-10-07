package com.example.face_maker_hansenk20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;

import java.util.Random;

//@author Kori Hansen

public class Face extends SurfaceView implements View.OnClickListener, SeekBar.OnSeekBarChangeListener{

    public int skinColor;
    public int eyeColor;
    public int hairColor;
    public int hairStyle;
    public Paint paint = new Paint();
    public Random random = new Random();
    public int green;
    public int red;
    public int blue;


    public Face(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);

    }

    private Face faced;

//    //public SeekBarListener(Face face)
//    {
//        faced = face;
//    }
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){

        //faced.setSize(progress);

    }

    public void onStartTrackingTouch(SeekBar seekBar){



    }

    public void onStopTrackingTouch(SeekBar seekBar){



    }


    public void randomize()
    {
        green = random.nextInt(255);
        red = random.nextInt(255);
        blue = random.nextInt(255);

    }

    public void onClick(View v)
    {
        randomize();
    }

    public void onDraw(Canvas canvas)
    {
        paint.setStrokeWidth(5.0f);
        drawFace(canvas);
        drawEyes(canvas);
    }

    public void drawFace(Canvas face)
    {
        paint.setColor(Color.YELLOW);
        face.drawOval(100, 75, 1100, 1225, paint);
        paint.setColor(Color.BLACK);
        face.drawOval(300,900,900,1100,paint);
        face.drawOval(550, 625, 600,725,paint);
        face.drawOval(650, 625, 700, 725,paint);
    }

    public void drawEyes(Canvas eyes)
    {
        paint.setColor(Color.WHITE);
        eyes.drawOval(400, 300, 570, 470, paint);
        eyes.drawOval(700, 300, 870, 470, paint);
        randomize();
        //onClick();
        paint.setARGB(255, red, green, blue);
        eyes.drawOval(420, 320, 550, 450, paint);
        eyes.drawOval(720, 320, 850, 450, paint);
        paint.setColor(Color.BLACK);
        eyes.drawOval(450, 350, 520, 420, paint);
        eyes.drawOval(750, 350, 820, 420, paint);

    }
}
