package com.amberfog.mapslidingtest.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class FullCountFragment extends Fragment
{
    private static final String Tag = "khang_Full: ";

    public FullCountFragment()
    {
        Log.d(Tag, "new FullCountFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View inflate = inflater.inflate(R.layout.full_count, container, false);
//        Button button = (Button) inflate.findViewById(R.id.btJump);
//        button.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(getActivity(), Main2Activity.class);
//                startActivity(intent);
//
//            }
//        });
        return inflate;
    }

    @Override
    public void onDestroyView()
    {
        Log.d(Tag + this, " onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy()
    {
        Log.d(Tag + this.toString(), " onDestroy");
        super.onDestroy();
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        Log.d(Tag + this.toString(), " onAttach");
    }
}
