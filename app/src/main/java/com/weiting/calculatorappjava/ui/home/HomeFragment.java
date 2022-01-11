package com.weiting.calculatorappjava.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBinding;

import com.weiting.calculatorappjava.R;
import com.weiting.calculatorappjava.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    ViewBinding binding;
    Button btEnter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);

        btEnter = binding.getRoot().findViewById(R.id.bt_Enter);
        btEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.calculatorFragment);
            }
        });



        return binding.getRoot();
    }
}
