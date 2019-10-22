package com.ics.Schoolbook.Ui.FeesModule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

import com.ics.Schoolbook.R

class FeeFragment : Fragment() {
    internal lateinit var Feetext: TextView
    internal var Simple: String? = null
    internal var nonsip: Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.feefragment, container, false)
        Feetext = view.findViewById(R.id.feetext)
        Feetext.setText("Fee Goes Here")
        return view
        //        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
