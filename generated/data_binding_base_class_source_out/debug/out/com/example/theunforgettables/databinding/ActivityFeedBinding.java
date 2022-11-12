// Generated by view binder compiler. Do not edit!
package com.example.theunforgettables.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.example.theunforgettables.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFeedBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText feedbackUser;

  @NonNull
  public final LottieAnimationView feedd;

  @NonNull
  public final Button submit;

  @NonNull
  public final TextView textView10;

  private ActivityFeedBinding(@NonNull ScrollView rootView, @NonNull EditText feedbackUser,
      @NonNull LottieAnimationView feedd, @NonNull Button submit, @NonNull TextView textView10) {
    this.rootView = rootView;
    this.feedbackUser = feedbackUser;
    this.feedd = feedd;
    this.submit = submit;
    this.textView10 = textView10;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.feedback_user;
      EditText feedbackUser = ViewBindings.findChildViewById(rootView, id);
      if (feedbackUser == null) {
        break missingId;
      }

      id = R.id.feedd;
      LottieAnimationView feedd = ViewBindings.findChildViewById(rootView, id);
      if (feedd == null) {
        break missingId;
      }

      id = R.id.submit;
      Button submit = ViewBindings.findChildViewById(rootView, id);
      if (submit == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      return new ActivityFeedBinding((ScrollView) rootView, feedbackUser, feedd, submit,
          textView10);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
