package com.aytachuseynli.homeworknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aytachuseynli.homeworknavigation.databinding.FragmentMainScreenBinding
import com.aytachuseynli.homeworknavigation.databinding.FragmentScreenABinding
import com.aytachuseynli.homeworknavigation.databinding.FragmentScreenXBinding

class ScreenXFragment : Fragment() {
    private lateinit var binding: FragmentScreenXBinding
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = FragmentScreenXBinding.inflate(inflater, container, false)

            binding.btnXY.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.toScreenXY)
            }

        return binding.root
    }
}