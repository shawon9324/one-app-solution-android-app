package com.example.oneappsolution.ui.offline;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.oneappsolution.AdapterCategories;
import com.example.oneappsolution.Categories;
import com.example.oneappsolution.LoginPage;
import com.example.oneappsolution.Calculator;
import com.example.oneappsolution.R;

import java.util.ArrayList;
import java.util.List;

public class OfflineAppsFragment extends Fragment {

    GridView gridView;
    AdapterCategories adapterCategories;
    List<Categories> categoriesList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_offline_apps, container, false);

        categoriesList = new ArrayList<>();
        gridView = root.findViewById(R.id.gridView_categories);

//        for (int i = 1; i <= 3; i++) {
            categoriesList.add(new Categories(
                    R.drawable.icons8_calculator_96px, "Calculator", null
            ));

            categoriesList.add(new Categories(
                    R.drawable.icons8_gpa_calculator_96px, "CGPA Calculator", null
            ));

            categoriesList.add(new Categories(
                    R.drawable.icons8_classroom_96px, "Class Routine", null
            ));
//        }

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String category_name = categoriesList.get(position).getCategory();

                if (category_name.equals("Calculator")) {
                    Intent intent = new Intent(getContext(), Calculator.class);
                    startActivity(intent);
                    Toast t = Toast.makeText(getActivity(), "Welcome to Calculator", Toast.LENGTH_LONG);
                    t.show();

                } else if (category_name.equals("CGPA Calculator")) {
                    //Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_meat_and_fish);
                    Toast t = Toast.makeText(getActivity(), "Welcome to CGPA Calculator", Toast.LENGTH_LONG);
                    t.show();
                } else if (category_name.equals("Class Routine")) {
                    //Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_grocery_items);
                    Toast t = Toast.makeText(getActivity(), "Welcome to Class Routine", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });

        adapterCategories = new AdapterCategories(getActivity(), categoriesList);
        gridView.setAdapter(adapterCategories);
        return root;
    }
}