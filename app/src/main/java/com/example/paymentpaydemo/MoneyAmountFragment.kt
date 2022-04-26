package com.example.paymentpaydemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.paymentpaydemo.databinding.FragmentMoneyAmountBinding

class MoneyAmountFragment : Fragment() {

    private var _binding: FragmentMoneyAmountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoneyAmountBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = MoneyAmountFragmentArgs.fromBundle(requireArguments())
        binding.textPersonName.text = args.personName

        binding.btnconfirm.setOnClickListener{
            val  amt = binding.editAmount.text.toString()
                .toFloat()
            val dir = MoneyAmountFragmentDirections.actionMoneyAmountFragmentToStatusFragment(args.personName,amt)
            findNavController().navigate(dir)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}