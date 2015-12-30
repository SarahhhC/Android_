package com.project.sarahhh.datepaln;

import java.util.Arrays;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class Location extends Activity {
    int i, d = 0, num = 0;
    double latitude = 37.545888;
    double longitude = 126.971848;
    LatLng LOC = new LatLng(latitude, longitude);
    LatLng L = new LatLng(37.5, 120);

    double pp1, pp2;
    LatLng p1 = new LatLng(pp1, pp2);
    double pp3, pp4;
    LatLng p2 = new LatLng(pp3, pp4);

    LatLng a1, a2;
    GoogleMap mMap;
    MarkerOptions optFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_my);
        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        ImageButton imagebutton = (ImageButton) findViewById(R.id.b1);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LOC, 12));
        i = 0;
        d = 0;

        imagebutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.addPolyline((new PolylineOptions().add(a1, a2).width(10)
                        .color(Color.rgb(228, 167, 239)).geodesic(true)));
                double r1 = (a1.latitude + a2.latitude) / 2;
                double r2 = (a1.longitude + a2.longitude) / 2;

                double p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

                double p1a = Math.abs(r1 - 37.543849);
                double p1b = Math.abs(r2 - 126.965098);
                p1 = p1a + p1b;
                double p2a = Math.abs(r1 - 37.568087);
                double p2b = Math.abs(r2 - 126.908761);
                p2 = p2a + p2b;
                double p3a = Math.abs(r1 - 37.657176);
                double p3b = Math.abs(r2 - 127.056449);
                p3 = p3a + p3b;
                double p4a = Math.abs(r1 - 37.521570);
                double p4b = Math.abs(r2 - 127.045605);
                p4 = p4a + p4b;
                double p5a = Math.abs(r1 - 37.574385);
                double p5b = Math.abs(r2 - 127.003469);
                p5 = p5a + p5b;
                double p6a = Math.abs(r1 - 37.595622);
                double p6b = Math.abs(r2 - 127.018898);
                p6 = p6a + p6b;
                double p7a = Math.abs(r1 - 37.555510);
                double p7b = Math.abs(r2 - 126.937374);
                p7 = p7a + p7b;
                double p8a = Math.abs(r1 - 37.517101);
                double p8b = Math.abs(r2 - 126.906199);
                p8 = p8a + p8b;
                double p9a = Math.abs(r1 - 37.534710);
                double p9b = Math.abs(r2 - 126.993340);
                p9 = p9a + p9b;
                double p10a = Math.abs(r1 - 37.582229);
                double p10b = Math.abs(r2 - 127.001865);
                p10 = p10a + p10b;
                double a[] = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
                Arrays.sort(a);

                LatLng a4 = new LatLng(r1, r2);
                mMap.addMarker(new MarkerOptions().position(a4).icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                        .title("만남의장소").snippet("우리여기서만나요"));
                if (a[0] == p1)
                    setListener(Yongsan.class);
                if (a[0] == p2)
                    setListener(Mapo.class);
                if (a[0] == p3)
                    setListener(Nowon.class);
                if (a[0] == p4)
                    setListener(Kangnam.class);
                if (a[0] == p5)
                    setListener(Jongro.class);
                if (a[0] == p6)
                    setListener(Sungbook.class);
                if (a[0] == p7)
                    setListener(Shinchon.class);
                if (a[0] == p8)
                    setListener(Ydpo.class);
                if (a[0] == p9)
                    setListener(Itwon.class);
                if (a[0] == p10)
                    setListener(Deahro.class);

            }
        });

        mMap.setOnMapLongClickListener(new OnMapLongClickListener() {
            public void onMapLongClick(LatLng point) {
                while (i < 2) {
                    setMarker(point, R.drawable.girl, a1);
                    i++;
                    num = 1;
                }
                mMap.setOnMapLongClickListener(new OnMapLongClickListener() {
                    public void onMapLongClick(LatLng point) {
                        setMarker(point, R.drawable.boy, a2);
                        num = 2;
                    }
                });
            }
        });
        mMap.setOnMarkerClickListener(new OnMarkerClickListener() {

            @Override
            public boolean onMarkerClick(Marker marker) {
                while (i < 2) {
                    if (num == 1) {
                        p1 = marker.getPosition();
                        String text = "1번" + marker.getPosition();
                        Toast.makeText(getApplicationContext(), text, text.length()).show();
                    } else if (num == 2) {
                        p2 = marker.getPosition();
                        String text = "2번" + marker.getPosition();
                        Toast.makeText(getApplicationContext(), text, text.length()).show();
                    }

                }
                return false;
            }
        });

    }

    public void setListener(final Class cc) {
        mMap.setOnMarkerClickListener(new OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(Location.this, cc);
                startActivity(intent);
                return false;
            }
        });
    }

    public void setMarker(LatLng point,int draw, LatLng l) {
        mMap.addMarker(new MarkerOptions().position(point)
                .icon(BitmapDescriptorFactory.fromResource(draw)));
        l = point;
    }

}