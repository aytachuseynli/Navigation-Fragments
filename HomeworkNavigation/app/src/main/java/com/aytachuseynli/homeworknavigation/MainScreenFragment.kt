package com.aytachuseynli.homeworknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aytachuseynli.homeworknavigation.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {
    private lateinit var binding: FragmentMainScreenBinding
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            binding = FragmentMainScreenBinding.inflate(inflater, container, false)
            binding.btnA.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.toScreenA)

            }

            binding.btnX.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.toScreenX)
            }

            return binding.root
    }

   }