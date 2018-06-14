/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.hamid.cmr3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class AllThreeFragment extends Fragment {
int find=HelpAdapter.f;

    public AllThreeFragment() {
        // Required empty public constructor
    }
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
  switch (find)
  {
      case 0:    rootView=Tech(inflater,container);
                 break;
      case 1:   rootView=Coord(inflater,container);
      break;
      case  2: rootView=Facult(inflater,container);
  }

        return rootView;
    }

    private View Tech(LayoutInflater inflt,ViewGroup contan){

    rootView = inflt.inflate(R.layout.word_list, contan, false);
        // Create a list of contacts
        final ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Abdul1","Bca","111",R.drawable.e_4));
        contacts.add(new Contact("Abdul2", "Mca","112",
                R.drawable.e_5));
        contacts.add(new Contact("Abdul3", "Bba","113",
                R.drawable.e_6));

        ContactAdapter adapter = new ContactAdapter(getActivity(), contacts, R.color.colorPrimaryDark);
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
    ListView listView;
    private View Coord(LayoutInflater inflt,ViewGroup contan){

        rootView = inflt.inflate(R.layout.word_list, contan, false);
        // Create a list of contacts
        final ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("hamid1","Bca","121",R.drawable.e_4));
        contacts.add(new Contact("Hamid2", "Mca","122",
                R.drawable.e_5));
        contacts.add(new Contact("Hamid3", "Bbm","123",
                R.drawable.e_6));

        ContactAdapter adapter = new ContactAdapter(getActivity(), contacts, R.color.colorPrimaryDark);
        // word_list.xml layout file.
         listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
    private View Facult(LayoutInflater inflt,ViewGroup contan){

        rootView = inflt.inflate(R.layout.word_list, contan, false);
        // Create a list of contacts
        final ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Reza1","Mca","131", R.drawable.e_4));
        contacts.add(new Contact("Reza2", "Bca","132",
                R.drawable.e_5));
        contacts.add(new Contact("Reza3", "Bbm","133",
                R.drawable.e_6));

        ContactAdapter adapter = new ContactAdapter(getActivity(), contacts, R.color.colorPrimaryDark);
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}

