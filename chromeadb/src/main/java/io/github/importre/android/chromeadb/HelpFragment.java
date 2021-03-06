// Copyright (c) 2014, importre. All rights reserved.
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file.

package io.github.importre.android.chromeadb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HelpFragment extends Fragment {

    public static HelpFragment newInstance() {
        return new HelpFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_help, container, false);
        setContents(view);
        return view;
    }

    private void setContents(View view) {
        TextView see = (TextView) view.findViewById(R.id.see_chromeadb);
        see.setText(Html.fromHtml(getActivity().getString(R.string.help_desc2)));
        see.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
