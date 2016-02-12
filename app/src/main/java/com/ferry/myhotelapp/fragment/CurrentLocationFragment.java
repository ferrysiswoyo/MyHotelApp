package com.ferry.myhotelapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ferry.myhotelapp.DetailHotelActivity;
import com.ferry.myhotelapp.R;
import com.ferry.myhotelapp.adapter.HotelAdapter;
import com.ferry.myhotelapp.model.HotelItem;

import java.util.ArrayList;

public class CurrentLocationFragment extends Fragment {
    private ListView lvItem;

    private String[][] hotelItems = new String[][]{
            {"The Sunset Hotel & Restaurant","Dewi Sri Street, Kuta, Bali, Indonesia", "3", "Hotel Sunset Bali terletak di lokasi yang sangat strategis dan jauh dari kemacetan. Hotel di Bali ini hanya 15 menit dari Bandara Internasional Ngurah Rai dan 10 menit ke Kuta pusat perbelanjaan. Perjalanan dan pengaturan wisata di Bali dapat dipesan di Receptionist.",
                    "-8.707861", "115.179319", "http://cdn01.tiket.photos/img/business/t/h/business-the-sunset-hotel-amp-restaurant-hotel--5423.picture415x295.jpg"
            },{
                "Spazzio Bali Hotel", "Dewi Sri Street, No 20", "3",
                "Hotel Spazzio adalah akomodasi 3-bintang yang terletak di Jl Dewi Sri Kuta, 15 menit berkendara dari Bandara Internasional Bali, 5 menit berkendara ke Seminyak & daerah Legian.",
                "-8.8571081", "115.6668904", "http://cdn01.tiket.photos/img/business/s/p/business-spazziobalihotel-hotel-3152.picture415x295.jpg"
            },{
                "The One Legian (formerly The 101 Hotel Legian)", "Jl. Legian No. 117, Badung, Bali, Indonesia", "4",
                "Voted as a Indonesia Leading Lifestyle Hotel by Indonesia Travel Tourism Awards 2014 and Bali Leading Lifestyle Hotel by Bali Tourism Awards 2015, The ONE Legian is committed to be the center of BALI, LIFESTYLE and BEYOND which offers ONE STOP Kuta-Legian Experience, a self Contain Hotel in the milieu of Kuta. The “ONE” Legian is inspired from the Spirit of Sunrise or Matahari Pagi, as beginning of Fresh.",
                "-8.714047", "115.17375", "http://cdn01.tiket.photos/img/business/t/h/business-theonelegianformerlythe1o1balilegian-hotel-6046.picture525x375.jpg"
            }
    };
    private ArrayList<HotelItem> listHotelItem;

    public CurrentLocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_current_location, container, false);
        lvItem = (ListView)view.findViewById(R.id.lv_item);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        listHotelItem = new ArrayList<>();
        HotelItem hotelItem = null;
        for (int i=0; i < hotelItems.length; i++){
            hotelItem = new HotelItem();
            hotelItem.setName(hotelItems[i][0]);
            hotelItem.setAddress(hotelItems[i][1]);
            hotelItem.setStar(hotelItems[i][2]);
            hotelItem.setDescription(hotelItems[i][3]);
            hotelItem.setLatitude(hotelItems[i][4]);
            hotelItem.setLongitude(hotelItems[i][5]);
            hotelItem.setImage(hotelItems[i][6]);
            listHotelItem.add(hotelItem);
        }

        HotelAdapter adapter = new HotelAdapter(getActivity(), listHotelItem);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetailHotelActivity.toDetailHotelActivity(getActivity(), listHotelItem.get(position));
            }
        });
    }

}
