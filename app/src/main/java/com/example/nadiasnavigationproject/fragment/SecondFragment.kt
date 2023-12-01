package com.example.nadiasnavigationproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nadiasnavigationproject.R
import com.example.nadiasnavigationproject.data.Datasource
import com.example.nadiasnavigationproject.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var position = 0

        arguments?.let {
            position = it.getInt("position")
        }

        val contacts = Datasource().generateData()
        val item = contacts[position]

        binding.tvDetailName.text = item.name
        binding.tvDetailNumber.text = item.number
        binding.tvDetailEmail.text = item.email
    }



}