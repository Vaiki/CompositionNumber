package com.vaiki.compositionnumber.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vaiki.compositionnumber.R
import com.vaiki.compositionnumber.databinding.FragmentChooseLevelBinding
import com.vaiki.compositionnumber.domain.entity.Level

class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLevelTest.setOnClickListener { launchGame(Level.TEST) }
        binding.buttonLevelEasy.setOnClickListener { launchGame(Level.EASY) }
        binding.buttonLevelNormal.setOnClickListener { launchGame(Level.NORMAL) }
        binding.buttonLevelHard.setOnClickListener { launchGame(Level.HARD) }
    }

    private fun launchGame(level: Level) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, GameFragment.newInstance(level))
            .addToBackStack(GameFragment.NAME)
            .commit()
    }

    companion object {

        const val NAME = "ChooseLevelFragment"

        fun newInstance(): ChooseLevelFragment = ChooseLevelFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}