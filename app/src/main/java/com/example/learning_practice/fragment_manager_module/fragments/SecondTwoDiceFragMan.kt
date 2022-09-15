package com.example.learning_practice.fragment_manager_module.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learning_practice.DiceConfiguration
import com.example.learning_practice.R
import com.example.learning_practice.databinding.FragmentSecondTwoDiceFragManBinding


class SecondTwoDiceFragMan : Fragment() {
    private var diceConf: DiceConfiguration = DiceConfiguration()
    private lateinit var binding: FragmentSecondTwoDiceFragManBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second_two_dice_frag_man,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        diceConf = ViewModelProvider(requireActivity()).get(DiceConfiguration::class.java)
        lateinit var i: Array<Int>

        val img = when (diceConf.getDiceValue()[2])
        {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceManImage3.setImageResource(img)
        val img2 = when (diceConf.getDiceValue()[3])
        {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceManImage4.setImageResource(img2)

    }
}
