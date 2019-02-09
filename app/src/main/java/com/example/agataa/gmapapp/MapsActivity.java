package com.example.agataa.gmapapp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


       // double[][] mapCo={{50.066935,19.916928},{50.088290,19.925359},{50.062,19.94},{50.044619, 19.968610}};
        // wydzial,mieszkanie,krakow,aptiv

        double[][] mapCo={{50.064418, 19.935806},{50.064269, 19.944427},{50.063770, 19.944438},{50.059139, 19.932080},
                {50.053141, 19.942288},{50.047481, 19.942749},{50.050179, 19.943909},{50.046964, 19.943593}}; //dla pionowych 5-->9
        // Add a marker in Sydney and move the camera
        LatLng f1 = new LatLng(mapCo[0][0],mapCo[0][1]);
        LatLng f2 = new LatLng(mapCo[1][0],mapCo[1][1]);
        LatLng f3 = new LatLng(mapCo[2][0],mapCo[2][1]);
        LatLng f4 = new LatLng(mapCo[3][0],mapCo[3][1]);
        LatLng f5 = new LatLng(mapCo[4][0],mapCo[4][1]);
        LatLng f6 = new LatLng(mapCo[5][0],mapCo[5][1]);
        LatLng f7 = new LatLng(mapCo[6][0],mapCo[6][1]);
        LatLng f8 = new LatLng(mapCo[7][0],mapCo[7][1]);

        mMap.addMarker(new MarkerOptions().position(f1).title("Kuchnia Św. Brata Alberta").snippet("ul. Reformacka 3"));
        mMap.addMarker(new MarkerOptions().position(f2).title("Wspólnota Sant'Egidio").snippet("przejście podziemne"));
        mMap.addMarker(new MarkerOptions().position(f3).title("Zupa na Plantach").snippet("przejście podziemne, PLANTY"));
        mMap.addMarker(new MarkerOptions().position(f4).title("Kuchnia Społeczna im. siostry Samueli").snippet("ul. Smoleńsk 4"));
        mMap.addMarker(new MarkerOptions().position(f5).title("Kuchnia Św. Brata Alberta").snippet("ul. Dietla 4"));
        mMap.addMarker(new MarkerOptions().position(f6).title("Przytulisko Św. Brata Alberta").snippet("ul. Skawińska 6"));
        mMap.addMarker(new MarkerOptions().position(f7).title("Punkt Pomocy").snippet("ul. Bożego Ciała 21"));
        mMap.addMarker(new MarkerOptions().position(f8).title("Punkt Pomocy Doraźnej").snippet("ul. Krakowska 47"));



       // LatLng wydzial = new LatLng(mapCo[0][0],mapCo[0][1]);
      //  LatLng mieszkanie = new LatLng(mapCo[1][0],mapCo[1][1]);
       // LatLng aptiv = new LatLng(mapCo[3][0],mapCo[3][1]);
     //   mMap.addMarker(new MarkerOptions().position(wydzial).title("WIMiIP").snippet("AGH budynek B5, ul. Czarnowiejska 66"));
      //  mMap.addMarker(new MarkerOptions().position(mieszkanie).title("mieszkanie").snippet("Krowoderskich Zuchów"));
     //   mMap.addMarker(new MarkerOptions().position(aptiv).title("aptiv").snippet("Enterprise Park, Powstańców Wielkopolskich 13"));
        // trzeba będzie zrobić jakąś pętlę, funkcję, która dostanie dostęp do bazy (na początku do jakiejś tablicy obiektów [współrzędne , nazwa, komentarz])i będzie tworzyła
        //pinezki tak długo, aż będzie z czego je robić, a nie że każda pinezka to linijka, bo się popierdzieli wszystko... DYNAMIZMU POTRZEBUJEMY! DYNAMIZMU!!!!!
        //i niech żyje zbrodniczy reżim
        //niech żyje
       // CameraPosition PositionWIMiIP = CameraPosition.builder().target(new LatLng(mapCo[2][0],mapCo[2][1])).zoom(13).bearing(0).tilt(0).build();
        //mMap.moveCamera(CameraUpdateFactory.newCameraPosition(PositionWIMiIP));

        CameraPosition PositionSmolensk = CameraPosition.builder().target(new LatLng(mapCo[3][0],mapCo[3][1])).zoom(13).bearing(0).tilt(0).build();
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(PositionSmolensk));
    }

    public void showMenu(View view) {
        Intent intent = new Intent(this, HHMenuOnlyActivity.class);
        startActivityForResult(intent, 3);
    }
}
