package com.example.michelleaca.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reset_btn.setOnClickListener {
            scoreA = 0
            scoreB = 0
            displayForTeamA(scoreA)
            displayForTeamB(scoreB)
        }
    }

    var scoreA = 0
    var scoreB = 0

    //    codes for Team A

    fun threeA(view: View) {
        scoreA += 3
        displayForTeamA(scoreA)
    }

    fun twoA(view: View) {
        scoreA += 2
        displayForTeamA(scoreA)
    }

    fun freeA(view: View) {
        scoreA += 1
        displayForTeamA(scoreA)
    }

//    codes for Team B

    fun threeB(view: View) {
        scoreB += 3
        displayForTeamB(scoreB)
    }

    fun twoB(view: View) {
        scoreB += 2
        displayForTeamB(scoreB)
    }

    fun freeB(view: View) {
        scoreB += 1
        displayForTeamB(scoreB)
    }

    // defining methods
    private fun displayForTeamA(number: Int) {
        scoreA_textView.text = scoreA.toString();
    }

    private fun displayForTeamB(number: Int) {
        scoreB_textView.text = scoreB.toString();
    }

}
