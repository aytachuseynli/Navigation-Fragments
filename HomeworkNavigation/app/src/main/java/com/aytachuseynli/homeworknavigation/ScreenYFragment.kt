package com.aytachuseynli.homeworknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import com.aytachuseynli.homeworknavigation.databinding.FragmentMainScreenBinding
import com.aytachuseynli.homeworknavigation.databinding.FragmentScreenABinding
import com.aytachuseynli.homeworknavigation.databinding.FragmentScreenYBinding
import com.google.android.material.snackbar.Snackbar

class ScreenYFragment : Fragment() {
    private lateinit var binding: FragmentScreenYBinding
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

            binding = FragmentScreenYBinding.inflate(inflater, container, false)


            return binding.root
    }
}