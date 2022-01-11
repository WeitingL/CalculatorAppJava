package com.weiting.calculatorappjava.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    EditText etvName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);

        btEnter = binding.getRoot().findViewById(R.id.bt_Enter);
        etvName = binding.getRoot().findViewById(R.id.etv_Name);

        btEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnterName(etvName)){
                    Navigation.findNavController(view).navigate(R.id.calculatorFragment);
                }else {
                    Toast.makeText(getContext(), "Please, Enter the name.", Toast.LENGTH_LONG).show();
                }
            }
        });

        return binding.getRoot();
    }

    private Boolean isEnterName (EditText editText){
        if (editText.getText() == null){
            return false;
        }else if (editText.getText().length() == 0){
            return false;
        }else {
            return true;
        }
    };
}
