package com.eyehunts.androidsaveinstancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putString("f_name", f_name_et.text.toString())
        //savedInstanceState.putString("l_name", l_name_et.text.toString())

        savedInstanceState.putBoolean("cb_value", checkBox.isChecked)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        //get value
        val fn = savedInstanceState.getString("f_name")
        //val ln  = savedInstanceState.getString("l_name")

        val cb = savedInstanceState.getBoolean("cb_value")

        //set value to UI
        f_name_et.setText(fn)
        //l_name_et.setText(ln)
        checkBox.isChecked = cb

    }
}
