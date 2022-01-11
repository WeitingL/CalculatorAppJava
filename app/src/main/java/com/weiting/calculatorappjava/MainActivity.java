package com.weiting.calculatorappjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.weiting.calculatorappjava.databinding.ActivityMainBinding;
import com.weiting.calculatorappjava.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    ViewBinding binding;
    NavController navController;
    NavHostFragment navHostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_container);

        assert navHostFragment != null;
        navController = navHostFragment.getNavController();

    }
}