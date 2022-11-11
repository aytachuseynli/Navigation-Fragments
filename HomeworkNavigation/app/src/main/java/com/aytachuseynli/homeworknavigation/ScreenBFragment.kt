package com.aytachuseynli.homeworknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aytachuseynli.homeworknavigation.databinding.FragmentScreenBBinding

class ScreenBFragment : Fragment() {
    private lateinit var binding: FragmentScreenBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScreenBBinding.inflate(inflater, container, false)

        binding.btnBY.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.toScreenBY)
        }

        return binding.root
    }

}