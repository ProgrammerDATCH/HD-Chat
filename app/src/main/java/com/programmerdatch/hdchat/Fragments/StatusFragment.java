package com.programmerdatch.hdchat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.programmerdatch.hdchat.Models.Adapter.GroupAdapter;
import com.programmerdatch.hdchat.Models.Users;
import com.programmerdatch.hdchat.databinding.FragmentStatusBinding;

import java.util.ArrayList;

public class StatusFragment extends Fragment {


    public StatusFragment() {
        // Required empty public constructor
    }

    FragmentStatusBinding binding;
    ArrayList<Users> groupList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentStatusBinding.inflate(inflater, container,false);

        GroupAdapter adapter = new GroupAdapter(groupList, getContext());
        binding.groupRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.groupRecyclerView.setLayoutManager(layoutManager);


        Users groups =new Users("Group Chat", "group@gmail.com", "group");
        groupList.add(groups);
        adapter.notifyDataSetChanged();


        return binding.getRoot();
        // Inflate the layout for this fragment
    }
}