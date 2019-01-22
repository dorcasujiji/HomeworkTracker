package com.example.homeworktracker;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AddHomeworkFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AddHomeworkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddHomeworkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AddHomeworkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddHomeworkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddHomeworkFragment newInstance(String param1, String param2) {
        AddHomeworkFragment fragment = new AddHomeworkFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_homework, container, false);

        Button button = (Button) view.findViewById(R.id.finalAddButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  TODO: implement addHomework functionality in method
                addHomework();
            }
        });

        // populate spinners with courses and frequency
        populateSpinners(view);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void setOnFragmentInteractionListener(Activity activity) {
        mListener = (OnFragmentInteractionListener) activity;
    }

    private void addHomework() {
        getFragmentManager().popBackStack();
    }

    private void populateSpinners(View view) {
        // load course spinner
        Spinner courseSpinner = view.findViewById(R.id.courseSpinner);
        ArrayAdapter<CharSequence> courseArrayAdapter = ArrayAdapter.createFromResource(view.getContext(),
                R.array.list_courses,
                android.R.layout.simple_spinner_item);
        courseArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseSpinner.setAdapter(courseArrayAdapter);

        // load homework frequency spinner
        Spinner freqSpinner = view.findViewById(R.id.freqSpinner);
        ArrayAdapter<CharSequence> hwFreqArrayAdapter = ArrayAdapter.createFromResource(view.getContext(),
                R.array.homework_frequency,
                android.R.layout.simple_spinner_item);
        hwFreqArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        freqSpinner.setAdapter(hwFreqArrayAdapter);
    }
}
