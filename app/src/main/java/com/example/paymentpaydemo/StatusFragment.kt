package com.example.paymentpaydemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.paymentpaydemo.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
    private var _binding: FragmentStatusBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStatusBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = StatusFragmentArgs.fromBundle(requireArguments())
        binding.textView.text = getString(R.string.status_msg,args.amount,args.personName)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}