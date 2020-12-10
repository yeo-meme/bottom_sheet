package com.nalazoocare.bottomsheet;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.nalazoocare.bottomsheet.databinding.BottomSheetBinding;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-09-02
 */
public class FullBottomSheetDialogFragment extends BottomSheetDialogFragment {

    BottomSheetBinding b;
    private BottomSheetBehavior mBehavior;



    @Override
    public void onStart() {
        super.onStart();
//        Dialog dialog = getDialog();
//        if ( dialog != null) {
//            int width = ViewGroup.LayoutParams.MATCH_PARENT;
//            int height = ViewGroup.LayoutParams.MATCH_PARENT;
//            dialog.getWindow().setLayout(width,height);
//        }
//        mBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);


        View view = View.inflate(getContext(), R.layout.bottom_sheet, null);

        LinearLayout linearLayout = view.findViewById(R.id.root);
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
       params.height = getScreenHeight();
       linearLayout.setLayoutParams(params);

       dialog.setContentView(view);
       mBehavior = BottomSheetBehavior.from((View) view.getParent());
        return dialog;
    }

    private static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }


}
