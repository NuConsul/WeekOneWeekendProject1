package com.chemwater.weekoneweekendproject;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView ;
import android.widget.Button ;
import android.view.View ;
import android.widget.GridLayout ;

public class MainActivity extends Activity {

    TextView tvOne, tvTwo ;


    Button bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine ;
    Button bZero, bPlus, bMinus,bMultiply, bDivide, bClear, bEqual, bPeriod ;

    String tvOneString = "" ;
    String tvTwoString = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvOne = (TextView) findViewById(R.id.first_view) ;
        tvTwo = (TextView) findViewById(R.id.second_view) ;

        bOne = (Button) findViewById(R.id.number_one) ;
        bTwo = (Button) findViewById(R.id.number_two) ;
        bThree = (Button) findViewById(R.id.number_three) ;
        bFour = (Button) findViewById(R.id.number_four) ;
        bFive = (Button) findViewById(R.id.number_five) ;
        bSix = (Button) findViewById(R.id.number_six) ;
        bSeven = (Button) findViewById(R.id.number_seven) ;
        bEight = (Button) findViewById(R.id.number_eight) ;
        bNine = (Button) findViewById(R.id.number_nine) ;
        bZero = (Button) findViewById(R.id.number_zero) ;
        bPlus = (Button) findViewById(R.id.plus_button) ;
        bMinus = (Button) findViewById(R.id.minus_button) ;
        bMultiply = (Button) findViewById(R.id.multiply_button) ;
        bDivide = (Button) findViewById(R.id.divide_button) ;
        bEqual = (Button) findViewById(R.id.equal_button) ;
        bClear = (Button) findViewById(R.id.clear_button) ;
        bPeriod = (Button) findViewById(R.id.period_button) ;

        //tvOne.setText(tvOneString) ;
        //tvTwo.setText(tvTwoString) ;
    }





    public void onOneClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "1") ;
    }

    public void onTwoClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "2") ;
    }

    public void onThreeClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "3") ;
    }

    public void onFourClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "4") ;
    }

    public void onFiveClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "5") ;
    }

    public void onSixClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "6") ;
    }

    public void onSevenClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "7") ;
    }

    public void onEightClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "8") ;
    }

    public void onNineClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "9") ;
    }

    public void onZeroClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "0") ;
    }

    public void onPeriodClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + ".") ;
    }

    public void onClearClicked(View view) {
        tvOne.setText(tvOneString = "") ;
    }

    public void onPlusClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "+") ;
    }

    public void onMinusClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "-") ;
    }

    public void onMultiplyClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "*") ;
    }

    public void onDivideClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "/") ;
    }

    public void onEqualClicked(View view) {
        tvOne.setText(tvOneString = tvOneString + "=") ;

    }







    public void onSineClicked(View view) {

    }

    public void onCosineClicked(View view) {

    }

    public void onTangentClicked(View view) {

    }

    public void onNaturalLogarithmClicked(View view) {

    }

    public void onLogarithmClicked(View view) {

    }

    public void onRadianClicked(View view) {

    }

    public void onSquaredClicked(View view) {

    }

    public void onCubedClicked(View view) {

    }

    public void onFactorialClicked(View view) {

    }

    public void onReciprocal(View view) {

    }

}









/*
-Create a calculator app to perform all the standard calculator operations
 like addition, subtraction, multiplication, divide etc.

-No edittexts

-Changing the orientation to landscape(layout qualifier)
 will display now functionality (Scientific calculator)

-Hint: Create all buttons using Relative/Grid Layout and append the
 values to the TextView. Show the result in a separate TextView.
 */