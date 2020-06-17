package com.example.bugandakuntikko;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SearchView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class  engero extends AppCompatActivity{
    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;

List<String> ParentList= new ArrayList<>();
    private Object Menu;

    {
       ParentList.add("Atanayita yita");
       ParentList.add("kange");
        ParentList.add("Nyini mufu");
        ParentList.add("Gwosussa emwanyi");



    }
String[]planetName = {
            "y'atenda nnyina okufumba. Lutuyigiriza obuteyibalanga."

};

    String[]monthName = {
            "kakira kaffe. olugero luno lutuyigiriza okwekolerera"
    };

    String[]P = {
            "Y'akwata ewawunya. lutuyigiriza okwekwatirangamu mumirimu"
    };

String[] x = {
        "Omusanga mitala nga awungula.  Lutuyigiriza obutanyooma oba okusosola abantu"
};

    String[]defaultName = {
            "wanyo wakyakolebwako"
    };
    @Override
    protected void  onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_engero);


ParentListItems = new LinkedHashMap<>();
for (String HoldItem : ParentList){
 if (HoldItem.equals("Atanayita yita")){
    LoadChild(planetName);
 } else if (HoldItem.equals("kange")){
     LoadChild(monthName);
 } else if (HoldItem.equals("Nyini mufu")){
     LoadChild(P);
 } else if (HoldItem.equals("Gwosussa emwanyi")){
     LoadChild(x);
 }
 else
     LoadChild(defaultName);
 ParentListItems.put(HoldItem, ChildList);
}

expandableListView = findViewById(R.id.expandListView);
final ExpandableListAdapter expandableListAdapter = new ListAdapter(this, ParentList, ParentListItems);
expandableListView.setAdapter(expandableListAdapter);


    }

    private void LoadChild(String[] ParentElementName) {
     ChildList = new ArrayList<>();
        Collections.addAll(ChildList, ParentElementName);



    }
}

