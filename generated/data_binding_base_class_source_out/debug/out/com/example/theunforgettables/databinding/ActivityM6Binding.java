// Generated by view binder compiler. Do not edit!
package com.example.theunforgettables.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.theunforgettables.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityM6Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final WebView m6;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  private ActivityM6Binding(@NonNull ScrollView rootView, @NonNull EditText editTextTextPersonName,
      @NonNull WebView m6, @NonNull TextView textView, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.editTextTextPersonName = editTextTextPersonName;
    this.m6 = m6;
    this.textView = textView;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityM6Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityM6Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_m6, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityM6Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.m6;
      WebView m6 = ViewBindings.findChildViewById(rootView, id);
      if (m6 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivityM6Binding((ScrollView) rootView, editTextTextPersonName, m6, textView,
          textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
