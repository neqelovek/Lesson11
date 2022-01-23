package ru.gb.lesson11.ui.additionalExpenses;


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

import ru.gb.lesson11.databinding.FragmentAdditionalExpensesBinding;


public class AdditionalExpensesFragment extends Fragment {

    private AdditionalExpensesViewModel AdditionalExpensesViewModel;
    private FragmentAdditionalExpensesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AdditionalExpensesViewModel =
                new ViewModelProvider(this).get(AdditionalExpensesViewModel.class);

        binding = FragmentAdditionalExpensesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAdditionalExpenses;
        AdditionalExpensesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
