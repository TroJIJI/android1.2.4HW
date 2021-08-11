package com.example.android124hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {
    private RecyclerView recyclerView;
    private FirstAdapter firstAdapter;
    private ArrayList<Song> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRv(view);
    }

    private void createList() {
        list=new ArrayList<>();
        list.add(new Song("Eminem","Venom","1","3:13"));
        list.add(new Song("Eminem","Venom","2","3:13"));
        list.add(new Song("Eminem","Venom","3","3:13"));
        list.add(new Song("Eminem","Venom","4","3:13"));
        list.add(new Song("Eminem","Venom","5","3:13"));


    }
    private void initRv(View view) {
        recyclerView=view.findViewById(R.id.rv_main);
        firstAdapter = new FirstAdapter();
        firstAdapter.setList(list);
        recyclerView.setAdapter(firstAdapter);


    }
}