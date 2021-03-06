// Generated by view binder compiler. Do not edit!
package com.example.android.uamp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.android.uamp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNowplayingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView albumArt;

  @NonNull
  public final Guideline divider;

  @NonNull
  public final TextView duration;

  @NonNull
  public final ImageButton mediaButton;

  @NonNull
  public final TextView position;

  @NonNull
  public final TextView subtitle;

  @NonNull
  public final TextView title;

  private FragmentNowplayingBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView albumArt,
      @NonNull Guideline divider, @NonNull TextView duration, @NonNull ImageButton mediaButton,
      @NonNull TextView position, @NonNull TextView subtitle, @NonNull TextView title) {
    this.rootView = rootView;
    this.albumArt = albumArt;
    this.divider = divider;
    this.duration = duration;
    this.mediaButton = mediaButton;
    this.position = position;
    this.subtitle = subtitle;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNowplayingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNowplayingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_nowplaying, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNowplayingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.albumArt;
      ImageView albumArt = rootView.findViewById(id);
      if (albumArt == null) {
        break missingId;
      }

      id = R.id.divider;
      Guideline divider = rootView.findViewById(id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.duration;
      TextView duration = rootView.findViewById(id);
      if (duration == null) {
        break missingId;
      }

      id = R.id.media_button;
      ImageButton mediaButton = rootView.findViewById(id);
      if (mediaButton == null) {
        break missingId;
      }

      id = R.id.position;
      TextView position = rootView.findViewById(id);
      if (position == null) {
        break missingId;
      }

      id = R.id.subtitle;
      TextView subtitle = rootView.findViewById(id);
      if (subtitle == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      return new FragmentNowplayingBinding((ConstraintLayout) rootView, albumArt, divider, duration,
          mediaButton, position, subtitle, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
