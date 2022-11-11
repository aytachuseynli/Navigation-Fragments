package com.aytachuseynli.homeworknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aytachuseynli.homeworknavigation.databinding.FragmentMainScreenBinding
import com.aytachuseynli.homeworknavigation.databinding.FragmentScreenABinding

class ScreenAFragment : Fragment() {
    private lateinit var binding: FragmentScreenABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScreenABinding.inflate(inflater, container, false)

        binding.btnB.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.toScreenB)
        }
        return binding.root
    }

}