package ru.gb.lesson11.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import ru.gb.lesson11.databinding.FragmentBasicIncomeBinding;

public class BasicIncomeFragment extends Fragment {

    private BasicIncomeViewModel basicIncomeViewModel;
    private FragmentBasicIncomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        basicIncomeViewModel =
                new ViewModelProvider(this).get(BasicIncomeViewModel.class);

        binding = FragmentBasicIncomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        basicIncomeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}