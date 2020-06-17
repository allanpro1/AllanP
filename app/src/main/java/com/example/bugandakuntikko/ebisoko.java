package com.example.bugandakuntikko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ebisoko extends AppCompatActivity {
    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;

    List<String> ParentList= new ArrayList<>();
    {
        ParentList.add("Okulya mundago");
        ParentList.add("Okuwunya ku gwa ddyo");
        ParentList.add("Okusiyagguka");
        ParentList.add("Okugenda okulunda emobogo");
        ParentList.add("Okwetyabira akalimu obuwuka");
        ParentList.add("okwekulira embazzi kukugulu");
        ParentList.add("Okwoza ku mmunye");
        ParentList.add("Okukweka enjala");
        ParentList.add("Okuliisa ebijanjalo empiso");

        ParentList.add("Okumenya mu jjenje ekkalu");
        ParentList.add("Okwesiwa amagengere");
        ParentList.add("Okugaangatanyaekiwanga mu ngalo");
        ParentList.add("Okutema ebisiki");
        ParentList.add("Okusimba kasooli");
        ParentList.add("okujja omukono mu ngabo");
        ParentList.add("Okunyenya agaliba enjole");
        ParentList.add("Okulinnya mumusaayi");
        ParentList.add("Kinywa na mpindi");
        ParentList.add("Okweyimbamu ogwa kabugu");
        ParentList.add("Enkoko okugikwata omumwa");
        ParentList.add("Okuyisa omukka mu kisero");
        ParentList.add("Okukirira e zira kumwa");
        ParentList.add("Okufuuyira endiga omulere");
        ParentList.add("Okusiika ebinyomo");
        ParentList.add("Okufuuka omusu gw'ekanyanya");
        ParentList.add("Okukaabya omuntu akayirigombe");
        ParentList.add("Okukuba obulatti");
        ParentList.add("Ekintu okuba nga n'owemindi asena");
        ParentList.add("Olubuto okuba mu mannyo");
        ParentList.add("Olubuto okuba mu mumugongo");
        ParentList.add("Okukotakoota mu ga lumonde");
        ParentList.add("Okugenda ekaganga");







    }
    String[]planetName = {
            "Kitegeeza kuyimba"

    };

    String[]monthName = {
            "kulya"
    };

    String[]P = {
            "Kutambula"
    };

    String[] x = {
            "Kufa"
    };

    String[]a={
            "Kweretera bizibu"
    };

    String[]b ={
            "Kweretera mitawaana"
    };
    String[]c = {
           "Kukaaba"
    };

    String[]d = {
            "Kulwana"
    };


    String[]e = {
            "Okukola ekintu nga ogayaala"
    };


    String[]jjenje = {
            "Okukola ekintu ekyangu"
    };

    String[]ssiwa = {
            "Okunywa omwenge"
    };
    String[]kwebaka = {
            "Kwebaka"
    };
    String[]siki= {
            "Kwebaka"
    };
    String[]ok = {
            "Kutambula"
    };

    String[]tip = {
            "Kufa"
    };

    String[]ko = {
            "Kuzina"
    };
    String[]lin = {
           " Kuwerekera muntu"
    };

    String[] pin = {
            "Ekintu okuba okumpi ennyo"
    };

    String[]enkoko = {
            "Kueera"
    };

    String[]sero ={
            "Okukola ekintu ekyangu"
    };
    String[]mwa = {
            "kufa"
    };
    String[]ndiga = {
            "Okukola ekintu ekitagasa"
    };

String[] binyomo = {
        "Okukola ekintu ekitalina mugaso"
};

String[]kanyanya = {
        "Okubula"
};
String[] aka={
        "okumubonyabonya"
};
String[]lati= {
        "kusanyuka"
};
String[]mindi ={
    "ekintu okuba nga kingi nnyo"
    };
String[]mannyo= {
        "kiteggeza kukkuta nnyo"
};


String[]njala= {
        "Enjala okuba nga ekuluma"
};

String[]lumonde={
        "Okukola ekintu nga tekigasa"
};

String[] iok={
        "Kufa"
};
    String[]defaultName = {
            "wano wakyakolebwako"
    };
    String[]ob ={
            "Okwetuga"
    };



    @Override
    protected void  onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_engero);


        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList){
            if (HoldItem.equals("Okulya mundago")){
                LoadChild(planetName);
            } else if (HoldItem.equals("Okuwunya ku gwa ddyo")){
                LoadChild(monthName);
            } else if (HoldItem.equals("Okusiyagguka")){
                LoadChild(P);
            } else if (HoldItem.equals("Okugenda okulunda emobogo")){
                LoadChild(x);
            } else if (HoldItem.equals("Okwetyabira akalimu obuwuka")){
                LoadChild(a);
            } else  if (HoldItem.equals("okwekulira embazzi kukugulu")){
                LoadChild(b);
            } else if (HoldItem.equals("Okwoza ku mmunye")){
                LoadChild(c);
            } else if (HoldItem.equals("Okukweka enjala")){
                LoadChild(d);
            } else if (HoldItem.equals("Okuliisa ebijanjalo empiso")){
                LoadChild(e);
            } else  if (HoldItem.equals("Okumenya mu jjenje ekkalu")){
                LoadChild(jjenje);
            } else  if (HoldItem.equals("Okwesiwa amagengere")){
                LoadChild(ssiwa);
            } else if (HoldItem.equals("Okugaangatanyaekiwanga mu ngalo")){
                LoadChild(kwebaka);
            }  else if (HoldItem.equals("Okutema ebisiki")){
                LoadChild(siki);
            } else if (HoldItem.equals("Okusimba kasooli")){
                LoadChild(ok);
            } else  if (HoldItem.equals("okujja omukono mu ngabo")){
                LoadChild(tip);
            } else if (HoldItem.equals("Okunyenya agaliba enjole")){
                LoadChild(ko);
            } else if (HoldItem.equals("Okulinnya mumusaayi")){
                LoadChild(lin);
            } else if (HoldItem.equals("Kinywa na mpindi")){
                LoadChild(pin);
            } else if (HoldItem.equals("Okweyimbamu ogwa kabugu")){
                LoadChild(ob);
            } else if (HoldItem.equals("Enkoko okugikwata omumwa")){
                LoadChild(enkoko);
            } else if (HoldItem.equals("Okuyisa omukka mu kisero")){
                LoadChild(sero);
            } else if (HoldItem.equals("Okukirira e zira kumwa")){
                LoadChild(mwa);
            } else if (HoldItem.equals("Okufuuyira endiga omulere")){
                LoadChild(ndiga);
            } else if (HoldItem.equals("Okusiika ebinyomo")){
                LoadChild(binyomo);
            } else  if(HoldItem.equals("Okufuuka omusu gw'ekanyanya")){
                LoadChild(kanyanya);
            } else  if (HoldItem.equals("Okukaabya omuntu akayirigombe")){
                LoadChild(aka);
            } else if (HoldItem.equals("Okukuba obulatti")){
                LoadChild(lati);
            } else if (HoldItem.equals("Ekintu okuba nga n'owemindi asena")){
                LoadChild(mindi);
            } else if (HoldItem.equals("Olubuto okuba mu mannyo")){
                LoadChild(mannyo);
            } else if (HoldItem.equals("Olubuto okuba mu mumugongo")){
                LoadChild(njala);
            } else if (HoldItem.equals("Okukotakoota mu ga lumonde")){
                LoadChild(lumonde);
            } else if (HoldItem.equals("Okugenda ekaganga")){
                LoadChild(iok);
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

